package org.scienceleadership.frc.team4454.robot.commands;

import org.scienceleadership.frc.team4454.robot.OI;
import org.scienceleadership.frc.team4454.robot.subsystems.Forklift;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class CheckInput extends Command {

	Forklift lift = new Forklift();
	Command lower = new LowerLift();
	Command raise = new RaiseLift();
	
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
    	if(OI.getLeftButton3().get()){
    		while(true){
    			lower.start();
    			if(lower.isCanceled()){
    				lower.start();
    			}
    		}
    		
    	} else if(OI.getRightButton3().get()){
    		while(true){
    			raise.start();
    			if(raise.isCanceled()){
    				raise.start();
    			}
    		}
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
    	end();
    }
}
