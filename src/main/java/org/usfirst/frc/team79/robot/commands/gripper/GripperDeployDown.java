// /*----------------------------------------------------------------------------*/
// /* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
// /* Open Source Software - may be modified and shared by FRC teams. The code   */
// /* must be accompanied by the FIRST BSD license file in the root directory of */
// /* the project.                                                               */
// /*----------------------------------------------------------------------------*/

// package org.usfirst.frc.team79.robot.commands.gripper;

// import org.usfirst.frc.team79.robot.Robot;

// import edu.wpi.first.wpilibj.command.Command;

// //Punches down gripper to prepare for grasping of third HAB platform
// public class GripperDeployDown extends Command {
//   public GripperDeployDown() {
//     // Use requires() here to declare subsystem dependencies
//     // eg. requires(chassis);
//   }

//   // Called just before this Command runs the first time
//   @Override
//   protected void initialize() {
//   }

//   // Called repeatedly when this Command is scheduled to run
//   @Override
//   protected void execute() {
//     Robot.gripper.solenoidExpand(Robot.gripper.deploy);
//   }

//   // Make this return true when this Command no longer needs to run execute()
//   @Override
//   protected boolean isFinished() {
//     return true;
//   }

//   // Called once after isFinished returns true
//   @Override
//   protected void end() {
//   }
// }
