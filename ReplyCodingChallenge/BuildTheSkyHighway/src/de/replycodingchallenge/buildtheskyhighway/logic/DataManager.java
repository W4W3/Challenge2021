package de.replycodingchallenge.buildtheskyhighway.logic;

import de.replycodingchallenge.buildtheskyhighway.data.Grid;
import de.replycodingchallenge.buildtheskyhighway.utils.FileIn;
import de.replycodingchallenge.buildtheskyhighway.utils.FileOut;

import java.util.ArrayList;

public class DataManager {

    private final Grid grid;

    public DataManager(String input, String output) {
        ArrayList<String> data = FileIn.getData(input);
        this.grid = getGrid(data);
        Solver solver = new Solver();
        FileOut.writeFile(solver.solve(grid, input),output);
        System.out.println(output + ": File has been written!");
    }

    public Grid getGrid(ArrayList<String> data) {
        String[] size = data.get(0).split("\\s+");
        String[] otherValues = data.get(1).split("\\s+");
        return new Grid(Integer.parseInt(size[0]), Integer.parseInt(size[1]), Integer.parseInt(otherValues[2]), Integer.parseInt(otherValues[1]), Integer.parseInt(otherValues[0]), data);
    }
}
