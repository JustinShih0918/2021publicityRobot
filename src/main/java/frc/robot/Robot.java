// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.XboxController;

/**                                                  
 * The VM is configured to automatically run this class, and to call the functions corresponding to
 * each mode, as described in the TimedRobot documentation. If you change the name of this class or
 * the package after creating this project, you must also update the build.gradle file in the
 * project.
 */

public class Robot extends TimedRobot {
  XboxController joy = new XboxController(0);
  VictorSP shoot = new VictorSP(4);
  VictorSP base1 = new VictorSP(0);
  VictorSP base2 = new VictorSP(1);
  VictorSP base3 = new VictorSP(2);
  VictorSP base4 = new VictorSP(3);
  VictorSP barrier = new VictorSP(6);
  Timer timer = new Timer();

  @Override
  public void robotInit() {}

  @Override
  public void robotPeriodic() {}

  @Override
  public void autonomousInit() {}

  @Override
  public void autonomousPeriodic() {}

  @Override
  public void teleopInit() {}

  @Override
  public void teleopPeriodic() {
    base1.set(-joy.getRawAxis(1)/3);
    base2.set(joy.getRawAxis(5)/3);
    base3.set(joy.getRawAxis(5)/3);
    base4.set(-joy.getRawAxis(1)/3);
    
    if(joy.getRawButton(4)){
      shoot.set(-0.7);
    }
    else{
      shoot.set(0);
    }
    if(joy.getRawButton(3)){
      barrier.set(0.3);
    }
    else{
      barrier.set(0);
    }


  }

  @Override
  public void disabledInit() {}

  @Override
  public void disabledPeriodic() {}

  @Override
  public void testInit() {}

  @Override
  public void testPeriodic() {}
}
