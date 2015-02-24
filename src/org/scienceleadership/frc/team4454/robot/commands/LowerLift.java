package org.scienceleadership.frc.team4454.robot.commands;

import org.scienceleadership.frc.team4454.robot.Robot;
import org.scienceleadership.frc.team4454.robot.RobotMap;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.command.Command;

public class LowerLift extends Command {
	
	DigitalInput limitTop = RobotMap.forkliftLimitTop;
	DigitalInput limitBottom = RobotMap.forkliftLimitBottom;
	private boolean finished;
	
	public LowerLift() {
		requires(Robot.lift);
	}

	@Override
	protected void execute() {
		if(!limitBottom.get()){
			Robot.lift.lower();
		}
		else{
			Robot.lift.stop();
		}
		finished = true;
	}

	@Override
	protected boolean isFinished() {
		return finished;
	}

	@Override
	protected void end() {
		if(!limitBottom.get())
			Robot.lift.hold();
		else Robot.lift.stop();
	}

	@Override
	protected void interrupted() {
		end();
	}

	@Override
	protected void initialize() {
		// empty or w/e
	}

}
