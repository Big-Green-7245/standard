package org.firstinspires.ftc.teamcode;

// Standard Lib
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.util.*;

// Class import
import org.firstinspires.ftc.teamcode.modules.*;
import org.firstinspires.ftc.teamcode.util.*;


@Autonomous(name="AutoOpTest",group = "auto")
public class AutoOpTest extends LinearOpMode {
    // Define attributes
    final String programVer = "1.0";

    // Declare modules
    DriveTrain driveTrain;

    private ElapsedTime runtime = new ElapsedTime();

    // Define constants
    private final double constant = 1;

    @Override
    public void runOpMode() {
        // Initialize
        driveTrain = new DriveTrain();

        driveTrain.init(hardwareMap);
        TelemetryWrapper.init(telemetry,16);

        // Wait for start
        TelemetryWrapper.setLine(1, "AutoOp v" + programVer + "\t Press start to start >");
        waitForStart();

        // Start autonomous
        // Do something
    }

}