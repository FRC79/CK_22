package org.usfirst.frc.team79.robot.subsystems;

import org.usfirst.frc.team79.robot.RobotMap;
import org.usfirst.frc.team79.robot.commands.ArcadeDrive;
import org.usfirst.frc.team79.robot.utilities.ArcadeUtil;

import com.ctre.phoenix.motorcontrol.InvertType;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj.command.Subsystem;

//subsystem to control drive train
public class DriveTrain extends Subsystem {
	
	public WPI_TalonSRX frontLeftMotor, frontRightMotor;
	public WPI_VictorSPX backLeftMotor, backRightMotor;
	public ArcadeUtil drive;	
	public DriveTrain() {
		frontLeftMotor = new WPI_TalonSRX (RobotMap.frontLeftDriveTalon); //initialize talons
		frontRightMotor = new WPI_TalonSRX(RobotMap.frontRightDriveTalon);
		backLeftMotor = new WPI_VictorSPX(RobotMap.backLeftDriveVictor);
		backRightMotor = new WPI_VictorSPX(RobotMap.backRightDriveVictor);
		drive = new ArcadeUtil(frontLeftMotor, frontRightMotor);//Initializes drive train
		
		backLeftMotor.follow(frontLeftMotor); //backLeft follows frontLeft
		backRightMotor.follow(frontRightMotor); //backRight follows frontRight

		frontRightMotor.setInverted(true); //makes the right side of the drive train go forward 
		backRightMotor.setInverted(InvertType.FollowMaster); 

		drive.setRightSideInverted(false);
	}

	@Override
	protected void initDefaultCommand() {
		this.setDefaultCommand(new ArcadeDrive()); //VERY IMPORTANT!!! Sets the arcade drive command as default for the subsystem
	}

}
