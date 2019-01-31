// /*----------------------------------------------------------------------------*/
// /* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
// /* Open Source Software - may be modified and shared by FRC teams. The code   */
// /* must be accompanied by the FIRST BSD license file in the root directory of */
// /* the project.                                                               */
// /*----------------------------------------------------------------------------*/

// package org.usfirst.frc.team79.robot.commands;

// import org.usfirst.frc.team79.robot.Robot;

// import edu.wpi.first.wpilibj.command.Command;

// public class CameraFeed extends Command {
  
//   boolean prevTrigger;
//   boolean cameraSwitch;
//   public CameraFeed() {
//   }

//   // Called just before this Command runs the first time
//   @Override
//   protected void initialize() {
//     prevTrigger = false;
//     cameraSwitch = false;
//   }

//   // Called repeatedly when this Command is scheduled to run
//   @Override
//   protected void execute() {
//     prevTrigger = Robot.oi.drive.getRawButton(2);                                                                                                                                                                            
//     if (prevTrigger == true) {
//       if(cameraSwitch == true)
//         cameraSwitch = false;
//       if(cameraSwitch = false) 
//         cameraSwitch = true;
//     }

//     if(cameraSwitch == true) {
//       Robot.camera2.setResolution(680, 460);
//       Robot.camera2.setFPS(8);
//       Robot.camera.setResolution(1, 1);
//       Robot.camera.setFPS(1);
//     }

//     if(cameraSwitch == false) {
//       Robot.camera.setResolution(680, 460);
//       Robot.camera.setFPS(8);
//       Robot.camera2.setResolution(1, 1);
//       Robot.camera2.setFPS(1);
//     }
//     prevTrigger = false;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           
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
