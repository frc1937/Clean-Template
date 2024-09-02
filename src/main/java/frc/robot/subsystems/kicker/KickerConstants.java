package frc.robot.subsystems.kicker;

import edu.wpi.first.wpilibj.DigitalInput;
import frc.lib.generic.hardware.motor.Motor;
import frc.lib.generic.hardware.motor.MotorConfiguration;
import frc.lib.generic.hardware.motor.MotorFactory;
import frc.lib.generic.hardware.motor.MotorProperties;
import frc.lib.generic.hardware.sensors.Sensor;
import frc.lib.generic.hardware.sensors.SensorFactory;

public class KickerConstants {
    public static final Sensor BEAM_BREAKER = SensorFactory.createDigitalInput("Beam break", 0);
    public static final Motor MOTOR = MotorFactory.createTalonSRX("Kicker Motor", 0);

    static {
        configureMotor();
    }

    private static void configureMotor() {
        MotorConfiguration configuration = new MotorConfiguration();

        configuration.idleMode = MotorProperties.IdleMode.BRAKE;

        MOTOR.configure(configuration);
    }
}
