package behaviour.observer.example1;

@FunctionalInterface
public interface Channel {
    void update(Object o);
}
