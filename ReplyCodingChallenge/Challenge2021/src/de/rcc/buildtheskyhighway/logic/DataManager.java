package de.rcc.buildtheskyhighway.logic;

import de.rcc.buildtheskyhighway.data.Antenna;
import de.rcc.buildtheskyhighway.data.Building;
import de.rcc.buildtheskyhighway.data.Map;
import de.rcc.buildtheskyhighway.utils.FileIn;
import de.rcc.buildtheskyhighway.utils.FileOut;

import javax.xml.crypto.Data;
import java.awt.*;
import java.util.ArrayList;

public class DataManager {
    private final Map map;
    private Solver solver;

    public DataManager(String url) {
        ArrayList<String> data = FileIn.read(url);
        String[] mapSize = data.get(0).split("\\s+");
        String[] values = data.get(1).split("\\s+");
        this.map = new Map(Integer.parseInt(mapSize[0]),
                Integer.parseInt(mapSize[1]),
                Integer.parseInt(values[2]),
                getBuildings(Integer.parseInt(values[0]), data),
                getAntennas(Integer.parseInt(values[0]), Integer.parseInt(values[1]), data));
    }

    public void solve(String url, char inputId, String scoreUrl) {
        solver = new Solver(map);
        solver.solveProblem();
        FileOut.writeScore(solver.getFinalScore(), inputId, scoreUrl);
        FileOut.writeSolution(solver.getSolution(), url);
    }

    private Building[] getBuildings(int size, ArrayList<String> data) {
        Building[] buildings = new Building[size];
        for (int i = 0; i < buildings.length; i++) {
            String[] values = data.get(i+2).split("\\s+");
            buildings[i] = new Building(Integer.parseInt(values[2]), Integer.parseInt(values[3]), new Point(Integer.parseInt(values[0]), Integer.parseInt(values[1])));
        }
        return buildings;
    }

    private Antenna[] getAntennas(int sizeBuildings, int sizeAntennas, ArrayList<String> data) {
        Antenna[] antennas = new Antenna[sizeAntennas];
        for (int i = 0; i < antennas.length; i++) {
            String[] values = data.get(i+2+sizeBuildings).split("\\s+");
            antennas[i] = new Antenna(i, Integer.parseInt(values[0]), Integer.parseInt(values[1]));
        }
        return antennas;
    }
}
