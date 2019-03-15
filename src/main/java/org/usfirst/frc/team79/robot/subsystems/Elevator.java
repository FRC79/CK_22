package org.usfirst.frc.team79.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

// import org.usfirst.frc.team79.robot.Robot;
import org.usfirst.frc.team79.robot.RobotMap;
import org.usfirst.frc.team79.robot.commands.elevator.ControlElevator;

import edu.wpi.first.wpilibj.command.Subsystem;

//creates subsystem to control elevator
public class Elevator extends Subsystem {

	public TalonSRX motor;
	public Elevator() {
		motor = new TalonSRX(RobotMap.elevator1Talon);
		// Robot.MagEncoder.reset();
	}
	
	public void stopMotors() {
		motor.set(ControlMode.PercentOutput, 0);
	}
	
	@Override
	protected void initDefaultCommand() {
		this.setDefaultCommand(new ControlElevator());
	}
}
