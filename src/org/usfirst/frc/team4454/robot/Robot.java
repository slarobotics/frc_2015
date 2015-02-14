
package org.usfirst.frc.team4454.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 * 
 * One motor for winch. 
 * 2 pneumatic actuators 
 * Camera 
 * Encoders for motors
 * 
 * Teleop 
 * Raise lift 
 * Lower lift 
 * Top and bottom limit switches
 * How to monitor? 
 * 
 * 70% power unless both triggers
 * Multiple autonomous modes
 * Automonus tracking and grabbing of crates
 * Figure out camera position. 
 * 
 * Tobi will handle Jetson code
 * 
 * Jetson-RIO interface
 */
public class Robot extends IterativeRobot {
	Jaguar leftMotor = new Jaguar(0);
	Jaguar rightMotor = new Jaguar(1);
	Jaguar winchyMotor = new Jaguar(2);
	RobotDrive drivetrain = new RobotDrive(leftMotor, rightMotor);
	
	Joystick leftStick, rightStick;
    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    public void robotInit() {
    	leftStick = new Joystick(0);
    	rightStick = new Joystick(1);
    }

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {

    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
    	if(leftStick.getTrigger() && rightStick.getTrigger()){
    		drivetrain.tankDrive(leftStick.getY()*.95, rightStick.getX());
    	} else drivetrain.tankDrive(leftStick.getY()*0.75, rightStick.getY()*0.8); // TODO need to check which chain to slow down to make it drive straight
    	
    }
    
    public void goToCrate(){
    	/*
    	 * Constantly get position
    	 * Follow color tracker to crate
    	 * drivetrain.arcadeDrive(x,y);
    	 */
    }
    
    public void checkForInput(){
    	
    }
    
    public void raiseLift(double speed){
    	winchyMotor.set(speed);
    }
    
    public void lowerLift(double speed){
    	winchyMotor.set(-speed);
    }
    
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
    
    }
    
}
