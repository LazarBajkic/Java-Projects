package Practice;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    
		Scanner in=new Scanner(System.in);
		
		System.out.println("HELLO AND WELCOME");
		System.out.println("Today you will be picking your pirate crew!");
		System.out.println("You will be choosing beetween 4 diffrent crews,this is a blind pick so you get what you get,to choose simply press a number beetween 1 and 5");
		
		String[] beasts={"Kaido","Who's who","King","Queen","Jack"};
		beasts [0]="Kaido";
		beasts [1]="Who's who";
		beasts [2]="King";
		beasts [3]="Queen";
		beasts [4]="Jack";
		System.out.println("Lets start you off,choose a number beetween 1 and 5 and see who you got: ");
		int x=in.nextInt();
		if(x==1) {
			System.out.println(beasts[0]);
			System.out.println("Congratulations you chose the captain of the beasts,Kaido!");
		}
		else if (x==2) {
			System.out.println(beasts[1]);
		System.out.println("You chose Who's who!");
	}
	else if (x==3) {
		System.out.println(beasts[2]);
		System.out.println("You chose an All-star,King!");
	}
	else if(x==4) {	
		System.out.println(beasts[3]);
		System.out.println("You chose an All-star,Queen!");
	}
	else if(x==5) {
		System.out.println(beasts[4]);
		System.out.println("You chose an All-star,Jack!");
	}
		System.out.println("Now that we chose your first memeber lets pick the second one,same choice style: ");
		String[] bigmom= {"Charlote Smoothie","Charlote Daifuku","Charlote Oven","Charlote Cracker","Charlote Katakuri"};
		bigmom[0]="Charlote Smoothie";
		bigmom[1]="Charlote Daifuku";
		bigmom[2]="Charlote Oven";
		bigmom[3]="Charlote Cracker";
		bigmom[4]="Charlote Katakuri";
		int y=in.nextInt();
		if(y==1) {
			System.out.println(bigmom[0]);
			System.out.println("Congratulations you chose a sweet commander,Charlote Smoothie!");
		}
		else if (y==2) {
			System.out.println(bigmom[1]);
		System.out.println("You chose the minister of beans,Charlotte Daifuku");
	}
	else if (y==3) {
		System.out.println(bigmom[2]);
		System.out.println("You chose the minister of baking,Charlotte Oven");
	}
	else if(y==4) {	
		System.out.println(bigmom[3]);
		System.out.println("Congratulations you chose a sweet commander,Charlotte Cracker");
	}
	else if(y==5) {
		System.out.println(bigmom[4]);
		System.out.println("Congratulations you chose a sweet commander,Charlotte Katakuri");
	}
		System.out.println("The next pick is not gonna be a yonko crew,wanna know which crew it is?,pick a number: ");
	String[] donquixote={"Baby 5","Trebol","Diamante","Donquixote Doflamingo","Vergo"};
	donquixote[0]="Baby 5";
	donquixote[1]="Trebol";
	donquixote[2]="Diamante";
	donquixote[3]="Donquixote Doflamingo";
	donquixote[4]="Vergo";
	int c=in.nextInt();
	if(c==1) {
		System.out.println(donquixote[0]);
		System.out.println("Congratulations you chose an assasin,Baby 5");
	}
	else if (c==2) {
		System.out.println(donquixote[1]);
	System.out.println("You chose a top officer,Trebol");
}
else if (c==3) {
	System.out.println(donquixote[2]);
	System.out.println("You chose a top officer,Diamante");
}
else if(c==4) {	
	System.out.println(donquixote[3]);
	System.out.println("Congratulations you chose the captain himself,Donquixote Doflamingo!");
}
else if(c==5) {
	System.out.println(donquixote[4]);
	System.out.println("You chose an elite officer,Vergo");
}
	System.out.println("Next up is the crew of the man capable of destroying the world");
	String[] wb={"Edward Newgate","Vista","Marco","Jozu","Portgas D Ace"};
	wb[0]="Edward Newgate";
	wb[1]="Vista";
	wb[2]="Marco";
	wb[3]="Jozu";
	wb[4]="Portgas D Ace";
	int b=in.nextInt();
	if(b==1) {
		System.out.println(wb[0]);
		System.out.println("Congratulations you chose the captain of the crew,the worlds strongest man,'Whitebeard' Edward Newgate!");
	}
	else if (b==2) {
		System.out.println(wb[1]);
	System.out.println("You chose the commander of the 5th division,Vista 'Of the flower swords'");
}
else if (b==3) {
	System.out.println(wb[2]);
	System.out.println("You chose the commander of the 1st division,'Phoenix' Marco");
}
else if(b==4) {	
	System.out.println(wb[3]);
	System.out.println("You chose the commander of the 3rd division,'Diamond' Jozu");
}
else if(b==5) {
	System.out.println(wb[4]);
	System.out.println("You chose the commander of the 2nd division,'Fire fist' Portgas D Ace");
}
	System.out.println("You have chosen your crew!");
	}
    
}

