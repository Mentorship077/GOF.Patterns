package behaviour.state;

import behaviour.state.model.Context;

public interface State {
    public void doAction(Context context);
}
