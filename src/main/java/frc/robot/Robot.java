// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.XboxController;
import frc.robot.System.drivebase;
import frc.robot.System.shoot;

/**                                                  
 * The VM is configured to automatically run this class, and to call the functions corresponding to
 * each mode, as described in the TimedRobot documentation. If you change the name of this class or
 * the package after creating this project, you must also update the build.gradle file in the
 * project.6
 */

public class Robot extends TimedRobot {
  public static XboxController joy;

  @Override
  public void robotInit() {
    joy = new XboxController(0);
  }

  @Override
  public void robotPeriodic() {}

  @Override
  public void autonomousInit() {}

  @Override
  public void autonomousPeriodic() {}

  @Override
  public void teleopInit() {
    drivebase.teleopInit();
    shoot.teleopInit();
  }

  @Override
  public void teleopPeriodic() {
     drivebase.teleopPeriodic();
     shoot.teleopPeriodic();

  }

  @Override
  public void disabledInit() {}

  @Override
  public void disabledPeriodic() {}

  @Override
  public void testInit() {}

  @Override
  public void testPeriodic() {
    drivebase.dirctControll(0.5, -0.5);
  }
}
