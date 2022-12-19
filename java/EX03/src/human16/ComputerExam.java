package human16;

public class ComputerExam {

	public static void main(String[] args) {
		Desktop dt = new Desktop();
		dt.turnOn();
		dt.display();
		dt.typing();
		dt.turnOff();
		
		Notebook nb = new MyNotebook();
		nb.turnOn();
		nb.display();
		nb.typing();
		nb.turnOff();
		
		MyNotebook mb = (MyNotebook) nb;
		mb.turnOn();
		mb.display();
		mb.typing();
		mb.turnOff();
	}
	

}
