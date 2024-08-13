package lostThoughts.grandfather;

public class TimerG {
    long startTime = 0;
    long endTime = 0;
    long curTime = 0;

    long pauseTimeOffset = 0;

    boolean timeIsUp = false;

// Initializer
    /** Creates a timer object
     * 
     * @param endTimeSet = Sets the end time of the timer
     */
    public TimerG(long endTimeSet) {
        endTime = endTimeSet;
        
        resetTimer();
    }

    /** Creates a timer object with a specified start time
     * 
     * @param startToSet = Sets a specific start time 
     * @param endToSet = Sets the end time of the timer
     */
    public TimerG(long startToSet, long endToSet) {
        startTime = startToSet;
        endTime = endToSet;
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

    /** Sets the time it ends
     * 
     * @param newEnd = The new timer end
     */
    public void setEndTime(long newEnd) {
        endTime = newEnd;
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

    /** Gets the time the timer ends at
     * 
     * @return {@code long} = The time that timer ends at
     */
    public long getEndTime() {
        return endTime;
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
        timeIsUp = false;
        curTime = 0;
        startTime = System.currentTimeMillis();
    }

    /**
     * Updates the current time of the timer
     */
    public void updateTime() {
        curTime = System.currentTimeMillis() - startTime;
        if (curTime >= endTime) {
            timeIsUp = true;
        }
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

    /** 
     * Checks if the current time of the timer is equal to or more than the end
     * 
     * @return {@code boolean} = If the timer has ended or not
     */
    public boolean checkTimer() {
        updateTime();
        return timeIsUp;
    }

    public double timerPercent() {

        double percentOfTIme = (double) curTime / (double) endTime;

        return Math.clamp(percentOfTIme, 0, 1);
    }
//

}
