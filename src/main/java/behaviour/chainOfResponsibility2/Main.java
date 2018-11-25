package behaviour.chainOfResponsibility2;

import behaviour.chainOfResponsibility2.config.PlanetEnum;
import behaviour.chainOfResponsibility2.config.PlanetHandler;
import behaviour.chainOfResponsibility2.planet.EarthHandler;
import behaviour.chainOfResponsibility2.planet.MercuryHandler;
import behaviour.chainOfResponsibility2.planet.VenusHandler;

public class Main {
    public static void main(String[] args) {
        PlanetHandler chain = setUpChain();

        chain.handleRequest(PlanetEnum.VENUS);
        chain.handleRequest(PlanetEnum.MERCURY);
        chain.handleRequest(PlanetEnum.EARTH);
        chain.handleRequest(PlanetEnum.JUPITER);
    }

    public static PlanetHandler setUpChain() {
        PlanetHandler mercuryHandler = new MercuryHandler();
        PlanetHandler venusHandler = new VenusHandler();
        PlanetHandler earthHandler = new EarthHandler();

        mercuryHandler.setSuccessor(venusHandler);
        venusHandler.setSuccessor(earthHandler);

        return mercuryHandler;
    }

}
