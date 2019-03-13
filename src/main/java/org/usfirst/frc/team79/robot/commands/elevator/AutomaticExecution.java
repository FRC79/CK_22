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

//Used for specific automatic control of elevator, ensuring that it stops at the 6 different levels on the rocket
public class AutomaticExecution extends Command {
  
  public int level;
  public AutomaticExecution() {
    level = PointSelection.level;
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
   
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    if(Robot.MagEncoder.get() < (level-1)) {
      Robot.elevator.leftMotor.set(ControlMode.PercentOutput, 0.5);

      if (Robot.MagEncoder.get() >= RobotMap.ELEVATOR_MAX_HEIGHT) {
        Robot.elevator.stopMotors();
      }
    }
    if(Robot.MagEncoder.get() > (level+1)) {
      Robot.elevator.leftMotor.set(ControlMode.PercentOutput, -0.5);
    }
    
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    if(Robot.MagEncoder.get() >= (level+1) && Robot.MagEncoder.get() <= (level+1)) {
      return true;
    }
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
  }
}
