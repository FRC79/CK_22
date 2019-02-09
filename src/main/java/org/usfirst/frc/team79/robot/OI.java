/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team79.robot;

import org.usfirst.frc.team79.robot.commands.ControlElevator;
import org.usfirst.frc.team79.robot.commands.IntakeIn;
import org.usfirst.frc.team79.robot.commands.IntakeOut;

// import org.usfirst.frc.team79.robot.commands.Brake;

// import org.usfirst.frc.team79.robot.commands.CameraFeed;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */

//This area is only used to intialize Joystick and button objects
public class OI {
	/*
		Use driver station to find button numbers that go in the parenthesis
	*/
	public Joystick drive = new Joystick(0); //Initializes drive joystick
	public Joystick operator = new Joystick(1); //Intialzies manipulator joystick

	public Button intakeIn = new JoystickButton(operator, 5); //Initialiizes button to run the intake in command
	public Button intakeOut = new JoystickButton(operator, 6); //Initializes button to run the intake out command
	public Button elevatorToggle = new JoystickButton(operator, 10); //Intializes button to switch between manual elevator control and button to stop at set points

	//Have to call methods inside this constructor
	public OI()
	{
		intakeIn.whileHeld(new IntakeIn()); //While this button is held it will run the intake in command
		intakeOut.whileHeld(new IntakeOut()); //While this button is held it will run the intake out comamnd
		
		elevatorToggle.toggleWhenPressed(new ControlElevator()); //This button is used toggle the manual control of the elevator between on and off. When it is off the default command of ElevatorStoppingPoints() will be used 
	}
	
	//// CREATING BUTTONS
	// One type of button is a joystick button which is any button on a
	//// joystick.
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

	// Start the command when the button is released and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenReleased(new ExampleCommand());
}
