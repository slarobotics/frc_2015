package org.scienceleadership.frc.team4454.robot.commands;

import org.scienceleadership.frc.team4454.robot.OI;
import org.scienceleadership.frc.team4454.robot.RobotMap;
import org.scienceleadership.frc.team4454.robot.subsystems.Forklift;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class TeleopGroup extends CommandGroup {
    
    public  TeleopGroup() {
        // Add Commands here:
        // e.g. addSequential(new Command1());
        //      addSequential(new Command2());
        // these will run in order.

        // To run multiple commands at the same time,
        // use addParallel()
        // e.g. addParallel(new Command1());
        //      addSequential(new Command2());
        // Command1 and Command2 will run in parallel.

        // A command group will require all of the subsystems that each member
        // would require.
        // e.g. if Command1 requires chassis, and Command2 requires arm,
        // a CommandGroup containing them would require both the chassis and the
        // arm.
    	
    	
    	//runs ManualDrive and running the joystick inputs at the same time.
    	
    	addParallel(new ManualDrive(RobotMap.drivetrain, OI.getLeftJoystick().getY(), OI.getRightJoystick().getY()));
    	addParallel(new CheckInput());
    	
    }
}
