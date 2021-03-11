package de.replycodingchallenge.buildtheskyhighway.data;

import java.awt.*;

public class Antenna {
    private final int id;
    private final int range;
    private final int connectionSpeed;
    private Point coordination;

    public Antenna (int id, int range, int connectionSpeed) {
        this.id = id;
        this.range = range;
        this.connectionSpeed = connectionSpeed;
    }

    public void setCoordination(Point coordination) {
        this.coordination = coordination;
    }

    public int getId() {
        return id;
    }

    public int getRange() {
        return range;
    }

    public int getConnectionSpeed() {
        return connectionSpeed;
    }

    public Point getCoordination() {
        return coordination;
    }
}
