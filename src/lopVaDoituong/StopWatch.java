package lopVaDoituong;

import java.time.LocalTime;
import java.util.Date;

public class StopWatch {
    private long startTime;
    private long endTime;
    public StopWatch() {
    }

    public long star() {
        startTime = new Date().getTime();
        return startTime;
    }
    public long stops() {
        endTime = new Date().getTime();
        return endTime;
    }
    public long  getElapsedTime() {
        return (endTime - startTime);
    }
}
