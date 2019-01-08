package org.usfirst.frc.team79.robot.subsystems;

import org.usfirst.frc.team79.robot.RobotMap;
import org.usfirst.frc.team79.robot.util.ArcadeUtil;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;

public class DriveTrain extends Subsystem {
	
	public TalonSRX frontLeft, frontRight, backLeft, backRight;
	public ArcadeUtil arcadeUtil;
	
	public DriveTrain()
	{
		frontLeft = new TalonSRX (RobotMap.frontLeftTalon);
		frontRight = new TalonSRX(RobotMap.frontRightTalon);
		backLeft = new TalonSRX(RobotMap.backLeftTalon);
		backRight = new TalonSRX(RobotMap.backRightTalon);
		arcadeUtil = new ArcadeUtil(frontLeft, frontRight);
		
		backLeft.set(ControlMode.Follower, RobotMap.frontLeftTalon);
		backRight.set(ControlMode.Follower, RobotMap.frontRightTalon);
		

	}
	
	
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}

}
