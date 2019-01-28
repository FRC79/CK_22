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
	public static final int backLeftTalon = 3;
	public static final int backRightTalon = 4; 
	
	//Elevator Talons
	public static final int elevatorTalon = 4;
	
	//Intake Talons
	public static final int leftIntakeTalon = 5;
	public static final int rightIntakeTalon = 6;
}
