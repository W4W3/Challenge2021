package de.rcc.buildtheskyhighway.logic;

import de.rcc.buildtheskyhighway.data.Antenna;
import de.rcc.buildtheskyhighway.data.Map;

import org.apache.commons.lang3.RandomUtils;

import java.awt.*;

public class Solver {
    private int bestScore;
    private int currentScore;
    private Antenna[] bestAntennas;
    private Antenna[] currentAntennas;
    private final Map map;
    private final Calculator calculator;

    public Solver(Map map) {
        this.map = map;
        this.bestScore = 0;
        this.currentScore = 0;
        this.currentAntennas = new Antenna[map.getAntennas().length];
        this.calculator = new Calculator();
    }

    public void solveProblem() {
        int counter = 0;
        while (counter < 100) {
            currentAntennas = new Antenna[map.getAntennas().length];
            for (int i = 0; i < currentAntennas.length; i++) {
                currentAntennas[i] = map.getAntennas()[i];
                int x = 0;
                int y = 0;
                boolean antennaHasCoords;
                do {
                    antennaHasCoords = false;
                    x = RandomUtils.nextInt(0, map.getWidth());
                    y = RandomUtils.nextInt(0, map.getHeight());
                    if (currentAntennas[0] != null) {
                        for (Antenna antenna:currentAntennas) {
                            if (x == (int)antenna.getCoordination().getX() && y == (int)antenna.getCoordination().getY()) {
                                antennaHasCoords = true;
                                break;
                            }
                        }
                    }
                } while (antennaHasCoords != false);
                currentAntennas[i].setCoordination(new Point(x, y));
            }
            currentScore = calculator.calculateScore(map.getBuildings(), currentAntennas, map.getReward());
            if (currentScore > bestScore) {
                bestAntennas = currentAntennas;
                bestScore = currentScore;
            }
            counter++;
        }
    }

    public int getFinalScore() {
        return bestScore;
    }

    public Antenna[] getSolution() {
        return bestAntennas;
    }

}
