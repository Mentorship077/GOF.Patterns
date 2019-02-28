package behaviour.state.state;

import behaviour.state.State;
import behaviour.state.model.Player;

public class StopState implements State {

    public void doAction(Player context) {
        System.out.println("Player is in stop state");
        context.setState(this);
    }

    public String toString() {
        return "Stop State";
    }
}