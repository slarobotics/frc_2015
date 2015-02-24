package org.scienceleadership.frc.team4454.robot.commands;

import org.scienceleadership.frc.team4454.robot.OI;
import org.scienceleadership.frc.team4454.robot.Robot;
import org.scienceleadership.frc.team4454.robot.RobotMap;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.command.Command;

public class RaiseLift extends Command {
	
	DigitalInput limitTop = RobotMap.forkliftLimitTop;
	DigitalInput limitBottom = RobotMap.forkliftLimitBottom;
	private boolean finished;
	
	public RaiseLift() {
		requires(Robot.lift);
	}

	@Override
	protected void execute() {
		if(!limitTop.get()){
			Robot.lift.raise();
		}
		else{
			Robot.lift.hold();
		}
		finished = true;
	}

	@Override
	protected boolean isFinished() {
		return finished;
	}

	@Override
	protected void end() {
		Robot.lift.hold();
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
