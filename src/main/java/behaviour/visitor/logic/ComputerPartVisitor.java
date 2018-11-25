package behaviour.visitor.logic;

import behaviour.visitor.Computer;
import behaviour.visitor.parts.Keyboard;
import behaviour.visitor.parts.Monitor;
import behaviour.visitor.parts.Mouse;

public interface ComputerPartVisitor {
     void visit(Computer computer);
     void visit(Mouse mouse);
     void visit(Keyboard keyboard);
     void visit(Monitor monitor);
}
