package frc.robot.subsystems.breakit;

import com.revrobotics.CANSparkMax;

public class BreakChassis {
  private CANSparkMax rightmotor;
  private CANSparkMax leftmotor;

  public BreakChassis(CANSparkMax rightmotor, CANSparkMax leftmotor) {
    this.rightmotor = rightmotor;
    this.leftmotor = leftmotor;
  }

  public CANSparkMax getRightMotor() {
    return rightmotor;
  }

  public CANSparkMax getLeftMotor() {
    return leftmotor;
  }
}
