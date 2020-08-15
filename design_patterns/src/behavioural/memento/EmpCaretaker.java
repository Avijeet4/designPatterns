package behavioural.memento;

import java.util.ArrayDeque;
import java.util.Deque;

public class EmpCaretaker {
	 final Deque<EmpMemento> empMementos=new ArrayDeque<EmpMemento>();
	 public EmpMemento getLastMemento() {
		 return empMementos.pop();
	 }
	 public void addMemento(EmpMemento empMemento) {
		 empMementos.push(empMemento);
	 }
}
