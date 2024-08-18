package StrategyPattern.DrivingStrategy;

public class SportsDrive implements DrivingStrategy {
    @Override
    public void driveStrategy() {
        System.out.println("SportsDrive Strategy");
    }
}
