package org.usfirst.frc.team79.robot.commands;


import org.usfirst.frc.team79.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class ArcadeDrive extends Command{
		public ArcadeDrive () {
			requires(Robot.driveTrain); //Specifies the subsystem that is used by this command
		}
		
	// Called just before this Command runs the first time
		@Override
		protected void initialize() {
			/* Resets the talons */
			Robot.driveTrain.frontLeftMotor.configFactoryDefault();
			Robot.driveTrain.frontRightMotor.configFactoryDefault();
			Robot.driveTrain.backLeftMotor.configFactoryDefault();
			Robot.driveTrain.backRightMotor.configFactoryDefault();
		}

		// Called repeatedly when this Command is scheduled to run
		@Override
		protected void execute() {
			double forward = -1.0  * Robot.oi.drive.getY(); //gets joystick values to move forward and back
			//"-" makes forward	go forward on the joystick
			double turn = Robot.oi.drive.getX();    //turns left and right
			Robot.driveTrain.drive.arcadeDrive(forward, turn); //passes joystick values into drive mechanism
		   
		}
		
		// Make this return true when this Command no longer needs to run execute()
		@Override
		protected boolean isFinished() {
			return false;
		}

		// Called once after isFinished returns true
		@Override
		protected void end() {
		}
	}


