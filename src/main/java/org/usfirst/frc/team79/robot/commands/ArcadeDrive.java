package org.usfirst.frc.team79.robot.commands;


import org.usfirst.frc.team79.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class ArcadeDrive extends Command{
		public ArcadeDrive () {
			requires(Robot.driveTrain);
		}
		
	// Called just before this Command runs the first time
		@Override
		protected void initialize() {
			Robot.driveTrain.frontLeft.configFactoryDefault();
			Robot.driveTrain.frontRight.configFactoryDefault();
			Robot.driveTrain.backLeft.configFactoryDefault();
			Robot.driveTrain.backRight.configFactoryDefault();
		}

		// Called repeatedly when this Command is scheduled to run
		@Override
		protected void execute() {
			double forward = -1.0 * Robot.oi.drive.getY();	// Sign this so forward is positive
			double turn = +1.0 * Robot.oi.drive.getZ();       // Sign this so right is positive
			Robot.driveTrain.drive.arcadeDrive(forward, turn);
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

		// Called when another command which requires one or more of the same
		// subsystems is scheduled to run
		@Override
		protected void interrupted() {
		}
	}

