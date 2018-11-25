package behaviour.iterator2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RedHead implements Iterable<RedHead> {
    private Set<RedHead> redHeads = new HashSet<RedHead>();

    public void add(final RedHead redHead) {
        redHeads.add(redHead);
    }
    @Override
    public Iterator<RedHead> iterator() {
        return redHeads.iterator();
    }
}
