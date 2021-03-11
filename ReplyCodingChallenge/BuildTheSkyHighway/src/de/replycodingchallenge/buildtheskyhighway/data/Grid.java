package de.replycodingchallenge.buildtheskyhighway.data;

public class Grid {
    public final int width;
    public final int height;
    public final int reward;
    public final int presentBuilding;
    public final int availableAntennas;

    public Grid (int width, int height, int reward, int presentBuilding, int availableAntennas) {
        this.width = width;
        this.height = height;
        this.reward = reward;
        this.presentBuilding = presentBuilding;
        this.availableAntennas = availableAntennas;
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
}
