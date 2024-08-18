package StrategyPattern.Vehicles;

import StrategyPattern.DrivingStrategy.DrivingStrategy;

public class HillVehicle implements Vehicle {
    DrivingStrategy drivingStrategy;
    public HillVehicle(DrivingStrategy drivingStrategy) {
        this.drivingStrategy = drivingStrategy;
    }
    @Override
    public void drive() {
        this.drivingStrategy.driveStrategy();
    }
}
