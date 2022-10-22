import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Main6 {

	public static void main(String[] args) throws LineUnavailableException, IOException, UnsupportedAudioFileException {
		// TODO Auto-generated method stub

		/*Myframe4 je zapravo prvi i glavni frame doslo je do promene plana T_T*/
		
		Myframe4 frame = new Myframe4();
		
		File file=new File("Tarantella Napoletana.wav");
		AudioInputStream audiostream=AudioSystem.getAudioInputStream(file);
		Clip clip=AudioSystem.getClip();
		clip.open(audiostream);
		clip.start();
		clip.loop(clip.LOOP_CONTINUOUSLY);
	}

}
