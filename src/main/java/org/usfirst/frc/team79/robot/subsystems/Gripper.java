// /*----------------------------------------------------------------------------*/
// /* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
// /* Open Source Software - may be modified and shared by FRC teams. The code   */
// /* must be accompanied by the FIRST BSD license file in the root directory of */
// /* the project.                                                               */
// /*----------------------------------------------------------------------------*/

// package org.usfirst.frc.team79.robot.subsystems;

// import com.ctre.phoenix.motorcontrol.ControlMode;
// import com.ctre.phoenix.motorcontrol.can.TalonSRX;

// import org.usfirst.frc.team79.robot.RobotMap;

// import edu.wpi.first.wpilibj.DoubleSolenoid;
// import edu.wpi.first.wpilibj.command.Subsystem;

// public class Gripper extends Subsystem {
//   public DoubleSolenoid grip;
//   public DoubleSolenoid deploy;
//   public TalonSRX motor1;
//   public TalonSRX motor2;

//   public Gripper() {
//     grip = new DoubleSolenoid(RobotMap.GRIPPER_HUG, RobotMap.GRIPPER_UNHUG);
//     deploy = new DoubleSolenoid(RobotMap.GRIPPER_DEPLOY_DOWN, RobotMap.GRIPPER_DEPLOY_UP);
//     motor1 = new TalonSRX(RobotMap.gripper1Talon);
//     motor2 = new TalonSRX(RobotMap.gripper2Talon);

//   }

//   public void solenoidExpand(DoubleSolenoid solenoid) {
//     solenoid.set(DoubleSolenoid.Value.kForward);
//   }

//   public void solenoidRetract(DoubleSolenoid solenoid) {
//     solenoid.set(DoubleSolenoid.Value.kReverse);
//   }

//   public void solenoidOff(DoubleSolenoid solenoid) {
//     solenoid.set(DoubleSolenoid.Value.kOff);
//   }

//   public void stopMotor() {
//     motor1.set(ControlMode.PercentOutput, 0);
//     motor2.set(ControlMode.PercentOutput, 0);
//   }

//   @Override
//   public void initDefaultCommand() {
//     // Set the default command for a subsystem here.
//     // setDefaultCommand(new MySpecialCommand());
//   }
// }
