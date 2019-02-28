package behaviour.state.model;

import behaviour.state.State;

public class Player {
    private State state;

    public Player(){
        state = null;
    }

    public void setState(State state){
        this.state = state;
    }

    public State getState(){
        return state;
    }
}
