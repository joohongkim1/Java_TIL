package template_use;

public class PlayerTest {
	
	public static void main(String[] args) {
		
		Player p1 = new Player();
		p1.play(1);
		
		Intermediate aLevel = new Intermediate();
		p1.upgradeLevel(aLevel);
		p1.play(2);
		
		Advanced sLevel = new Advanced();
		p1.upgradeLevel(sLevel);
		p1.play(3);
	}
}
