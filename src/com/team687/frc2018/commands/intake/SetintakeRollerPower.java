package com.team687.frc2018.commands.intake;

import com.team687.frc2018.Robot;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class SetintakeRollerPower extends Command {

    private double m_power;

    public SetintakeRollerPower(double power) {
	m_power = power;
	requires(Robot.intake);
    }

    protected void initialize() {
	SmartDashboard.putString("Current Intake Command", "SetintakeRollerPower: " + m_power);
    }

    protected void execute() {
	Robot.intake.setRollerPower(m_power);
    }

    protected boolean isFinished() {
	return Robot.intake.getRollerVoltage() / 12 == m_power;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}