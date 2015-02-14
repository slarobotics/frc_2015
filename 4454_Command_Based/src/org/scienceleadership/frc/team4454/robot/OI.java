package org.scienceleadership.frc.team4454.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

import org.scienceleadership.frc.team4454.robot.commands.*;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);
    
    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.
    
    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:
    
    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());
    
    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());
    
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());
	
	//Joysticks
	Joystick leftStick = new Joystick(0);
	Joystick rightStick = new Joystick(1);
	
	//leftStick buttons
	Button leftTrigger = new JoystickButton(leftStick, 1);
	Button leftButton2 = new JoystickButton(leftStick, 2);
	Button leftButton3 = new JoystickButton(leftStick, 3);
	Button leftButton4 = new JoystickButton(leftStick, 4);
	Button leftButton5 = new JoystickButton(leftStick, 5);
	
	//rightStick buttons
	Button rightTrigger = new JoystickButton(rightStick, 1);
	Button rightButton2 = new JoystickButton(rightStick, 2);
	Button rightButton3 = new JoystickButton(rightStick, 3);
	Button rightButton4 = new JoystickButton(rightStick, 4);
	Button rightButton5 = new JoystickButton(rightStick, 5);
	
	public OI(){
		leftButton3.whileHeld(new RaiseLift());
		rightButton3.whileHeld(new LowerLift());
	}
	
}

