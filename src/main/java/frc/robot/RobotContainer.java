// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.DriverStation;
import frc.lib.util.Controller;
import frc.robot.subsystems.kicker.Kicker;

public class RobotContainer {
    private static final Kicker KICKER = new Kicker();

    private final Controller driveController = new Controller(0);

    public RobotContainer() {
        configureBindings();
    }

    private void configureBindings() {
        DriverStation.silenceJoystickConnectionWarning(true);

        driveController.getButton(Controller.Inputs.RIGHT_BUMPER).whileTrue(KICKER.setKickerPercentageOutput(1));
    }
}
