/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team79.robot.commands.elevator;

import com.ctre.phoenix.motorcontrol.ControlMode;

import org.usfirst.frc.team79.robot.Robot;
import org.usfirst.frc.team79.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

//Used for manual control of elevator
public class ControlElevator extends Command {
  public ControlElevator() {
    // Use requires() here to declare subsystem dependencies
    requires(Robot.elevator);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
    Robot.elevator.motor.configFactoryDefault();
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    double value = Robot.oi.operator.getY();
    Robot.elevator.motor.set(ControlMode.PercentOutput, value);

    // if(Robot.MagEncoder.get() <= RobotMap.ELEVATOR_MIN_HEIGHT) {
    //   Robot.elevator.stopMotors();
    // }
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
