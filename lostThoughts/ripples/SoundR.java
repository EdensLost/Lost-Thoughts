package lostThoughts.ripples;

import java.io.File;
import java.io.IOException;

import javax.sound.sampled.*;

import lostThoughts.helpingHands.FileH;
import lostThoughts.helpingHands.PyJav;
import lostThoughts.helpingHands.UtilH;

public class SoundR {
    
    public AudioInputStream thisSoundInput;
    public Clip thisSoundClip;
    public float thisVolume;
    public FloatControl thisGainControl;


    /** Creates a sound object that can do multiple different things
     * 
     * @param filePath = The path to the file starting from the project directory
     * @param volume = The volume to set the audio to
     * @param opensSound = If the sound should open the clip when created
     */
    public SoundR(String filePath, float volume, boolean opensSound) {

        try {
            // Converts the filepath into an external filepath
            filePath = FileH.getExternalFilePath(filePath);

            // Obtain an audio input stream from the provided file path
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(filePath).getAbsoluteFile());
            
            // Acquire audio clip
            thisSoundClip = AudioSystem.getClip();
            
            // If the sound should be opened when created
            if (opensSound) {

                // Open the audio input stream
                thisSoundClip.open(audioInputStream);

                // Get the gain control from the clip and set the volume
                FloatControl gainControl = (FloatControl) thisSoundClip.getControl(FloatControl.Type.MASTER_GAIN);
                float rangedVolume = UtilH.percentFromRange(volume, -20, 6f);
                //PyJav.printl("" + rangedVolume);
                
                gainControl.setValue(rangedVolume); // volume range: -45.0 to 6

                thisSoundClip.start();
                thisSoundClip.stop();
                thisSoundClip.setFramePosition(0);

                thisGainControl = gainControl;
                }
            
            thisSoundInput = audioInputStream;
            thisVolume = volume;
        } catch (LineUnavailableException | UnsupportedAudioFileException | IOException e) {
            e.printStackTrace();
        }
    }


    /** Plays a sound and closes it
     * 
     */
    public void playSoundAndClose() {
        try {
            thisSoundInput.reset();

            // Acquire audio clip
            Clip clip = AudioSystem.getClip();
            
            // Open the audio input stream
            clip.open(thisSoundInput);

            // Get the gain control from the clip and set the volume
            FloatControl gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
            float rangedVolume = UtilH.percentFromRange(thisVolume, -20, 6f);
            PyJav.printl("" + rangedVolume);
            
            gainControl.setValue(rangedVolume); // volume range: -45.0 to 6
            
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


        } catch (IOException | LineUnavailableException e) {
            e.printStackTrace();
        }
    }

    /** Opens the sound
     * 
     */
    public SoundR openSound() {
        // Open the audio input stream
        try {
            // Opens and instantiates the sound clip
            thisSoundClip.open(thisSoundInput);

            // Creates a new gain control
            thisGainControl = (FloatControl) thisSoundClip.getControl(FloatControl.Type.MASTER_GAIN);

            // Sets the volume of the opened sound
            setVolume(thisVolume);
        } 
        catch (LineUnavailableException | IOException e) {
            e.printStackTrace();
        }

        return this;
    }

    /** Plays the sound
     * 
     */
    public void playSound() {
        if (thisSoundClip != null) {
            thisSoundClip.stop();
            thisSoundClip.setFramePosition(0);
            thisSoundClip.start();
        }
        
    }

    /** Stops the sound
     * 
     */
    public void stopSound() {
        if (thisSoundClip != null) {
            thisSoundClip.stop();
        }
    }

    /** Closes the sound
     * 
     */
    public void closeSound() {
        if (thisSoundClip != null) {
            thisSoundClip.close();
        }
    }

    /** Sets the volume of the sound
     * 
     * @param newVolume = The new volume
     */
    public void setVolume(float newVolume) {
        thisVolume = Math.clamp(newVolume, 0, 1);
        newVolume = UtilH.percentFromRange(thisVolume, -20, 6f); // volume range: -20.0 to 6
        
        thisGainControl.setValue(newVolume); // volume range: -20 to 6
    }

    /** Checks if the sound is playing
     * 
     * @return {@code boolean} = If the sound clip is running
     */
    public boolean isRunning() {
        return thisSoundClip.isRunning();
    }
}
