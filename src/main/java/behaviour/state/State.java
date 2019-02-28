package behaviour.state;

import behaviour.state.model.Player;

public interface State {
    public void doAction(Player context);
}
