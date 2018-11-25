package behaviour.state;

import behaviour.state.model.Context;
import behaviour.state.state.StartState;
import behaviour.state.state.StopState;

public class MainClient {
    public static void main(String[] args) {
        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);

        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);

        System.out.println(context.getState().toString());
    }
}
