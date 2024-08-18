package StrategyPattern;

import StrategyPattern.DrivingStrategy.FunDrive;
import StrategyPattern.DrivingStrategy.SportsDrive;
import StrategyPattern.Vehicles.HillVehicle;
import StrategyPattern.Vehicles.NormalVehicle;
import StrategyPattern.Vehicles.Vehicle;

public class StrategyPatternMain {
    public static void main(String[] args) {
        Vehicle normalVehicle = new NormalVehicle(new FunDrive());
        Vehicle hillVehicle = new HillVehicle(new SportsDrive());

        normalVehicle.drive();
        hillVehicle.drive();
    }
}
