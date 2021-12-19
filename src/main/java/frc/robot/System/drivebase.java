package frc.robot.System;

import edu.wpi.first.wpilibj.VictorSP;
import frc.robot.Robot;

public class drivebase {

    public static VictorSP base1;
    private static VictorSP base2;
    private static VictorSP base3;
    private static VictorSP base4;

    public static void init(){
        base3 = new VictorSP(5);
        base2 = new VictorSP(3);
        base1 = new VictorSP(0);
        base4 = new VictorSP(1);
    }

    public static void teleop(){
        base2.set(-Robot.joy.getRawAxis(1));
        base3.set(-Robot.joy.getRawAxis(1));
        base1.set(Robot.joy.getRawAxis(5));
        base4.set(Robot.joy.getRawAxis(5));
    }
    
}
