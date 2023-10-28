package frc.robot.weelspinner;

import edu.wpi.first.wpilibj.motorcontrol.MotorController;

public class Spinner
{
    private final MotorController spinnerMotor;

    public Spinner (MotorController spinnerMotor)
    {
        this.spinnerMotor = spinnerMotor;
    }
}