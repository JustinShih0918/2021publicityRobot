package frc.robot.System;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.VictorSP;
import frc.robot.Robot;

public class shoot {
    private static VictorSP shoot = new VictorSP(4);
    private static VictorSP barrier = new VictorSP(6);
    private static Timer timer = new Timer();

    public static void teleopInit(){
        shoot = new VictorSP(4);
        barrier = new VictorSP(6);
        timer = new Timer();
    }
    public static void teleopPeriodic(){
        if(Robot.joy.getYButton()){
            shoot.set(-0.8);
          }
          else{
            shoot.set(0);
          }
        if(Robot.joy.getYButtonPressed()){
            timer.start();
        }
        if(timer.get()>0.8&&timer.get()<1.5&&timer.get()!=0){
            barrier.set(0.3);
          }
        else if(timer.get()>1.5){
            barrier.set(0);
            timer.stop();
            timer.reset();
          }
        else if(Robot.joy.getAButton()){
            barrier.set(0.3);
          }
        else{
            barrier.set(0);
        }
    }

    public static void shootTheBall(){
        shoot.set(1);
    }
}
