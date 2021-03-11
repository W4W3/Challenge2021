package de.replycodingchallenge.buildtheskyhighway.logic;

import de.replycodingchallenge.buildtheskyhighway.data.Antenna;
import de.replycodingchallenge.buildtheskyhighway.data.Building;

import java.util.HashMap;
import java.util.Map;

public class Calculator {

    public int fullScore(Building[] buildings, Antenna[] antennas, int reward) {
        int score = 0;
        boolean areAllBuildingsAssigned = true;
        for (int i = 0; i < buildings.length; i++) {
            HashMap<Integer, Integer> scores = new HashMap<>();
            for (int j = 0; j < antennas.length; j++) {
                int distance = (int)Math.abs(buildings[i].getCoordination().getX()-antennas[j].getCoordination().getX()) + (int)Math.abs(buildings[i].getCoordination().getY()-antennas[j].getCoordination().getY());
                if (distance <= antennas[i].getRange()) {
                    int value = (buildings[i].getConnectionSpeedWeight()*antennas[j].getConnectionSpeed()) - (buildings[i].getLatencyWeight()*distance);
                    scores.put(j,value);
                }
            }
            if (!scores.isEmpty()) {
                Map.Entry<Integer, Integer> maxEntry = null;
                for (Map.Entry<Integer, Integer> entry : scores.entrySet()) {
                    if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0) {
                        maxEntry = entry;
                    }
                }
                score += maxEntry.getValue();
            } else {
                areAllBuildingsAssigned = false;
            }
        }
        if (areAllBuildingsAssigned == true) {
            score += reward;
        }
        return score;
    }
}
