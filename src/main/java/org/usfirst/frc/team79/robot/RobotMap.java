/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team79.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	/*
	*Sets ID numbers for the talons
	*/
	//Drive Talons
	public static final int frontLeftTalon = 1;
	public static final int frontRightTalon = 2; 
	public static final int backLeftVictor= 3;
	public static final int backRightVictor = 4; 
	
	//Elevator Talons
	public static final int leftElevatorTalon = 5;
	public static final int rightElevatorTalon = 6;
	
	//Intake Talons
	public static final int leftIntakeTalon = 7;
	public static final int rightIntakeTalon = 8;

	//Climber Talons
	public static final int leftClimberTalon = 9;
	public static final int rightClimberTalon = 10;

	//Pneumatics
	public static final int INTAKE_DEPLOY_DOWN = 0;
	public static final int INTAKE_DEPLOY_UP = 1;
	public static final int INTAKE_OPEN = 2;
	public static final int INTAKE_CLOSE =3;
	
	public static final int CLIMBER_GRIP = 4;
	public static final int CLIMBER_UNGRIP = 5;
}