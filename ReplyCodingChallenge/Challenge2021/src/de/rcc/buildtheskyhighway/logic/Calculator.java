package de.rcc.buildtheskyhighway.logic;

import de.rcc.buildtheskyhighway.data.Antenna;
import de.rcc.buildtheskyhighway.data.Building;

import java.util.HashMap;
import java.util.Map;

public class Calculator {
    public int calculateScore(Building[] buildings, Antenna[] antennas, int reward) {
        int score = 0;
        boolean areAllBuildingsConnected = true;
        HashMap<Integer, Integer> idToScore;
        for (Building building:buildings) {
            idToScore = new HashMap<>();
            for (Antenna antenna:antennas) {
                int distance = (int)Math.abs(antenna.getCoordination().getX()-building.getCoordination().getX()) +
                        (int)Math.abs(antenna.getCoordination().getY()-building.getCoordination().getY());
                if (distance <= antenna.getRange()) {
                    int calc = (building.getConnectionSpeedWeight() * antenna.getConnectionSpeed()) - building.getLatencyWeight() * distance;
                    idToScore.put(antenna.getId(), calc);
                }
            }
            if (!idToScore.isEmpty()) {
                int bestCalc = 0;
                for (Map.Entry<Integer, Integer> entry : idToScore.entrySet()) {
                    if (entry.getValue() > bestCalc) {
                        bestCalc = entry.getValue();
                    }
                }
                score += bestCalc;
            } else {
                areAllBuildingsConnected = false;
            }
        }
        if (areAllBuildingsConnected) {
            score += reward;
        }
        return score;
    }
}
