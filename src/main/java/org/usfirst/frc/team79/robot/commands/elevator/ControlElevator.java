/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team79.robot.commands.elevator;

import com.ctre.phoenix.motorcontrol.ControlMode;

import org.usfirst.frc.team79.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;


public class ControlElevator extends Command {
  public ControlElevator() {
    // Use requires() here to declare subsystem dependencies
    requires(Robot.elevator);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
    Robot.elevator.leftMotor.configFactoryDefault();
    Robot.elevator.rightMotor.configFactoryDefault();
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    double value = Robot.oi.operator.getY();

    if(value < 0) {
      value = 0.5 * Robot.oi.operator.getY();
    }
    Robot.elevator.leftMotor.set(ControlMode.PercentOutput, value);
    Robot.elevator.rightMotor.set(ControlMode.PercentOutput, value);
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
    Robot.elevator.stopMotors();
  }
}
