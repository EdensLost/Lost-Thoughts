package lostThoughts.ripples;

public class SoundCollectionR {
    public SoundR[] thisCollection = new SoundR[0];

    public SoundCollectionR(SoundR... args) {
        thisCollection = args;
    }

// TITLE [Single collection methods]
    /** Opens the specified sound
     * 
     * @param soundNum = The specific sound to use
     */
    public void openSound(int soundNum) {
        thisCollection[soundNum].openSound();
    }

    /** Plays the specified sound
     * 
     * @param soundNum = The specific sound to use
     */
    public void playSound(int soundNum) {
        thisCollection[soundNum].playSound();
    }

    /** Stops the specified sound
     * 
     * @param soundNum = The specific sound to use
     */
    public void stopSound(int soundNum) {
        thisCollection[soundNum].stopSound();
    }

    /** Closes the specified sound
     * 
     * @param soundNum = The specific sound to use
     */
    public void closeSound(int soundNum) {
        thisCollection[soundNum].closeSound();
    }

    /** Checks if the specified sound is playing
     * 
     * @param soundNum = The specific sound to use
     * 
     * @return {@code boolean} = If the specific sound is currently running
     */
    public boolean isRunning(int soundNum) {
        return thisCollection[soundNum].isRunning();
    }
//

// TITLE [Full collection methods]
    /**
     * Opens all the sounds in the collection
     */
    public SoundCollectionR openAllSounds() {
        for (SoundR soundR : thisCollection) {
            soundR.openSound();
        }

        return this;
    }

    /**
     * Stops all the sounds in the collection
     */
    public void stopAllSounds() {
        for (SoundR soundR : thisCollection) {
            soundR.stopSound();
        }
    }

    /**
     * Closes all the sounds in the collection
     */
    public void closeAllSounds() {
        for (SoundR soundR : thisCollection) {
            soundR.closeSound();
        }
    }
//
}
