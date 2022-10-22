import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
		System.out.println("Hello brave warrior!,the game you just entered is my first project");
		System.out.println("To choose an option just press 1 for yes,and 2 for no");
		System.out.println("Would you like to some music?,if you would like to play some music press 5,if not then press 6");
		Scanner music=new Scanner(System.in);
		File file=new File("Pray.wav");
		AudioInputStream audiostream=AudioSystem.getAudioInputStream(file);
		Clip clip=AudioSystem.getClip();
		clip.open(audiostream);
		int response=music.nextInt();
		if(response==5) {
			clip.start();
		}
		else if (response==6){
			clip.stop();
		}
		System.out.println("Lets start off by picking your class");
		Scanner Scanner=new Scanner(System.in);
		Rogue rogue=new Rogue();
		Paladin paladin=new Paladin();
		Assassin assassin=new Assassin();
		Mage mage=new Mage();
		System.out.println("Enter a number to choose your class!");
		System.out.println("Your options are:1.Rogue,2.Paladin,3.Assassin,4.Mage");
		int x=Scanner.nextInt();
		
	if(x==1) {
		System.out.println("You chose the Rogue class");
		System.out.println("here are your stats: ");
		System.out.println("attack: "+rogue.attack1);
		System.out.println("speed: " +rogue.speed1);
		System.out.println("health: "+rogue.health1);
		System.out.println("defence: "+rogue.defence1);
	}
	else if(x==2) {
		System.out.println("You chose the Paladin class");
		System.out.println("Here are your stats: ");
		System.out.println("attack: "+paladin.attack2);
		System.out.println("speed: " +paladin.speed2);
		System.out.println("health: "+paladin.health2);
		System.out.println("defence: "+paladin.defence2);
	}
	else if(x==3) {
		System.out.println("You chose the Assassin class");
		System.out.println("Here are your stats: ");
		 System.out.println("attack: "+assassin.attack3);
		    System.out.println("speed: " +assassin.speed3);
		    System.out.println("health: "+assassin.health3);
		    System.out.println("defence: "+assassin.defence3);
	}
	else if(x==4) {
		System.out.println("You chose the Mage class");
		System.out.println("Here are your stats: ");
		 System.out.println("attack: "+mage.attack4);
		    System.out.println("speed: " +mage.speed4);
		    System.out.println("health: "+mage.health4);
		    System.out.println("defence: "+mage.defence4);
	}
		System.out.println("Now that you have choosen your class,let us begin our quest");
		System.out.println("*As you walk through the woods,you stumble upon a bandit itching for a brawl*");
		Bandit bandit = new Bandit();
		System.out.println(bandit.speak);
		System.out.println("*You draw out your weapon and roll the dice*");
		Action action=new Action();
		Random random=new Random();
		int j=random.nextInt(6)+1;
		System.out.println(j);
		if(j<=3) {
			action.miss();
		}
		else {
			action.attack();
		}
		System.out.println("*As you venture further down the road you reach a village,would you like to go to the village or proceed forward?*");
		Scanner scanner=new Scanner(System.in);
		int y=scanner.nextInt();
				Villager villager=new Villager();
		if(y==1) {
			System.out.println("*you enter the village*,as you are walking around a villager notices you and asks for your help");
		System.out.println(villager.help);
		System.out.println("What shall you do brave knight?");
		int k=scanner.nextInt();
		if (k==1) {
			System.out.println("*You accept and get going*");
		}
			else if(k==2) {
				System.out.println("*You deny the quest and get going*");
			}
		}
		else if(y==2){
			System.out.println("*you skip the village and go on*");
		}
		System.out.println("*You find a cave and enter,you find lots of riches,however you also find a dragon guarding it*");
		System.out.println("Puny human,you stand no chance against my might!");
		System.out.println("*you draw your weapon and roll the dice*");
		int u=random.nextInt(6)+1;
		System.out.println(u);
		if(u>3) {
			System.out.println("*After a long battle,you slay the dragon and the riches are yours!*");
		}
		else {
			System.out.println("*You are burnt to a crisp and meet a grizzly end.*");
		}
		System.out.println("*The end*");
		
	}	
}
