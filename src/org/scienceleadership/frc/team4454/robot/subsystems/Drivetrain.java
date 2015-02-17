package org.scienceleadership.frc.team4454.robot.subsystems;

//UNUSED!!
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;

import org.scienceleadership.frc.team4454.robot.*;
import org.scienceleadership.frc.team4454.robot.commands.ManualDrive;

public class Drivetrain extends Subsystem {
	


	public Drivetrain() {
		
	}

	public Drivetrain(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		setDefaultCommand(new ManualDrive(RobotMap.drivetrain, OI.getLeftJoystick().getY(), OI.getRightJoystick().getY()));
	}

}
