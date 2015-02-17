
package org.scienceleadership.frc.team4454.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;
import org.scienceleadership.frc.team4454.robot.*;
import edu.wpi.first.wpilibj.Timer;

/**
 *
 */
public class AutonomousSequence extends CommandGroup {

    public AutonomousSequence() {
        // Use requires() here to declare subsystem dependencies
        //requires(Robot.exampleSubsystem);
    	addSequential(new ManualDrive(RobotMap.drivetrain, -10, -10));
    	//Timer.delay(5000);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
