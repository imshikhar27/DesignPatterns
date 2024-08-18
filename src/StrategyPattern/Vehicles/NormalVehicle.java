package StrategyPattern.Vehicles;

import StrategyPattern.DrivingStrategy.DrivingStrategy;

public class NormalVehicle implements Vehicle {
    DrivingStrategy drivingStrategy;
    public NormalVehicle(DrivingStrategy drivingStrategy) {
        this.drivingStrategy = drivingStrategy;
    }
    @Override
    public void drive() {
        this.drivingStrategy.driveStrategy();
    }
}
