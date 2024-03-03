// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.math.geometry.Translation3d;
import edu.wpi.first.math.util.Units;
import swervelib.math.Matter;
import swervelib.parser.PIDFConfig;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {

  public static final double ROBOT_MASS = (148 - 20.3) * 0.453592; // 32lbs * kg per pound
  public static final Matter CHASSIS =
      new Matter(new Translation3d(0, 0, Units.inchesToMeters(8)), ROBOT_MASS);
  public static final double LOOP_TIME = 0.13; // s, 20ms + 110ms sprk max velocity lag

  public static final class Auton {

    public static final PIDFConfig TranslationPID = new PIDFConfig(0.7, 0, 0);
    public static final PIDFConfig angleAutoPID = new PIDFConfig(0.4, 0, 0.01);

    public static final double MAX_ACCELERATION = 2;
  }

  public static final class HardwareConstants {
    public static final int REV_PDH_ID = 60;
    public static final int REV_PH_ID = 61;
  }

  public static final class PneumaticsConstants {
    public static final class DumpConstants {
      // Uppy Downy solonoid
      public static final int OUT = 1;
      public static final int IN = 0;
    }

    public static final class ElevatorConstants {
      // upy downy chain lift thing

    }
  }

  public static final class Drivebase {

    // Hold time on motor brakes when disabled
    public static final double WHEEL_LOCK_TIME = 10; // seconds
  }

  public static class OperatorConstants {
    public static final int DRIVER_CONTROLLER = 0;
    public static final int COPILOT_CONTROLLER = 1;

    // TODO: Add button binds for driver controllers

    // Joystick Deadband
    public static final double LEFT_X_DEADBAND = 0.1;
    public static final double LEFT_Y_DEADBAND = 0.1;
    public static final double RIGHT_X_DEADBAND = 0.1;
    public static final double TURN_CONSTANT = 6;
  }

  public static class MechanismConstants {

    // Intake Motors
    public static final int INTAKE_MOTOR_SUSHI = 51;
    public static final int INTAKE_MOTOR_FRONT = 52;
    public static final boolean INTAKE_MOTOR_SUSHI_INVERTED = true;
    public static final boolean INTAKE_MOTOR_FRONT_INVERTED = false;
    public static final double INTAKE_MOTOR_SPEED_FRONT = 0.8;
    public static final double INTAKE_MOTOR_SPEED_SUSHI = 0.8;

    // Conveyor Motors
    public static final int CONVEYOR_MOTOR_1 = 1;
    public static final int CONVEYOR_MOTOR_2 = 2;
    public static final boolean CONVEYOR_MOTOR_1_INVERTED = true;
    public static final boolean CONVEYOR_MOTOR_2_INVERTED = true;
    public static final double CONVEYOR_MOTOR_SPEED = 0.30;
  }
}
