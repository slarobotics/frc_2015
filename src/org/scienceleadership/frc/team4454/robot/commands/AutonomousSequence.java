
package org.scienceleadership.frc.team4454.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;
import org.scienceleadership.frc.team4454.robot.*;
import edu.wpi.first.wpilibj.Timer;

/**
 *
 */
public class AutonomousSequence extends CommandGroup {
	
	Timer autonTimer;
	private int autonMode = 0;
	String[] autonModeNames = {"forward", "backward", "nothing"};
	
	public String GetAutonModeName(){
		return autonModeNames[autonMode];
	}
	
    public AutonomousSequence() {
        // Use requires() here to declare subsystem dependencies
        //requires(Robot.exampleSubsystem);
    	autonTimer = new Timer();
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	autonTimer.start();
    }
    
    public void incrementAuto(){
    	autonMode +=1;
    	if (autonMode >2)
    		autonMode = 0;
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	/*if(autonTimer.get() < 1)
    		RobotMap.forkliftMotor.set(0.2);
    	if(autonTimer.get() < 2)
    		RobotMap.forkliftMotor.set(0);
    		new ManualDrive(RobotMap.drivetrain, -30, 0).start();
    	if(autonTimer.get() < 4)*/
    	switch(autonMode){
    	case 0:
    		new ManualDrive(RobotMap.drivetrain, -20, -20).start();
    		break;
    	case 1:
    		new ManualDrive(RobotMap.drivetrain, 20, 20).start();
    		break;
    	case 2:
    		break;
    	default:
    		break;
    	}
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return (autonTimer.get() > 1);
    }

    // Called once after isFinished returns true
    protected void end() {
    	new ManualDrive(RobotMap.drivetrain, 0, 0).start();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
