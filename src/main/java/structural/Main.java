package structural;

import structural.proxy.Image;
import structural.proxy.ProxyImage;

public class Main {

    public static void main(String[] args) {
        Image image = new ProxyImage("image.jpg");

        image.displayImage();
        System.out.println("\n");
        image.displayImage();
    }
}
