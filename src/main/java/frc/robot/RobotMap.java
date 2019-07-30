/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;
import edu.wpi.first.wpilibj.Encoder;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.CounterBase;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
  
  public Encoder liftEncoder;
  public WPI_TalonSRX liftController;
  public WPI_TalonSRX intakeMotor;
  public WPI_TalonSRX wristMotor;

  public RobotMap() {

    liftController = new WPI_TalonSRX(11); // TODO: get real values
    liftEncoder = new Encoder(1, 2, false, CounterBase.EncodingType.k4X);
    intakeMotor = new WPI_TalonSRX(21); 
    wristMotor = new WPI_TalonSRX(10);
  }


}
