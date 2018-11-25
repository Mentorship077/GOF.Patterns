package behaviour.chainOfResponsibility2.planet;

import behaviour.chainOfResponsibility2.config.PlanetEnum;
import behaviour.chainOfResponsibility2.config.PlanetHandler;

public class VenusHandler extends PlanetHandler {

    public void handleRequest(PlanetEnum request) {
        if (request == PlanetEnum.VENUS) {
            System.out.println("VenusHandler handles " + request);
            System.out.println("Venus is poisonous.\n");
        } else {
            System.out.println("VenusHandler doesn't handle " + request);
            if (successor != null) {
                successor.handleRequest(request);
            }
        }
    }
}
