package de.rcc.buildtheskyhighway.data;

import java.awt.*;

public class Building {
    private final int latencyWeight;
    private final int connectionSpeedWeight;
    private final Point coordination;

    public Building(int latencyWeight, int connectionSpeedWeight, Point coordination) {
        this.latencyWeight = latencyWeight;
        this.connectionSpeedWeight = connectionSpeedWeight;
        this.coordination = coordination;
    }

    public int getLatencyWeight() {
        return latencyWeight;
    }

    public int getConnectionSpeedWeight() {
        return connectionSpeedWeight;
    }

    public Point getCoordination() {
        return coordination;
    }
}
