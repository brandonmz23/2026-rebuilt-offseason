package frc.robot.subsystems;
import com.revrobotics.PersistMode;
import com.revrobotics.RelativeEncoder;
import com.revrobotics.ResetMode;
import com.revrobotics.spark.SparkClosedLoopController;
import com.revrobotics.spark.SparkMax;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.FloorSubsystemConstants;
import frc.robot.Configs;

public class FloorSubsystem extends SubsystemBase {

    private final SparkMax floorMotor  = new SparkMax(FloorSubsystemConstants.kFloorMotorCanID, SparkMax.MotorType.kBrushless);;
    private RelativeEncoder floorEncoder;
    private SparkClosedLoopController floorController = floorMotor.getClosedLoopController();
    
    private final SparkMax floorFollowerMotor = new SparkMax(FloorSubsystemConstants.kFloorFollowerMotorCanID, SparkMax.MotorType.kBrushless);
  public FloorSubsystem() {

    floorMotor.configure(Configs.FloorSubsystem.floorMotorConfig, ResetMode.kResetSafeParameters, PersistMode.kPersistParameters);
    floorFollowerMotor.configure(Configs.FloorSubsystem.floorMotorFollowerConfig, ResetMode.kResetSafeParameters, PersistMode.kPersistParameters);

    floorEncoder = floorMotor.getEncoder();
    floorEncoder.setPosition(0);

  }

  

  @Override
  public void periodic() {
   
}
} 

