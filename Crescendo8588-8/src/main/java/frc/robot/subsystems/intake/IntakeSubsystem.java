// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems.intake;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

// import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

import com.revrobotics.CANSparkMax;

// CONSTANTS
import frc.robot.Constants.IntakeConstants;

public class IntakeSubsystem extends SubsystemBase {
  private IntakeChassis chassis;

  /** Creates a new IntakeSubsystem. */
  public IntakeSubsystem(IntakeChassis chassis) {
    this.chassis = chassis;

    // Additional initialization stuff here if needed

    setCoast();
  }

  /** sets intake idlemode to brake */
  public void setBrake() {
    chassis.getIntake().setIdleMode(CANSparkMax.IdleMode.kBrake);
  }

  /** sets intake idlemode to coast */
  public void setCoast() {
    chassis.getIntake().setIdleMode(CANSparkMax.IdleMode.kCoast);
  }

  /** move intake motor to suck the note in */
  public void intakeIn() {
    // System.out.println("Intake in");
    SmartDashboard.putString("Intake State", "In");
    SmartDashboard.putNumber("Intake Velocity", IntakeConstants.kIntakeInSpeed);

    chassis.getIntake().set(IntakeConstants.kIntakeInSpeed);
  }

  /** move intake motor to push the note out */
  public void intakeOut() {
    // System.out.println("Intake out");
    SmartDashboard.putString("Intake State", "Out");
    SmartDashboard.putNumber("Intake Velocity", -IntakeConstants.kIntakeOutSpeed);

    chassis.getIntake().set(-IntakeConstants.kIntakeOutSpeed);
  }

  /** stop intake motor */
  public void intakeStop() {
    // System.out.println("Intake stopped");
    SmartDashboard.putString("Intake State", "Stopped");
    SmartDashboard.putNumber("Intake Velocity", 0);

    chassis.getIntake().set(0);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
