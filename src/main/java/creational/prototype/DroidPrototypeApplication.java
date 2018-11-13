package creational.prototype;


import creational.commonModel.AbstractDroid;

/**
 * Created  on 19.07.17.
 */
public class DroidPrototypeApplication {
    public static void main(String[] args) throws CloneNotSupportedException {
        AbstractDroid abstractDroid1 = DroidCache.getDroids("1");
        AbstractDroid abstractDroid2 = DroidCache.getDroids("2");
        System.out.printf("Droid 1 : %s , Droid2 : %s", abstractDroid1.getType(), abstractDroid2.getType());
    }
}
