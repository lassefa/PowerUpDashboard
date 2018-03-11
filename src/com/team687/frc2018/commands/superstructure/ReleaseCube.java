package com.team687.frc2018.commands.superstructure;

import com.team687.frc2018.commands.intake.OpenClaw;
import com.team687.frc2018.commands.intake.SetintakeRollerPower;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class ReleaseCube extends CommandGroup {

    public ReleaseCube() {
	addSequential(new SetintakeRollerPower(0));
	addSequential(new OpenClaw());
    }

}
