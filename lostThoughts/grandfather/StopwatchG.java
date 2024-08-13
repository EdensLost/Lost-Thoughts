package lostThoughts.grandfather;

public class StopwatchG {
    long startTime = 0;
    long curTime = 0;

    long pauseTimeOffset = 0;

// Initializer
    /** Creates a stopwatch object
     * 
     */
    public StopwatchG() {
        resetTimer();
    }
//

// Sets
    /** Sets the start time of the timer
     * 
     * @param newStartTime = The new start time to set
     */
    public void setStartTime(long newStartTime) {
        startTime = newStartTime;
    }

    /** Sets a new current time for the timer
     * <p> Only use when needed, for updating the timer use {@code updateTime();}
     * 
     * @param newCurTime = The new current time
     */
    public void setNewCurTime(long newCurTime) {
        curTime = newCurTime;
    }
//

// Gets
    /** Gets the start time of the timer
     * 
     * @return {@code long} = The time this timer starts at
     */
    public long getStartTime() {
        return startTime;
    }

    /** Gets the current time of the timer
     * 
     * @return {@code long} = The time this timer is currently at
     */
    public long getCurrentTime() {
        return curTime;
    }
//

// Methods
    /**
     * Sets the start time to the current time
     */
    public void resetTimer() {
        curTime = 0;
        startTime = System.currentTimeMillis();
    }

    /**
     * Updates the current time of the timer
     */
    public void updateTime() {
        curTime = System.currentTimeMillis() - startTime;
    }

    /**
     * Updates the pause time offset
     */
    public void newPauseTime() {
        pauseTimeOffset = System.currentTimeMillis();
    }

    /**
     * Offsets the start time with the difference between when the time was paused then unpaused
     */
    public void offsetStartWithPause() {
        long timeToSubtract = System.currentTimeMillis() - pauseTimeOffset;
        setStartTime(startTime + timeToSubtract);
    }
//
}
