package org.scienceleadership.frc.team4454.robot.subsystems;

import org.scienceleadership.frc.team4454.robot.RobotMap;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Forklift extends Subsystem {
	Victor motor = RobotMap.forkliftMotor;
	
	public Forklift() {
		// TODO Auto-generated constructor stub
	}

	public Forklift(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub

	}
	
	public void Raise(){
		motor.set(1);
	}
	
	public void Lower(){
		motor.set(-1);
	}
	
	public void Hold(){
		motor.set(0.1);
	}
	
	public void Stop(){
		motor.set(0);
	}
}
