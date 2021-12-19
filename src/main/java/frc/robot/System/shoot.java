package frc.robot.System;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.VictorSP;
import frc.robot.Robot;

public class shoot {
  private static VictorSP shoot;
  private static VictorSP barrier;
  private static Timer Timer = new Timer();

  public static void init() {
    shoot = new VictorSP(6);
    barrier = new VictorSP(9);
    Timer = new Timer();
  }

  public static void teleop() {
    if (Robot.joy.getYButton()) {
      shoot.set(0.7);
    } else {
      shoot.set(0);
    }
    if (Robot.joy.getYButtonPressed()) {
      Timer.start();
    }
    if (Timer.get() > 0.8 && Timer.get() < 1.5) {
      barrier.set(0.7);
    } else if (Timer.get() > 1.5) {
      barrier.set(0);
      Timer.stop();
      Timer.reset();
    }
    if (Robot.joy.getAButton()) {
      barrier.set(0.3);
    } else {
      barrier.set(0);
    }
  }

}
