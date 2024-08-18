package org.firstinspires.ftc.teamcode.PTP;

import com.arcrobotics.ftclib.controller.PIDController;

import java.util.List;

public class Trajectory {
        private final PIDController xController = new PIDController(0.001,0,0);
        private final PIDController yController = new PIDController(0.001,0,0);
        private final PIDController turnController = new PIDController(0.001,0,0);

        private List<Point> trajectory;


        public Point getPoint(int currentIndex){
            return this.trajectory.get(currentIndex);
        }

        private boolean tolerance(double value,double min,double max){
            return value >= min && value <= max;
        }
        private double averageError(double x, double y, double turn){
            return (x + y + turn) / 3;
        }

    }
