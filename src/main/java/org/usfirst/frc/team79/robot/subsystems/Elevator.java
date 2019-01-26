package org.usfirst.frc.team79.robot.subsystems;

import org.usfirst.frc.team79.robot.RobotMap;
import org.usfirst.frc.team79.robot.commands.ControlElevator;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;

//creates subsystem to control elevator
public class Elevator extends Subsystem {

	public TalonSRX talon;
	public Elevator()
	{
		talon = new TalonSRX(RobotMap.elevatorTalon);
	}
	
	public void stopMotors()
	{
		talon.set(ControlMode.PercentOutput, 0);
	}
	
	
	@Override
	protected void initDefaultCommand() {
		this.setDefaultCommand(new ControlElevator());
		
	}

}
