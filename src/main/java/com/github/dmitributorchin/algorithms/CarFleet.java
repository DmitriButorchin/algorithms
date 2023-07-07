package com.github.dmitributorchin.algorithms;

import java.util.Comparator;
import java.util.stream.IntStream;

/**
 * There are n cars going to the same destination along a one-lane road.
 * The destination is target miles away.
 * <p>
 * You are given two integer array position and speed, both of length n,
 * where position[i] is the position of the ith car
 * and speed[i] is the speed of the ith car (in miles per hour).
 * <p>
 * A car can never pass another car ahead of it,
 * but it can catch up to it and drive bumper to bumper at the same speed.
 * The faster car will slow down to match the slower car's speed.
 * The distance between these two cars is ignored (i.e., they are assumed to have the same position).
 * <p>
 * A car fleet is some non-empty set of cars driving at the same position and same speed.
 * Note that a single car is also a car fleet.
 * <p>
 * If a car catches up to a car fleet right at the destination point, it will still be considered as one car fleet.
 * <p>
 * Return the number of car fleets that will arrive at the destination.
 */
public class CarFleet {
    public int carFleet(int target, int[] position, int[] speed) {
        var cars = IntStream.range(0, position.length)
                .mapToObj(index -> new Car(position[index], speed[index]))
                .sorted(Comparator.comparingInt((Car car) -> car.position).reversed())
                .toList();

        int fleets = 0;
        double steps = Double.MIN_VALUE;
        for (var car : cars) {
            double currentSteps = (target - car.position) / car.speed;
            if (currentSteps > steps) {
                fleets++;
                steps = currentSteps;
            }
        }

        return fleets;
    }

    private record Car(int position, double speed) {
    }
}
