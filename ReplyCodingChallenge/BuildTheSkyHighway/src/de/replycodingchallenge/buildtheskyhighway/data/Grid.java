package de.replycodingchallenge.buildtheskyhighway.data;

import java.awt.*;
import java.util.ArrayList;

public class Grid {
    private final int width;
    private final int height;
    private final int reward;
    private final int presentBuilding;
    private final int availableAntennas;
    private Antenna[] antennas;
    private Building[] buildings;
    private char[][] grid;

    public Grid (int width, int height, int reward, int presentBuilding, int availableAntennas, ArrayList<String> data) {
        this.width = width;
        this.height = height;
        this.reward = reward;
        this.presentBuilding = presentBuilding;
        this.availableAntennas = availableAntennas;
        this.buildings = new Building[getPresentBuilding()];
        this.antennas = new Antenna[getAvailableAntennas()];
        setBuildings(data);
        setAntennas(data);
        this.grid = new char[height][width];
        setBuildingsToGrid();
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getReward() {
        return reward;
    }

    public int getPresentBuilding() {
        return presentBuilding;
    }

    public int getAvailableAntennas() {
        return availableAntennas;
    }

    public Antenna[] getAntennas() {
        return antennas;
    }

    public Building[] getBuildings() {
        return buildings;
    }

    public char[][] getGrid() {
        return grid;
    }

    public void setBuildings(ArrayList<String> data) {
        this.buildings = new Building[getPresentBuilding()];
        for (int i = 0; i < getPresentBuilding(); i++) {
            String[] values = data.get(i + 2).split("\\s+");
            buildings[i] = new Building(new Point(Integer.parseInt(values[0]),Integer.parseInt(values[1])), Integer.parseInt(values[2]), Integer.parseInt(values[3]));
        }
    }

    public void setAntennas(ArrayList<String> data) {
        this.antennas = new Antenna[getAvailableAntennas()];
        for (int i = 0; i < getAvailableAntennas(); i++) {
            String[] values = data.get(i + getPresentBuilding() + 2).split("\\s+");
            antennas[i] = new Antenna(i, Integer.parseInt(values[0]), Integer.parseInt(values[1]));
        }
    }

    public void setBuildingsToGrid() {
        for (Building building : buildings) {
            grid[(int)building.getCoordination().getY()][(int)building.getCoordination().getX()] = 'B';
        }
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] != 'B') {
                    grid[i][j] = 'N';
                }
            }
        }
    }
}
