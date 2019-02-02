/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team79.robot.subsystems;

import org.usfirst.frc.team79.robot.RobotMap;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * Add your docs here.
 */
public class Climber extends Subsystem {
  public DoubleSolenoid grip;
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  public Climber() {
    grip = new DoubleSolenoid(RobotMap.CLIMBER_GRIP, RobotMap.CLIMBER_UNGRIP);
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

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
