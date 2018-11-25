package behaviour.visitor.parts;

import behaviour.visitor.logic.ComputerPartVisitor;

public interface ComputerPart {
    void accept(ComputerPartVisitor computerPartVisitor);
}
