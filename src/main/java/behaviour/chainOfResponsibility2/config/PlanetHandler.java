package behaviour.chainOfResponsibility2.config;

public abstract class PlanetHandler {
    protected PlanetHandler successor;

    public void setSuccessor(PlanetHandler successor) {
        this.successor = successor;
    }

    public abstract void handleRequest(PlanetEnum request);

}
