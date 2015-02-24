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
	static Joystick leftStick = new Joystick(0);
	static Joystick rightStick = new Joystick(1);
	
	//leftStick buttons
	static Button leftTrigger = new JoystickButton(leftStick, 1);
	static Button leftButton2 = new JoystickButton(leftStick, 2);
	static Button leftButton3 = new JoystickButton(leftStick, 3);
	static Button leftButton4 = new JoystickButton(leftStick, 4);
	static Button leftButton5 = new JoystickButton(leftStick, 5);
	
	//rightStick buttons
	static Button rightTrigger = new JoystickButton(rightStick, 1);
	static Button rightButton2 = new JoystickButton(rightStick, 2);
	static Button rightButton3 = new JoystickButton(rightStick, 3);
	static Button rightButton4 = new JoystickButton(rightStick, 4);
	static Button rightButton5 = new JoystickButton(rightStick, 5);

	/*
	 * this is reccommended by WPIlib, but common sense & Java says it shouldn't work.
	public OI(){
		leftButton3.whileHeld(new RaiseLift());
		rightButton3.whileHeld(new LowerLift());
	}
	*/
	
	/**
	 * @return the leftStick
	 */
	public static Joystick getLeftStick() {
		return leftStick;
	}
	/**
	 * @return the rightStick
	 */
	public static Joystick getRightStick() {
		return rightStick;
	}
	/**
	 * @return the leftTrigger
	 */
	public static Button getLeftTrigger() {
		return leftTrigger;
	}
	/**
	 * @return the leftButton2
	 */
	public static Button getLeftButton2() {
		return leftButton2;
	}
	/**
	 * @return the leftButton3
	 */
	public static Button getLeftButton3() {
		return leftButton3;
	}
	/**
	 * @return the leftButton4
	 */
	public static Button getLeftButton4() {
		return leftButton4;
	}
	/**
	 * @return the leftButton5
	 */
	public static Button getLeftButton5() {
		return leftButton5;
	}
	/**
	 * @return the rightTrigger
	 */
	public static Button getRightTrigger() {
		return rightTrigger;
	}
	/**
	 * @return the rightButton2
	 */
	public static Button getRightButton2() {
		return rightButton2;
	}
	/**
	 * @return the rightButton3
	 */
	public static Button getRightButton3() {
		return rightButton3;
	}
	/**
	 * @return the rightButton4
	 */
	public static Button getRightButton4() {
		return rightButton4;
	}
	/**
	 * @return the rightButton5
	 */
	public static Button getRightButton5() {
		return rightButton5;
	}
	
	public static Joystick getRightJoystick(){
		return rightStick;
	}
	public static Joystick getLeftJoystick(){
		return leftStick;
	}
}

