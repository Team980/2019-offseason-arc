package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import frc.robot.commands.AutoLiftCommand;
import frc.robot.commands.LiftManualCommand;
import frc.robot.subsystems.LiftSystem;


public class Robot extends TimedRobot {
  public static OI oi;

  public static RobotMap robotMap;
  public static LiftSystem liftSystem;

  Command AutoDriveCommand;
  Command AutoLiftCommand;
  Command LiftHoldCommand;

  @Override
  public void robotInit() {
    oi = new OI();
    robotMap = new RobotMap();

 }

  @Override
  public void robotPeriodic() {
    //dont put anything in here
    Scheduler.getInstance().run();
  }

  @Override
  public void disabledInit() {
  }

  @Override
  public void disabledPeriodic() {
  }


  @Override
  public void autonomousInit() {
    AutoLiftCommand = new AutoLiftCommand(50);
    AutoLiftCommand.start();

  }

  /**
   * This function is called periodically during autonomous.
   */
  @Override
  public void autonomousPeriodic() {
  }

  @Override
  public void teleopInit() {
    if(AutoLiftCommand != null)
    {
      AutoLiftCommand.cancel();
    }
    //AutoDriveCommand = new AutoDriveCommand();

    LiftManualCommand teleopLift = new LiftManualCommand();
    teleopLift.start();

    
  }

  /**
   * This function is called periodically during operator control.
   */
  @Override
  public void teleopPeriodic() {
  }

}
