
package org.scienceleadership.frc.team4454.robot;

import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

import org.scienceleadership.frc.team4454.robot.commands.*;
import org.scienceleadership.frc.team4454.robot.subsystems.Forklift;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {

	public static OI oi;
	public static Forklift lift = new Forklift();

    Command autonomousCommand;
    Command teleopCommand;


    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    public void robotInit() {
		oi = new OI();
        // instantiate the command used for the autonomous period
        autonomousCommand = new AutonomousSequence();
        // instantiate the command used for the teleop period
        teleopCommand = new TeleopGroup();

    }
	
	public void disabledPeriodic() {
		Scheduler.getInstance().run();
	}

    public void autonomousInit() {
        // schedule the autonomous command (example)
        if (autonomousCommand != null) autonomousCommand.start();
    }

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {
        Scheduler.getInstance().run();
    }

    public void teleopInit() {
		// This makes sure that the autonomous stops running when
        // teleop starts running. If you want the autonomous to 
        // continue until interrupted by another command, remove
        // this line or comment it out.
        if (autonomousCommand != null) autonomousCommand.cancel();
       // if (teleopCommand != null) teleopCommand.start();
        
    }

    /**
     * This function is called when the disabled button is hit.
     * You can use it to reset subsystems before shutting down.
     */
    public void disabledInit(){

    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
        Scheduler.getInstance().run();
        new ManualDrive(RobotMap.drivetrain, OI.getLeftJoystick().getY(), OI.getRightJoystick().getY()).start();
        if(OI.getLeftJoystick().getRawButton(3)){
        	new LowerLift().start();
        }
        if(OI.getRightJoystick().getRawButton(3)){
        	new RaiseLift().start();
        }
        Victor motor = RobotMap.forkliftMotor;
        //if(!RobotMap.forkliftLimitTop.get() && OI.getOperatorStick().getY(Hand.kLeft) > 0)
        	 System.out.println(OI.getOperatorStick().getY(Hand.kLeft));
        //else if(!RobotMap.forkliftLimitBottom.get() && OI.getOperatorStick().getY(Hand.kLeft) < 0)
        	motor.set(OI.getOperatorStick().getY(Hand.kLeft));
    }
    
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
        LiveWindow.run();
    }
}

