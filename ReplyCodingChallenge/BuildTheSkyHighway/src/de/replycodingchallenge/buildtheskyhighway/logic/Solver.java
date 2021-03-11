package de.replycodingchallenge.buildtheskyhighway.logic;

import de.replycodingchallenge.buildtheskyhighway.data.Antenna;
import de.replycodingchallenge.buildtheskyhighway.data.Grid;

import org.apache.commons.lang3.RandomUtils;

import java.awt.*;

public class Solver {

    private Grid grid;
    private Calculator calculator = new Calculator();

    public Antenna[] solve(Grid grid, String url) {
        this.grid = grid;
        char[][] gridFields;
        Antenna[] bestAntennas = null;
        Antenna[] antennas = new Antenna[grid.getAvailableAntennas()];
        int bestScore = 0;
        int currentScore = 0;
        long startTime = System.currentTimeMillis();
        while (System.currentTimeMillis()-startTime<300000) {
            gridFields = grid.getGrid();
            for (int i = 0; i < grid.getAntennas().length; i++) {
                int x;
                int y;
                do {
                    x = RandomUtils.nextInt(0, grid.getWidth());
                    y = RandomUtils.nextInt(0, grid.getWidth());
                } while (gridFields[y][x] != 'N');
                antennas[i] = grid.getAntennas()[i];
                antennas[i].setCoordination(new Point(x, y));
                gridFields[y][x] = 'A';
            }
            currentScore = calculator.fullScore(grid.getBuildings(), antennas, grid.getReward());
            if (currentScore > bestScore) {
                bestAntennas = antennas;
                bestScore = currentScore;
            }
            System.out.println(url + ": " + bestScore);
        }
        return bestAntennas;
    }
}
