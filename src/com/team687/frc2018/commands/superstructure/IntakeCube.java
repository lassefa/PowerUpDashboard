package com.team687.frc2018.commands.superstructure;

import com.team687.frc2018.commands.intake.CloseClaw;
import com.team687.frc2018.commands.intake.SetintakeRollerPower;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class IntakeCube extends CommandGroup {

    public IntakeCube() {
	addSequential(new CloseClaw());
	addSequential(new SetintakeRollerPower(0));
    }

}
