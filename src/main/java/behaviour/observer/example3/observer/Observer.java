package behaviour.observer.example3.observer;

import behaviour.observer.example3.Subject;

public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
