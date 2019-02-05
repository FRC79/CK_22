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
	//Drive Talons and Victors
	public static final int frontLeftDriveTalon = 1;
	public static final int frontRightDriveTalon = 2; 
	public static final int backLeftDriveVictor= 3;
	public static final int backRightDriveVictor = 4; 
	public static final int leftElevatorTalon = 5;
	public static final int rightElevatorTalon = 6; //Not used right now
	public static final int leftIntakeTalon = 7;
	public static final int rightIntakeTalon = 8;
	public static final int gripper1Talon = 9;
	public static final int gripper2Talon = 10;

	//Pneumatics
	public static final int INTAKE_DEPLOY_DOWN = 0;
	public static final int INTAKE_DEPLOY_UP = 1;
	public static final int INTAKE_OPEN = 2;
	public static final int INTAKE_CLOSE =3;
	
	public static final int GRIPPER_HUG = 4;
	public static final int GRIPPER_UNHUG = 5;

	//Digital Input
	public static final int ENCODER_A_CHANNEL = 0;
	public static final int ENCORDER_B_CHANNEL = 1;

	//Elevator Encoder Value Constants
	public static final int ROCKET_HATCH1_VALUE = 0;
	public static final int ROCKET_HATCH2_VALUE = 0;
	public static final int ROCKET_HATCH3_VALUE = 0;
	public static final int ROCKET_CARGO1_VALUE = 0;
	public static final int ROCKET_CARGO2_VALUE = 0;
	public static final int ROCKET_CARGO3_VALUE = 0;
	public static final int ELEVATOR_MAX_HEIGHT = 0;


}