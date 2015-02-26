/**
 * 
 */
package org.scienceleadership.frc.team4454.robot.commands;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Command;

/**
 * @author Alex
 *
 */
public class ManualDrive extends Command {

	private RobotDrive drivetrain;
	private double leftPower, rightPower;
	private Boolean finished = false;

	/**
	 * 
	 */
	public ManualDrive(RobotDrive drivetrain, double leftPower, double rightPower) {
		// TODO Auto-generated constructor stub
		this.drivetrain = drivetrain;
		this.leftPower = leftPower;
		this.rightPower = rightPower;
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
    	drivetrain.tankDrive(leftPower, rightPower);
    	//finished = true;
	}

	/* (non-Javadoc)
	 * @see edu.wpi.first.wpilibj.command.Command#isFinished()
	 */
	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return finished;
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
