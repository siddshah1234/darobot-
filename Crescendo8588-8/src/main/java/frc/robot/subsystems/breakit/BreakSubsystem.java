// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems.breakit;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.IntakeConstants;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.Timer;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMax.IdleMode;
import com.revrobotics.CANSparkMax.MotorType;

public class BreakSubsystem extends SubsystemBase {
  /** Creates a new ExampleSubsystem. */
  private BreakChassis chassis;

  public BreakSubsystem(BreakChassis chassis) {
    this.chassis = chassis;
  }
    
  
  

  public void breakRobot() {
    chassis.getLeftMotor().set(0);
    // set constant speed for index right (use intake constant)
    chassis.getRightMotor().set(0);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
