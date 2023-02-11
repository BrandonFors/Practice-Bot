// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DriveTrainSub extends SubsystemBase {

  private CANSparkMax FrontRightMotor = new CANSparkMax(2, MotorType.kBrushless);
  private CANSparkMax FrontLeftMotor = new CANSparkMax(4, MotorType.kBrushless);
  private CANSparkMax BackRightMotor = new CANSparkMax(9, MotorType.kBrushless);



  
  private CANSparkMax BackLeftMotor = new CANSparkMax(5, MotorType.kBrushless);

  private final MotorControllerGroup rightMotors = new MotorControllerGroup(FrontRightMotor,BackRightMotor);
  private final MotorControllerGroup leftMotors = new MotorControllerGroup(FrontLeftMotor, BackLeftMotor);

  private DifferentialDrive driveTrain = new DifferentialDrive(leftMotors, rightMotors);
  
  public DriveTrainSub() {

  }

  public void driveRobot(double speed,double rotation){
    driveTrain.arcadeDrive(speed, rotation);
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
