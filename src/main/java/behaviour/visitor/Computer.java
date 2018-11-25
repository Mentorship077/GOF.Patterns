package behaviour.visitor;

import behaviour.visitor.logic.ComputerPartVisitor;
import behaviour.visitor.parts.ComputerPart;
import behaviour.visitor.parts.Keyboard;
import behaviour.visitor.parts.Monitor;
import behaviour.visitor.parts.Mouse;

import java.util.ArrayList;
import java.util.List;

public class Computer implements ComputerPart {

    private List<ComputerPart> parts;

    public Computer(){
        parts = new ArrayList<>();
        parts.add(new Mouse());
        parts.add(new Keyboard());
        parts.add(new Monitor());
    }

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        for (ComputerPart part : parts) {
            part.accept(computerPartVisitor);
        }
        computerPartVisitor.visit(this);
    }

}
