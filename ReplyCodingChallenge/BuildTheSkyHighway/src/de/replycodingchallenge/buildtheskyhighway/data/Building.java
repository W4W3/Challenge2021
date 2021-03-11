package de.replycodingchallenge.buildtheskyhighway.data;

import java.awt.*;

public class Building {
    private final Point coordination;
    private final int latencyWeight;
    private final int connectionSpeedWeight;

    public Building(Point coordination, int latenyWeight, int connectionSpeedWeight) {
        this.coordination = coordination;
        this.latencyWeight = latenyWeight;
        this.connectionSpeedWeight = connectionSpeedWeight;
    }

    public Point getCoordination() {
        return coordination;
    }

    public int getLatencyWeight() {
        return latencyWeight;
    }

    public int getConnectionSpeedWeight() {
        return connectionSpeedWeight;
    }
}
