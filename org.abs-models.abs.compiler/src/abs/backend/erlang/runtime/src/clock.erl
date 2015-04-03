%%This file is licensed under the terms of the Modified BSD License.

%%This is a counter to keep track of simulated time.  The timed
%%semantics work without it but having now() in ABS is useful.  Global
%%time is also necessary to calculate the next deployment component
%%update barrier (distance_to_next_boundary/0).

-module(clock).
-behaviour(gen_server).
-export([start_link/0,stop/0,advance/1,now/0,distance_to_next_boundary/0]).
-export([code_change/3,handle_call/3,handle_cast/2,handle_info/2,init/1,terminate/2]).
-record(state,{now}).

%% Interface
start_link() ->
    gen_server:start_link({local, clock}, ?MODULE, [], []).

stop() ->
    gen_server:call(?MODULE, stop).

advance(Amount) ->
    gen_server:call(?MODULE, {advance, Amount}).

now() ->
    gen_server:call(?MODULE, now).

distance_to_next_boundary() ->
    gen_server:call(?MODULE, next_int).

%% gen_server functions

init([]) ->
    {ok, #state{now=rationals:to_r(0)}}.

handle_call({advance, Amount},_From,State=#state{now=Time}) ->
    {reply, ok,
     State#state{now=rationals:add(rationals:to_r(Time), rationals:to_r(Amount))}};
handle_call(now, _From, State=#state{now=Time}) ->
    {reply, Time, State};
handle_call(next_int, _From, State=#state{now=Time}) ->
    Distance = rationals:sub(Time, rationals:to_r(rationals:trunc(Time))),
    case Distance of
        {0, _} -> {reply, {1,1}, State};
        _ -> {reply, Distance, State}
    end;
handle_call(stop, _From, State) ->
    {stop, normal, stopped, State}.

handle_cast(_Msg,State) ->
    {noreply, State}.

handle_info(_Info,State) ->
    {noreply, State}.

terminate(_Reason,_State) ->
    ok.

code_change(_OldVsn,State,_Extra) ->
    {ok, State}.

