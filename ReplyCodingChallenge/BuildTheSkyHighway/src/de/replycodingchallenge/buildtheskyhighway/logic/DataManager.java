package de.replycodingchallenge.buildtheskyhighway.logic;

import de.replycodingchallenge.buildtheskyhighway.data.Antenna;
import de.replycodingchallenge.buildtheskyhighway.data.Building;
import de.replycodingchallenge.buildtheskyhighway.data.Grid;
import de.replycodingchallenge.buildtheskyhighway.utils.FileIn;
import de.replycodingchallenge.buildtheskyhighway.utils.FileOut;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;

public class DataManager {

    private final Grid grid;
    private Antenna[] antennas;
    private Building[] buildings;
    HashMap<Integer, Point> placedAntennas = new HashMap<>();

    public DataManager(String input, String output) {
        ArrayList<String> data = FileIn.getData(input);
        this.grid = getGrid(data);
        setBuildings(data);
        setAntennas(data);
        Solver solver = new Solver();
        FileOut.writeFile(solver.solve());
    }

    public Grid getGrid(ArrayList<String> data) {
        String[] size = data.get(0).split("\\s+");
        String[] otherValues = data.get(1).split("\\s+");
        return new Grid(Integer.parseInt(size[0]), Integer.parseInt(size[1]), Integer.parseInt(otherValues[2]), Integer.parseInt(otherValues[1]), Integer.parseInt(otherValues[0]));
    }

    public void setBuildings(ArrayList<String> data) {
        this.buildings = new Building[grid.getPresentBuilding()];
        for (int i = 0; i < grid.getPresentBuilding(); i++) {
            String[] values = data.get(i + 2).split("\\s+");
            buildings[i] = new Building(new Point(Integer.parseInt(values[0]),Integer.parseInt(values[1])), Integer.parseInt(values[2]), Integer.parseInt(values[3]));
        }
    }

    public void setAntennas(ArrayList<String> data) {
        this.antennas = new Antenna[grid.getAvailableAntennas()];
        for (int i = 0; i < grid.getAvailableAntennas(); i++) {
            String[] values = data.get(i + grid.getPresentBuilding() + 2).split("\\s+");
            antennas[i] = new Antenna(i, Integer.parseInt(values[0]), Integer.parseInt(values[1]));
        }
    }
}
