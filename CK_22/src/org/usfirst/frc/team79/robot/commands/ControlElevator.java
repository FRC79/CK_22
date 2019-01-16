package org.usfirst.frc.team79.robot.commands;

import org.usfirst.frc.team79.robot.Robot;

import com.ctre.phoenix.motorcontrol.ControlMode;

import edu.wpi.first.wpilibj.command.Command;

public class ControlElevator extends Command {

	public ControlElevator()
	{
		requires(Robot.elevator);
	}
	
	protected void execute() {
		double value = Robot.oi.operator.getY();
		Robot.elevator.talon.set(ControlMode.PercentOutput, value);
	}
	

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

}
