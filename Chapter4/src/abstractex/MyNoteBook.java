package abstractex;

public class MyNoteBook extends Notebook {

	@Override
	public void display() {
		System.out.println("MyNotebook display");
	}

	@Override
	public void turnOn() {
		System.out.println("MyNoteBook turnOn");
	}
	
	@Override
	public void typing() {
		System.out.println("MyNoteBook typing");
	}
	

	@Override
	public void turnOff() {
		System.out.println("MyNoteBook turnOff");
	}

}
