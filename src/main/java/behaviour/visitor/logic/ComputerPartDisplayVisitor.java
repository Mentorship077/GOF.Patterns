package behaviour.visitor.logic;

import behaviour.visitor.Computer;
import behaviour.visitor.parts.Keyboard;
import behaviour.visitor.parts.Monitor;
import behaviour.visitor.parts.Mouse;

public class ComputerPartDisplayVisitor implements ComputerPartVisitor {

    @Override
    public void visit(Computer computer) {
        System.out.println("Displaying Computer.");
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("Displaying Mouse.");
    }

    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("Displaying Keyboard.");
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("Displaying Monitor.");
    }
}