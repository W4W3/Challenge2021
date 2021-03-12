package de.rcc.buildtheskyhighway.data;

public class Map {
    private final int height;
    private final int width;
    private final int reward;
    private final Building[] buildings;
    private final Antenna[] antennas;

    public Map(int height, int weight, int reward, Building[] buildings, Antenna[] antennas) {
        this.height = height;
        this.width = weight;
        this.reward = reward;
        this.buildings = buildings;
        this.antennas = antennas;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getReward() {
        return reward;
    }

    public Building[] getBuildings() {
        return buildings;
    }

    public Antenna[] getAntennas() {
        return antennas;
    }
}
