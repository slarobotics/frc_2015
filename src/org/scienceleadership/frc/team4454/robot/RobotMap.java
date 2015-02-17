package org.scienceleadership.frc.team4454.robot;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Victor;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    // public static int leftMotor = 1;
    // public static int rightMotor = 2;
    
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static int rangefinderPort = 1;
    // public static int rangefinderModule = 1;
	
	public static Jaguar leftMotor = new Jaguar(1);
	public static Jaguar rightMotor = new Jaguar(0);
	public static RobotDrive drivetrain = new RobotDrive(leftMotor, rightMotor);
	public static Victor forkliftMotor = new Victor(2);
	
	public static DigitalInput forkliftLimitTop = new DigitalInput(0);
	public static DigitalInput forkliftLimitBottom = new DigitalInput(1);
}

