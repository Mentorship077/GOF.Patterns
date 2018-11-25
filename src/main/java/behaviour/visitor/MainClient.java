package behaviour.visitor;

import behaviour.visitor.logic.ComputerPartDisplayVisitor;
import behaviour.visitor.parts.ComputerPart;

public class MainClient {
    public static void main(String[] args) {
        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
