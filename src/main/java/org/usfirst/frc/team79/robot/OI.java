/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team79.robot;

import org.usfirst.frc.team79.robot.commands.gripper.GripperDeployDown;
import org.usfirst.frc.team79.robot.commands.gripper.GripperDeployUp;
import org.usfirst.frc.team79.robot.commands.gripper.GripperHug;
import org.usfirst.frc.team79.robot.commands.gripper.GripperUnhug;
import org.usfirst.frc.team79.robot.commands.gripper.RobotFlip;
import org.usfirst.frc.team79.robot.commands.gripper.RobotUnflip;
import org.usfirst.frc.team79.robot.commands.intake.IntakeClose;
import org.usfirst.frc.team79.robot.commands.intake.IntakeIn;
import org.usfirst.frc.team79.robot.commands.intake.IntakeOpen;
import org.usfirst.frc.team79.robot.commands.intake.IntakeOut;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	public Joystick drive = new Joystick(0); //Initializes joystick
	public Joystick operator = new Joystick(1); 

	public Button intakeOut = new JoystickButton(operator, 7); //LT
	public Button intakeIn = new JoystickButton(operator, 8); //RT
	public Button intakeClose = new JoystickButton(operator, 5); //LB
	public Button intakeOpen = new JoystickButton(operator, 6); //RB
	// public Button elevatorUp = new JoystickButton(operator, 4); //Y
	// public Button elevatorDown = new JoystickButton(operator, 2); //A
	public Button robotFlip = new JoystickButton(operator, 3); //B
	public Button robotUnflip = new JoystickButton(operator, 1); //X
	public Button gripperDown = new JoystickButton(operator, 4); //Y
	public Button gripperUp = new JoystickButton(operator, 2); // A

	public Button gripperUnhug = new JoystickButton(drive, 5); //LB
	public Button gripperHug = new JoystickButton(drive, 6); //RB

	


	// public Button elevatorToggle = new JoystickButton(operator, 10);

	public OI() {
		intakeIn.whileHeld(new IntakeIn());
		intakeOut.whileHeld(new IntakeOut());
		intakeOpen.whenPressed(new IntakeOpen());
		intakeClose.whenPressed(new IntakeClose());

		gripperUnhug.whenPressed(new GripperUnhug());
		gripperHug.whenPressed(new GripperHug());
		gripperDown.whenPressed(new GripperDeployDown());
		gripperUp.whenPressed(new GripperDeployUp());
		robotFlip.whileHeld(new RobotFlip());
		robotUnflip.whileHeld(new RobotUnflip());
		// elevatorToggle.toggleWhenPressed(new ControlElevator());
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
