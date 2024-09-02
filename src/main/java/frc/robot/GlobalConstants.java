package frc.robot;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class GlobalConstants {
    public static final boolean IS_TUNING_MODE = true;
    public static final double ODOMETRY_FREQUENCY_HERTZ = 200.0;
    public static final Lock FASTER_THREAD_LOCK = new ReentrantLock();

    public static final boolean SHOULD_WRITE_LOGS = true;

    public static final double GRAVITY = 9.80665;
    public static final double MINIMUM_ACCELERATION_FOR_COLLISION = 25;

    public static final double FIELD_LENGTH_METRES = 14.56;

    public static final Mode CURRENT_MODE = Mode.REAL;

    public enum Mode {
        REAL, SIMULATION, REPLAY
    }
}
