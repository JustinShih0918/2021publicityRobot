package frc.robot.System;

import edu.wpi.first.wpilibj.VictorSP;
import frc.robot.Robot;

public class drivebase {

    private static VictorSP base1;
    private static VictorSP base2;
    private static VictorSP base3;
    private static VictorSP base4;

    public static void teleopInit(){
        base1 = new VictorSP(0);
        base2 = new VictorSP(1);
        base3 = new VictorSP(2);
        base4 = new VictorSP(3);
    }

    public static void teleopPeriodic(){
        base2.set(-Robot.joy.getRawAxis(1)/3);
        base3.set(-Robot.joy.getRawAxis(1)/3);
  
        base1.set(Robot.joy.getRawAxis(5)/3);
        base4.set(Robot.joy.getRawAxis(5)/3);
      //left
      if(Robot.joy.getRawButton(5)&&Robot.joy.getRawAxis(1)>0){
        base2.set(-1);
        base3.set(-1);
      }
      else if(Robot.joy.getRawButton(5)&&Robot.joy.getRawAxis(1)<0){
        base2.set(1);
        base3.set(1);
      }
  
      //right
      if(Robot.joy.getRawButton(6)&&Robot.joy.getRawAxis(5)>0){
        base1.set(1);
        base4.set(1);
      }
      else if(Robot.joy.getRawButton(6)&&Robot.joy.getRawAxis(5)<0){
        base1.set(-1);
        base4.set(-1);
      }
    }
  public static void dirctControll(double a, double b){
    base1.set(a);
    base3.set(b);
  }
    
}
