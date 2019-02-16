/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team79.robot.commands.intake;

import com.ctre.phoenix.motorcontrol.ControlMode;

import org.usfirst.frc.team79.robot.Robot;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

public class IntakeOut extends Command {
  
  public float time;
  public boolean doTime;
  public Timer timer;
  
  public IntakeOut() {
    time = -1;
  }

  public IntakeOut(float time)
  {
    this.time = time;
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
    
    if(time >= 0) {
			doTime = true;
		}

		timer = new Timer();
		timer.start();
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    Robot.intake.leftMotor.set(ControlMode.PercentOutput, -0.8);
    Robot.intake.rightMotor.set(ControlMode.PercentOutput, -0.8);
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
    Robot.intake.stopMotors();
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return doTime && timer.hasPeriodPassed(time);
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
  }
}
