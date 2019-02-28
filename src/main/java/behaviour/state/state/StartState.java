package behaviour.state.state;

import behaviour.state.State;
import behaviour.state.model.Player;

public class StartState implements State {

    @Override
    public void doAction(Player context) {
        System.out.println("Player is in start state");
        context.setState(this);
    }

    public String toString(){
        return "Start State";
    }
}
