package frc.lib.generic.hardware.pigeon;

import frc.lib.generic.hardware.pigeon.hardware.GenericIMU;
import frc.robot.GlobalConstants;

import static frc.robot.GlobalConstants.CURRENT_MODE;

public class PigeonFactory {
    public static Pigeon createIMU(String name, int port) {
        if (CURRENT_MODE == GlobalConstants.Mode.REPLAY)
            return new Pigeon(name);

        return new GenericIMU(name, port);
    }
}
