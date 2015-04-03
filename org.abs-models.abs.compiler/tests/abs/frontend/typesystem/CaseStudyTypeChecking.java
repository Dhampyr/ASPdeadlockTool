/** 
 * Copyright (c) 2009-2011, The HATS Consortium. All rights reserved. 
 * This file is licensed under the terms of the Modified BSD License.
 */
package abs.frontend.typesystem;

import static abs.ABSTest.Config.TYPE_CHECK;
import static abs.ABSTest.Config.WITH_STD_LIB;
import static org.junit.Assert.*;
import static org.junit.Assume.*;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import abs.frontend.FrontendTest;
import abs.frontend.analyser.SemanticError;
import abs.frontend.analyser.SemanticErrorList;
import abs.frontend.ast.Model;
import abs.frontend.parser.Main;

@RunWith(Parameterized.class)
public class CaseStudyTypeChecking extends FrontendTest {

    // default relative path to https://repos.hats-project.eu:444/svn/hats/CaseStudies/models
    /**
     * Use a property to be able to point JUnit in the right direction and override the default:
     * the first one is from HATS and may become outdated; the 2nd from the ENVISAGE project
     * within our ABS repo.
     */
    private static String CASESTUDY_DIR = System.getProperty("abs.junit.casestudies", "../../../../CaseStudies/models/");
    private static String ENVISAGE_DIR = System.getProperty("abs.junit.envisage", "../examples/");

    @Parameters(name="{0}")
    public static Collection<?> data() {
        final Object[][] data = new Object[][] { { CASESTUDY_DIR + "fredhopper/replication/abs" }
                                               , { CASESTUDY_DIR + "fredhopper/replication/abs-single/annual-meeting-2011" }
                                               , { CASESTUDY_DIR + "fredhopper/replication/abs-single/annual-meeting-2011-async" }
                                               , { CASESTUDY_DIR + "tradingsystem"}
                                               , { CASESTUDY_DIR + "vof"}
                                               , { ENVISAGE_DIR + "T4.3/D4.3.1" }
                                               /* Individual models: */
                                               , { ENVISAGE_DIR + "T4.2/D4.2.1/Indexing.abs" }
                                               , { ENVISAGE_DIR + "T4.2/D4.2.1/Crawling.abs" }
                                               , { ENVISAGE_DIR + "T4.2/D4.2.1/MapReduce.abs" }
                                               , { ENVISAGE_DIR + "T4.2/D4.2.1/Downloading.abs" }
                                               };
        return Arrays.asList(data);
    }

    final private String input;
    protected Model m;

    public CaseStudyTypeChecking(String input) {
        this.input = input;
    }

    @Test
    public void test() throws Exception {
        File srcFolderF = new File(input);
        assumeTrue(srcFolderF.exists());
        m = assertParseFilesOk(input, TYPE_CHECK, WITH_STD_LIB);
    }

    protected Model assertParseFilesOk(String srcFolder, Config... config) throws IOException {
        File srcFolderF = new File(srcFolder);
        assertTrue(srcFolder,srcFolderF.exists());
        Main main = new Main();
        main.setWithStdLib(isSet(WITH_STD_LIB,config));
        Model m = main.parseFiles(findAbsFiles(srcFolderF).toArray(new String[0]));

        if (m != null) {
            if (m.hasParserErrors())
                Assert.fail(m.getParserErrors().get(0).getMessage());
            int numSemErrs = m.getErrors().size();
            StringBuffer errs = new StringBuffer("Semantic errors: " + numSemErrs + "\n");
            if (numSemErrs > 0) {
                for (SemanticError error : m.getErrors())
                    errs = errs.append(error.getHelpMessage() + "\n");
                fail("Failed to parse: " + srcFolder + "\n" + errs.toString());
            } else if (isSet(TYPE_CHECK, config)) {
                SemanticErrorList l = m.typeCheck();
                if (!l.isEmpty()) {
                    for (SemanticError error : l)
                        errs = errs.append(error.getHelpMessage() + "\n");
                    fail("Failed to typecheck: " + srcFolder + "\n" + errs.toString());
                }
            }
        }
        return m;
    }

    private List<String> findAbsFiles(File srcFolder) {
        List<String> result = new java.util.LinkedList<String>();
        if (srcFolder.exists() && !srcFolder.isDirectory()) {
            assertTrue(srcFolder.getName().endsWith(".abs"));
            result.add(srcFolder.getAbsolutePath());
        } else {
            for (File f : srcFolder.listFiles()) {
                if (f.isDirectory()) {
                    result.addAll(findAbsFiles(f));
                } else if (f.getName().endsWith(".abs")) {
                    result.add(f.getAbsolutePath());
                }
            }
        }
        return result;
    }
}
