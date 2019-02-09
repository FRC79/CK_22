package org.usfirst.frc.team79.robot.commands;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.SPI;

public class SerialCommunication extends Command {
    SPI SendRecieve = new SPI(SPI.Port.kOnboardCS0);
    boolean InputFinished = false;
    int WriteCount = 0;
    byte[] SendBytes;
    String SendString;
    public void InputData(String SendData){
        SendString = SendData;
    }

    @Override
    protected void initialize() {
    }
    @Override
    protected void execute() {
        WriteCount = SendRecieve.write(SendString.getBytes(), SendString.getBytes().length);
        InputFinished = true;
    }

    @Override
    protected boolean isFinished() {
        return InputFinished;
    }
    @Override
    protected void end() {
    }
    @Override
    protected void interrupted() {
    }
}