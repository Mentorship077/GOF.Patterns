package creational.prototype;

import creational.commonModel.AbstractDroid;
import creational.commonModel.BiologicalDroid;
import creational.commonModel.MedicalDroid;

import java.util.HashMap;

/**
 * Created  on 19.07.17.
 */
public class DroidCache {
    private static HashMap<String, AbstractDroid> droidsMap = new HashMap<String, AbstractDroid>();

    static {
        droidsMap.put("1", new BiologicalDroid());
        droidsMap.put("2", new MedicalDroid());
    }

    public static AbstractDroid getDroids(String droidId) throws CloneNotSupportedException {
        AbstractDroid droids = droidsMap.get(droidId);
        return (AbstractDroid) droids.clone();
    }
}
