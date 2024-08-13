package lostThoughts.helpingHands;

import javax.sound.sampled.*;

import lostThoughts.ripples.*;

import java.io.File;
import java.io.IOException;


public class SoundH {
    
    /** Plays a sound based on the given filepath
     * 
     * @param filePath = The path of the sound file
     */
    public static void playSound(String filePath) {
        try {
            // Obtain an audio input stream from the provided file path
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(filePath).getAbsoluteFile());
            
            // Acquire audio clip
            Clip clip = AudioSystem.getClip();
            
            // Open the audio input stream
            clip.open(audioInputStream);
            
            // Start the clip
            clip.start();
            
            // To keep the program running until the sound finishes
            clip.addLineListener(event -> {
                if (event.getType() == javax.sound.sampled.LineEvent.Type.STOP) {
                    clip.close();
                }
            });
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        }
    }

    /** Plays a sound based on the given filepath
     * 
     * @param filePath = The path of the sound file
     * @param volume = The volume to play the sound at (from 0 to 1)
     */
    public static void playSound(String filePath, float volume) {
        try {
            // Converts the filepath into an external filepath
            filePath = FileH.getExternalFilePath(filePath);

            // Obtain an audio input stream from the provided file path
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(filePath).getAbsoluteFile());
            
            // Acquire audio clip
            Clip clip = AudioSystem.getClip();
            
            // Open the audio input stream
            clip.open(audioInputStream);

            // Get the gain control from the clip and set the volume
            FloatControl gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
            float rangedVolume = UtilH.percentFromRange(volume, -20, 6f);
            PyJav.printl("" + rangedVolume);
            
            gainControl.setValue(rangedVolume); // volume range: -45.0 to 6
            
            // Start the clip if the volume isn't 0
            if (volume != 0) {
                clip.start();
            
                // To keep the program running until the sound finishes
                clip.addLineListener(event -> {
                    if (event.getType() == javax.sound.sampled.LineEvent.Type.STOP) {
                        clip.close();
                    }
                });
            }
            
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        //SoundH.playSound(FileH.getExternalFilePath("\\sounds\\hidden-find-two.wav"), .8f);
        //SoundR playSound = new SoundR("\\sounds\\hidden-find-two.wav", .8f);
        SoundR playSound = new SoundR("\\sounds\\" + "game-lose" + ".wav", 1f, false).openSound();

        //SoundCollectionR soundCollection = new SoundCollectionR(playSound);

        for (int i = 0; i < 10; i++) {
            PyJav.printl("\nSound played");
            //playSound.setVolume((float) Math.random());
            //PyJav.printl("Vol: " + playSound.thisVolume);
            
            //playSound("\\sounds\\" + "button-press" + ".wav", 1f);
            playSound.playSound();
            UtilH.uWait(500);
        }

        while (playSound.isRunning()) {

        }

        UtilH.uWait(9000);

        playSound.closeSound();

        //soundCollection.closeAllSounds();
    }

}
