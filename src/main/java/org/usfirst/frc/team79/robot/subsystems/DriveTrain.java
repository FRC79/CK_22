package org.usfirst.frc.team79.robot.subsystems;

import org.usfirst.frc.team79.robot.RobotMap;
import org.usfirst.frc.team79.robot.commands.ArcadeDrive;

import com.ctre.phoenix.motorcontrol.InvertType;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

public class DriveTrain extends Subsystem {
	
	public WPI_TalonSRX frontLeft, frontRight, backLeft, backRight;
	public DifferentialDrive drive;	
	public DriveTrain()
	{
		frontLeft = new WPI_TalonSRX (RobotMap.frontLeftTalon);
		frontRight = new WPI_TalonSRX(RobotMap.frontRightTalon);
		backLeft = new WPI_TalonSRX(RobotMap.backLeftTalon);
		backRight = new WPI_TalonSRX(RobotMap.backRightTalon);
		drive = new DifferentialDrive(frontLeft, frontRight);
		
		backLeft.follow(frontLeft);
		backRight.follow(frontRight);

	
		frontLeft.setInverted(false);
		backLeft.setInverted(InvertType.FollowMaster);
		frontRight.setInverted(true);
		backRight.setInverted(InvertType.FollowMaster);

		drive.setRightSideInverted(false);
	}

	@Override
	protected void initDefaultCommand() {
		this.setDefaultCommand(new ArcadeDrive());
	
	}

}
