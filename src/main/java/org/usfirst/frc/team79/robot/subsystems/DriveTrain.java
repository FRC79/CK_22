package org.usfirst.frc.team79.robot.subsystems;

import org.usfirst.frc.team79.robot.RobotMap;
import org.usfirst.frc.team79.robot.commands.ArcadeDrive;

import com.ctre.phoenix.motorcontrol.InvertType;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

//subsystem to control drive train
public class DriveTrain extends Subsystem {
	
	public WPI_TalonSRX frontLeft, frontRight, backLeft, backRight;
	public DifferentialDrive drive;	
	public DriveTrain()
	{
		frontLeft = new WPI_TalonSRX (RobotMap.frontLeftTalon); //initialize talons
		frontRight = new WPI_TalonSRX(RobotMap.frontRightTalon);
		backLeft = new WPI_TalonSRX(RobotMap.backLeftTalon);
		backRight = new WPI_TalonSRX(RobotMap.backRightTalon);
		drive = new DifferentialDrive(frontLeft, frontRight);//Initializes drive train
		
		backLeft.follow(frontLeft); //backLeft follows frontLeft
		backRight.follow(frontRight); //backRight follows frontRight

		frontRight.setInverted(true); //makes the right side of the drive train go forward 
		backRight.setInverted(InvertType.FollowMaster); 
	}

	@Override
	protected void initDefaultCommand() {
		this.setDefaultCommand(new ArcadeDrive()); //VERY IMPORTANT!!! Sets the arcade drive command as default for the subsystem
	
	}

}
