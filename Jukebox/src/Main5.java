
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Main5 {

	public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException  {
		// TODO Auto-generated method stub
				
		Scanner s=new Scanner(System.in);
		
		/*NAPOMENA:Stavio sam loop zbog limitranog broja promena pesme,jos uvek nisam siguran kako da ga stavim na neograniceno!
		potrudicu se da to dodam jednog dana kad skontam kako.*/
		
		System.out.print("\n Ovo je dzuboks,da izaberes pesmu samo otkucaj njen redni broj!");
		System.out.println("\n Pesma ce se vrteti u krug dok ne uneses novi izbor pesme!");
		System.out.println("\n 1.PowerTrip by Boom Kitty \n 2.HALVA by uamee \n 3.IL-76 by uamee \n 4.Barracuda by Noisestorm \n 5.Move out by MK2");
		
		File file1=new File("PowerTrip.wav");
		AudioInputStream audiostream1=AudioSystem.getAudioInputStream(file1);
		Clip clip1=AudioSystem.getClip();
		clip1.open(audiostream1);
		
		File file2=new File("uamee - HALVA.wav");
		AudioInputStream audiostream2=AudioSystem.getAudioInputStream(file2);
		Clip clip2=AudioSystem.getClip();
		clip2.open(audiostream2);
		
		File file3=new File("uamee-IL-76.wav");
		AudioInputStream audiostream3=AudioSystem.getAudioInputStream(file3);
		Clip clip3=AudioSystem.getClip();
		clip3.open(audiostream3);
		
		File file4=new File("Barracuda.wav");
		AudioInputStream audiostream4=AudioSystem.getAudioInputStream(file4);
		Clip clip4=AudioSystem.getClip();
		clip4.open(audiostream4);
		
		File file5=new File("Move out.wav");
		AudioInputStream audiostream5=AudioSystem.getAudioInputStream(file5);
		Clip clip5=AudioSystem.getClip();
		clip5.open(audiostream5);
		
		int response1=s.nextInt();
		switch(response1){
		case 1: clip1.start();
		clip1.loop(clip1.LOOP_CONTINUOUSLY);
		break;
		case 2: clip2.start();
		clip2.loop(clip2.LOOP_CONTINUOUSLY);
		break;
		case 3: clip3.start();
		clip3.loop(clip3.LOOP_CONTINUOUSLY);
		break;
		case 4:clip4.start();
		clip4.loop(clip4.LOOP_CONTINUOUSLY);
		break;
		case 5:clip5.start();
		clip5.loop(clip5.LOOP_CONTINUOUSLY);
		break;
		}
		
		clip1.setMicrosecondPosition(0);
		clip2.setMicrosecondPosition(0);
		clip3.setMicrosecondPosition(0);
		clip4.setMicrosecondPosition(0);
		clip5.setMicrosecondPosition(0);
		
		int response2=s.nextInt();
		switch(response2){
		case 1: clip1.start();
		clip1.loop(clip1.LOOP_CONTINUOUSLY);
		clip2.stop();
		clip3.stop();
		clip4.stop();
		clip5.stop();
		break;
		case 2: clip2.start();
		clip2.loop(clip2.LOOP_CONTINUOUSLY);
		clip3.stop();
		clip1.stop();
		clip4.stop();
		clip5.stop();
		break;
		case 3: clip3.start();
		clip3.loop(clip3.LOOP_CONTINUOUSLY);
		clip2.stop();
		clip1.stop();
		clip4.stop();
		clip5.stop();
		break;
		case 4:clip4.start();
		clip4.loop(clip4.LOOP_CONTINUOUSLY);
		clip1.stop();
		clip2.stop();
		clip3.stop();
		clip5.stop();
		break;
		case 5:clip5.start();
		clip5.loop(clip5.LOOP_CONTINUOUSLY);
		clip1.stop();
		clip2.stop();
		clip3.stop();
		clip4.stop();
		break;
		case 0:clip1.stop();
		clip2.stop();
		clip3.stop();
		clip4.stop();
		clip5.stop();
		break;
		}
		
		clip1.setMicrosecondPosition(0);
		clip2.setMicrosecondPosition(0);
		clip3.setMicrosecondPosition(0);
		clip4.setMicrosecondPosition(0);
		clip5.setMicrosecondPosition(0);
		
		int response3=s.nextInt();
		switch(response3){
		case 1: clip1.start();
		clip1.loop(clip1.LOOP_CONTINUOUSLY);
		clip2.stop();
		clip3.stop();
		clip4.stop();
		clip5.stop();
		break;
		case 2: clip2.start();
		clip2.loop(clip2.LOOP_CONTINUOUSLY);
		clip1.stop();
		clip3.stop();
		clip4.stop();
		clip5.stop();
		break;
		case 3: clip3.start();
		clip3.loop(clip3.LOOP_CONTINUOUSLY);
		clip2.stop();
		clip1.stop();
		clip4.stop();
		clip5.stop();
		break;
		case 4:clip4.start();
		clip4.loop(clip4.LOOP_CONTINUOUSLY);
		clip1.stop();
		clip2.stop();
		clip3.stop();
		clip5.stop();
		break;
		case 5:clip5.start();
		clip5.loop(clip5.LOOP_CONTINUOUSLY);
		clip1.stop();
		clip2.stop();
		clip3.stop();
		clip4.stop();
		break;
		case 0:clip1.stop();
		clip2.stop();
		clip3.stop();
		clip4.stop();
		clip5.stop();
		break;		
		}
		
		clip1.setMicrosecondPosition(0);
		clip2.setMicrosecondPosition(0);
		clip3.setMicrosecondPosition(0);
		clip4.setMicrosecondPosition(0);
		clip5.setMicrosecondPosition(0);
		
		int response4=s.nextInt();
		switch(response4){
		case 1: clip1.start();
		clip1.loop(clip1.LOOP_CONTINUOUSLY);
		clip2.stop();
		clip3.stop();
		clip4.stop();
		clip5.stop();
		break;
		case 2: clip2.start();
		clip2.loop(clip2.LOOP_CONTINUOUSLY);
		clip1.stop();
		clip3.stop();
		clip4.stop();
		clip5.stop();
		break;
		case 3: clip3.start();
		clip3.loop(clip3.LOOP_CONTINUOUSLY);
		clip2.stop();
		clip1.stop();
		clip4.stop();
		clip5.stop();
		break;
		case 4:clip4.start();
		clip4.loop(clip4.LOOP_CONTINUOUSLY);
		clip1.stop();
		clip2.stop();
		clip3.stop();
		clip5.stop();
		break;
		case 5:clip5.start();
		clip5.loop(clip5.LOOP_CONTINUOUSLY);
		clip1.stop();
		clip2.stop();
		clip3.stop();
		clip4.stop();
		break;
		case 0:clip1.stop();
		clip2.stop();
		clip3.stop();
		clip4.stop();
		clip5.stop();
		break;
		}
		
		clip1.setMicrosecondPosition(0);
		clip2.setMicrosecondPosition(0);
		clip3.setMicrosecondPosition(0);
		clip4.setMicrosecondPosition(0);
		clip5.setMicrosecondPosition(0);
		
		int response5=s.nextInt();
		switch(response5){
		case 1: clip1.start();
		clip1.loop(clip1.LOOP_CONTINUOUSLY);
		clip2.stop();
		clip3.stop();
		clip4.stop();
		clip5.stop();
		break;
		case 2: clip2.start();
		clip2.loop(clip2.LOOP_CONTINUOUSLY);
		clip3.stop();
		clip1.stop();
		clip4.stop();
		clip5.stop();
		break;
		case 3: clip3.start();
		clip3.loop(clip3.LOOP_CONTINUOUSLY);
		clip2.stop();
		clip1.stop();
		clip4.stop();
		clip5.stop();
		break;
		case 4:clip4.start();
		clip4.loop(clip4.LOOP_CONTINUOUSLY);
		clip1.stop();
		clip2.stop();
		clip3.stop();
		clip5.stop();
		break;
		case 5:clip5.start();
		clip5.loop(clip5.LOOP_CONTINUOUSLY);
		clip1.stop();
		clip2.stop();
		clip3.stop();
		clip4.stop();
		break;
		case 0:clip1.stop();
		clip2.stop();
		clip3.stop();
		clip4.stop();
		clip5.stop();
		break;
		}
		
		clip1.setMicrosecondPosition(0);
		clip2.setMicrosecondPosition(0);
		clip3.setMicrosecondPosition(0);
		clip4.setMicrosecondPosition(0);
		clip5.setMicrosecondPosition(0);
		
		int response6=s.nextInt();
		switch(response6){
		case 1: clip1.start();
		clip1.loop(clip1.LOOP_CONTINUOUSLY);
		clip2.stop();
		clip3.stop();
		clip4.stop();
		clip5.stop();
		break;
		case 2: clip2.start();
		clip2.loop(clip2.LOOP_CONTINUOUSLY);
		clip1.stop();
		clip3.stop();
		clip4.stop();
		clip5.stop();
		break;
		case 3: clip3.start();
		clip3.loop(clip3.LOOP_CONTINUOUSLY);
		clip2.stop();
		clip1.stop();
		clip4.stop();
		clip5.stop();
		break;
		case 4:clip4.start();
		clip4.loop(clip4.LOOP_CONTINUOUSLY);
		clip1.stop();
		clip2.stop();
		clip3.stop();
		clip5.stop();
		break;
		case 5:clip5.start();
		clip5.loop(clip5.LOOP_CONTINUOUSLY);
		clip1.stop();
		clip2.stop();
		clip3.stop();
		clip4.stop();
		break;
		case 0:clip1.stop();
		clip2.stop();
		clip3.stop();
		clip4.stop();
		clip5.stop();
		break;
		}
		
		clip1.setMicrosecondPosition(0);
		clip2.setMicrosecondPosition(0);
		clip3.setMicrosecondPosition(0);
		clip4.setMicrosecondPosition(0);
		clip5.setMicrosecondPosition(0);
	
		int response7=s.nextInt();
		switch(response7){
		case 1: clip1.start();
		clip1.loop(clip1.LOOP_CONTINUOUSLY);
		clip2.stop();
		clip3.stop();
		clip4.stop();
		clip5.stop();
		break;
		case 2: clip2.start();
		clip2.loop(clip2.LOOP_CONTINUOUSLY);
		clip1.stop();
		clip3.stop();
		clip4.stop();
		clip5.stop();
		break;
		case 3: clip3.start();
		clip3.loop(clip3.LOOP_CONTINUOUSLY);
		clip2.stop();
		clip1.stop();
		clip4.stop();
		clip5.stop();
		break;
		case 4:clip4.start();
		clip4.loop(clip4.LOOP_CONTINUOUSLY);
		clip1.stop();
		clip2.stop();
		clip3.stop();
		clip5.stop();
		break;
		case 5:clip5.start();
		clip5.loop(clip5.LOOP_CONTINUOUSLY);
		clip1.stop();
		clip2.stop();
		clip3.stop();
		clip4.stop();
		break;
		case 0:clip1.stop();
		clip2.stop();
		clip3.stop();
		clip4.stop();
		clip5.stop();
		break;
		}
		
		clip1.setMicrosecondPosition(0);
		clip2.setMicrosecondPosition(0);
		clip3.setMicrosecondPosition(0);
		clip4.setMicrosecondPosition(0);
		clip5.setMicrosecondPosition(0);
		
		int response8=s.nextInt();
		switch(response8){
		case 1: clip1.start();
		clip1.loop(clip1.LOOP_CONTINUOUSLY);
		clip2.stop();
		clip3.stop();
		clip4.stop();
		clip5.stop();
		break;
		case 2: clip2.start();
		clip2.loop(clip2.LOOP_CONTINUOUSLY);
		clip1.stop();
		clip3.stop();
		clip4.stop();
		clip5.stop();
		break;
		case 3: clip3.start();
		clip3.loop(clip3.LOOP_CONTINUOUSLY);
		clip2.stop();
		clip1.stop();
		clip4.stop();
		clip5.stop();
		break;
		case 4:clip4.start();
		clip4.loop(clip4.LOOP_CONTINUOUSLY);
		clip1.stop();
		clip2.stop();
		clip3.stop();
		clip5.stop();
		break;
		case 5:clip5.start();
		clip5.loop(clip5.LOOP_CONTINUOUSLY);
		clip1.stop();
		clip2.stop();
		clip3.stop();
		clip4.stop();
		break;
		case 0:clip1.stop();
		clip2.stop();
		clip3.stop();
		clip4.stop();
		clip5.stop();
		break;
		}
		
		clip1.setMicrosecondPosition(0);
		clip2.setMicrosecondPosition(0);
		clip3.setMicrosecondPosition(0);
		clip4.setMicrosecondPosition(0);
		clip5.setMicrosecondPosition(0);
}
}