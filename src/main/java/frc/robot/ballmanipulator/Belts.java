package frc.robot.ballmanipulator;

// TODO Need to find what motor this is and change class accordingly
import edu.wpi.first.wpilibj.motorcontrol.MotorController;

public class Belts
{
    private final MotorController  speedController;
    public Belts(MotorController speedController)
    {
        this.speedController = speedController;
    }
    public void spin(double speed)
    {
        speedController.set(speed);
    }
}