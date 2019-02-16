/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team79.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import org.usfirst.frc.team79.robot.RobotMap;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * Add your docs here.
 */
public class Gripper extends Subsystem {
  public DoubleSolenoid grip;
  public Solenoid deployDown;
  public TalonSRX motor;
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  public Gripper() {
    grip = new DoubleSolenoid(RobotMap.GRIPPER_HUG, RobotMap.GRIPPER_UNHUG);
    deployDown = new Solenoid(RobotMap.GRIPPER_DEPLOY_DOWN);
    motor = new TalonSRX(RobotMap.gripper1Talon);

  }

  public void solenoidExpand() {
    grip.set(DoubleSolenoid.Value.kForward);
  }

  public void solenoidRetract() {
    grip.set(DoubleSolenoid.Value.kReverse);
  }

  public void solenoidOff() {
    grip.set(DoubleSolenoid.Value.kOff);
  }

  public void stopMotor() {
    motor.set(ControlMode.PercentOutput, 0);
  }


  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
