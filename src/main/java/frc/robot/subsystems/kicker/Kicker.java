package frc.robot.subsystems.kicker;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.lib.generic.motor.MotorProperties;

import static frc.robot.subsystems.kicker.KickerConstants.BEAM_BREAKER;
import static frc.robot.subsystems.kicker.KickerConstants.MOTOR;

public class Kicker extends SubsystemBase {

    public Command setKickerPercentageOutput(double percentageOutput) {
        return Commands.startEnd(
                () -> setPercentageOutput(percentageOutput),
                this::stop,
                this
        );
    }

    public boolean doesSeeObject() {
        return !BEAM_BREAKER.get();
    }

    private void setPercentageOutput(double percentageOutput) {
        MOTOR.setOutput(MotorProperties.ControlMode.PERCENTAGE_OUTPUT, percentageOutput);
    }

    private void stop() {
        MOTOR.stopMotor();
    }
}
