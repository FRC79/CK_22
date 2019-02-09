/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team79.robot.commands;

import java.util.ArrayList;

import com.ctre.phoenix.motorcontrol.ControlMode;

import org.usfirst.frc.team79.robot.Robot;
import org.usfirst.frc.team79.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

public class ElevatorStoppingPoints extends Command {
  
  public int levelSelector;
  public int level;
  public ArrayList<Integer> heights;
  public ElevatorStoppingPoints() {
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
    Robot.MagEncoder.reset();
    levelSelector = -1; //This variable is used to access the level of the rocket which you want to score at
    heights = new ArrayList<>(6); //Creates ArrayList of different encoder values that correspond to the respective cargo and hatch scoring levels on the Rocket
    heights.add(RobotMap.ROCKET_HATCH1_VALUE);
    heights.add(RobotMap.ROCKET_HATCH2_VALUE);
    heights.add(RobotMap.ROCKET_HATCH3_VALUE);
    heights.add(RobotMap.ROCKET_CARGO1_VALUE);
    heights.add(RobotMap.ROCKET_CARGO2_VALUE);
    heights.add(RobotMap.ROCKET_CARGO3_VALUE);
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    if(Robot.oi.drive.getRawButtonReleased(4)) { //Y button
      levelSelector++; //The Y button is used is used as the up level button
      //Each time you press it sets the level selector to the level you want to go to
    }
    else if(Robot.oi.drive.getRawButtonReleased(2)) { //A button
      levelSelector--; //The A button is used as the down level button
    }
    
    level = heights.get(levelSelector); //Sets the level variable to the encoder value of the level

    while(Robot.MagEncoder.get() < (level-1)) { //Runs until the encoder value gets close to the intended value
      Robot.elevator.leftMotor.set(ControlMode.PercentOutput, 0.5); 

      if (Robot.MagEncoder.get() >= RobotMap.ELEVATOR_MAX_HEIGHT) { //Stops the motor if the elevator gets clos to exceeding the max height
        Robot.elevator.stopMotors();
      }
    }
    while(Robot.MagEncoder.get() > (level+1)) { //Runs the motor downards until the encoder value gets close to the intended value
      Robot.elevator.leftMotor.set(ControlMode.PercentOutput, -0.5);
    }

    if(levelSelector > 5) { //Makes sure that only levels 0-5 are accessed as there are only 6 levels
      levelSelector = 5;
    }

    if(levelSelector < 0) {
      levelSelector = 0;
    }

    
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
  }
}
