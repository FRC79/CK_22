/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team79.robot.commands.elevator;

import java.util.ArrayList;

import org.usfirst.frc.team79.robot.Robot;
import org.usfirst.frc.team79.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class PointSelection extends Command {

  public int targetCount;
  public static int level;
  public ArrayList<Integer> heights;
  public String levelDisplay;
  public PointSelection() {
    targetCount = -1;
    heights = new ArrayList<>(6);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
    Robot.elevator.leftMotor.configFactoryDefault();
    Robot.elevator.rightMotor.configFactoryDefault();
    Robot.MagEncoder.reset();

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
    if(Robot.oi.drive.getRawButtonPressed(4)) { //Y button
      targetCount++;
    }
    else if(Robot.oi.drive.getRawButtonPressed(2)) { //A button
      targetCount--;
    }
    
    level = heights.get(targetCount);
    if(level == RobotMap.ROCKET_HATCH1_VALUE) {levelDisplay = "Hatch Level 1";}
    if(level == RobotMap.ROCKET_HATCH2_VALUE) {levelDisplay = "Hatch Level 2";}
    if(level == RobotMap.ROCKET_HATCH3_VALUE) {levelDisplay = "Hatch Level 3";}
    if(level == RobotMap.ROCKET_CARGO1_VALUE) {levelDisplay = "Cargo Level 1";}
    if(level == RobotMap.ROCKET_CARGO2_VALUE) {levelDisplay = "Cargo Level 2";}
    if(level == RobotMap.ROCKET_CARGO3_VALUE) {levelDisplay = "Cargo Level 3";}
  
    SmartDashboard.putString("Elevator Level", levelDisplay);

    if(targetCount > 5) {
      targetCount = 5;
    }

    if(targetCount < 0) {
      targetCount = 0;
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
}
