package lostThoughts.ripples;

import javax.sound.sampled.*;

import lostThoughts.helpingHands.FileH;
import lostThoughts.helpingHands.PyJav;
import lostThoughts.helpingHands.UtilH;

import java.io.File;
import java.io.IOException;


public class SoundPlayerR {
    private String thisFilepath;
    private int thisVolume;
    public Clip currentClip;

    public SoundPlayerR(String filePath, int volume) {
        thisFilepath = FileH.getExternalFilePath(filePath);
        thisVolume = volume;
    }

    /** Plays a sound based on the given filepath
     * 
     */
    public void playSound() {
        try {
            AudioInputStream thisAudio = AudioSystem.getAudioInputStream(new File(thisFilepath).getAbsoluteFile());

            // Acquire audio clip
            Clip clip = AudioSystem.getClip();
            
            // Open the audio input stream
            clip.open(thisAudio);

            // Get the gain control from the clip and set the volume
            FloatControl gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
            float rangedVolume = UtilH.percentFromRange(thisVolume / 100.0f, -20, 6f);
            
            gainControl.setValue(rangedVolume); // volume range: -45.0 to 6

            currentClip = clip;
            
            // Start the clip if the volume isn't 0
            if (thisVolume != 0) {
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

    public int setVolume(int volume) {
        thisVolume = Math.clamp(volume, 0, 100);
        return thisVolume;
    }

    public static void main(String[] args) {
        SoundPlayerR player = new SoundPlayerR("\\sounds\\menu-heart.wav", 1);

        for (int i = 0; i < 10; i++) {
            PyJav.printl("\nSound played");
            
            player.playSound();
            UtilH.uWait(100);
        }
    }
}

