package behaviour.chainOfResponsibility2.planet;

import behaviour.chainOfResponsibility2.config.PlanetEnum;
import behaviour.chainOfResponsibility2.config.PlanetHandler;

public class EarthHandler extends PlanetHandler {

    public void handleRequest(PlanetEnum request) {
        if (request == PlanetEnum.EARTH) {
            System.out.println("EarthHandler handles " + request);
            System.out.println("Earth is comfortable.\n");
        } else {
            System.out.println("EarthHandler doesn't handle " + request);
            if (successor != null) {
                successor.handleRequest(request);
            }
        }
    }
}
