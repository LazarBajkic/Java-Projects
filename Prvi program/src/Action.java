public class Action implements Fight,Flee{

	public void attack() {
	System.out.println("*You attack and with one fell swoop,you kill the bandit and proceed on your journey*");
}
	public void miss() {
		System.out.println("*You miss and is forced to handover some of your coins to save your own skin*");
	}
}
