// /*----------------------------------------------------------------------------*/
// /* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
// /* Open Source Software - may be modified and shared by FRC teams. The code   */
// /* must be accompanied by the FIRST BSD license file in the root directory of */
// /* the project.                                                               */
// /*----------------------------------------------------------------------------*/

// package org.usfirst.frc.team79.robot.commands;

// import java.util.ArrayList;

// import com.ctre.phoenix.motorcontrol.ControlMode;

// import org.usfirst.frc.team79.robot.Robot;
// import org.usfirst.frc.team79.robot.RobotMap;

// import edu.wpi.first.wpilibj.command.Command;

// public class ElevatorStoppingPoints extends Command {
  
//   public int targetCount;
//   public int level;
//   public ArrayList<Integer> heights;
//   public ElevatorStoppingPoints() {
//   }

//   // Called just before this Command runs the first time
//   @Override
//   protected void initialize() {
//     Robot.MagEncoder.reset();
//     targetCount = -1;
//     heights = new ArrayList<>(6);
//     heights.add(RobotMap.ROCKET_HATCH1_VALUE);
//     heights.add(RobotMap.ROCKET_HATCH2_VALUE);
//     heights.add(RobotMap.ROCKET_HATCH3_VALUE);
//     heights.add(RobotMap.ROCKET_CARGO1_VALUE);
//     heights.add(RobotMap.ROCKET_CARGO2_VALUE);
//     heights.add(RobotMap.ROCKET_CARGO3_VALUE);
//   }

//   // Called repeatedly when this Command is scheduled to run
//   @Override
//   protected void execute() {
//     if(Robot.oi.drive.getRawButtonReleased(4)) { //Y button
//       targetCount++;
//     }
//     else if(Robot.oi.drive.getRawButtonReleased(2)) { //A button
//       targetCount--;
//     }
    
//     level = heights.get(targetCount);

//     while(Robot.MagEncoder.get() < (level-1)) {
//       Robot.elevator.leftMotor.set(ControlMode.PercentOutput, 0.5);

//       if (Robot.MagEncoder.get() >= RobotMap.ELEVATOR_MAX_HEIGHT) {
//         Robot.elevator.stopMotors();
//       }
//     }
//     while(Robot.MagEncoder.get() > (level+1)) {
//       Robot.elevator.leftMotor.set(ControlMode.PercentOutput, -0.5);
//     }

//     if(targetCount > 5) {
//       targetCount = 5;
//     }

//     if(targetCount < 0) {
//       targetCount = 0;
//     }

    
//   }

//   // Make this return true when this Command no longer needs to run execute()
//   @Override
//   protected boolean isFinished() {
//     return false;
//   }

//   // Called once after isFinished returns true
//   @Override
//   protected void end() {
//   }

//   // Called when another command which requires one or more of the same
//   // subsystems is scheduled to run
//   @Override
//   protected void interrupted() {
//   }
// }
