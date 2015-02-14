/**
 * 
 */
package org.scienceleadership.frc.team4454.robot.commands;

import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Command;

/**
 * @author Alex
 *
 */
public class ManualDrive extends Command {

	private RobotDrive drivetrain;
	private Jaguar leftMotor;
	private Jaguar rightMotor;
	private Joystick leftStick;
	private Joystick rightStick;

	/**
	 * 
	 */
	public ManualDrive(RobotDrive drivetrain, Jaguar leftMotor, Jaguar rightMotor, Joystick leftStick, Joystick rightStick) {
		// TODO Auto-generated constructor stub
		super("drive");
		this.drivetrain = drivetrain;
		this.leftMotor = leftMotor;
		this.rightMotor = rightMotor;
		this.leftStick = leftStick;
		this.rightStick = rightStick;
	}

	/**
	 * @param name
	 */
	public ManualDrive(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param timeout
	 */
	public ManualDrive(double timeout) {
		super(timeout);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param name
	 * @param timeout
	 */
	public ManualDrive(String name, double timeout) {
		super(name, timeout);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see edu.wpi.first.wpilibj.command.Command#initialize()
	 */
	@Override
	protected void initialize() {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see edu.wpi.first.wpilibj.command.Command#execute()
	 */
	@Override
	protected void execute() {
		// TODO Auto-generated method stub
    	if(leftStick.getTrigger() && rightStick.getTrigger()){
    		drivetrain.tankDrive(leftStick.getY()*.95, rightStick.getX());
    	} else drivetrain.tankDrive(leftStick.getY()*.70, rightStick.getX()*.70); 
	}

	/* (non-Javadoc)
	 * @see edu.wpi.first.wpilibj.command.Command#isFinished()
	 */
	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see edu.wpi.first.wpilibj.command.Command#end()
	 */
	@Override
	protected void end() {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see edu.wpi.first.wpilibj.command.Command#interrupted()
	 */
	@Override
	protected void interrupted() {
		// TODO Auto-generated method stub

	}

}
