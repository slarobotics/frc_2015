package org.scienceleadership.frc.team4454.robot.commands;

import org.scienceleadership.frc.team4454.robot.OI;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class CheckInput extends Command {

    public CheckInput() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }
    
    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	
    	OI.getLeftButton3().whileHeld(new LowerLift());
    	OI.getRightButton3().whileHeld(new RaiseLift());

    	
    	/*
    	 * another possible way to do this
    	if(OI.getLeftButton3().get()){
    		
    	} else if(OI.getRightButton3().get()){
    		
    	}
    	*/
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
