package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp(name="Test Left", group="Testing")
public class TestLeft extends LinearOpMode {
    DcMotor leftMotor = null;

    public void runOpMode() throws InterruptedException {
        telemetry.addData("Say", "Hello Tester");
        telemetry.update();

        leftMotor = hardwareMap.dcMotor.get("left_drive");

        waitForStart();

        while (opModeIsActive()) {
            leftMotor.setPower(0.5);
        }
    }
}