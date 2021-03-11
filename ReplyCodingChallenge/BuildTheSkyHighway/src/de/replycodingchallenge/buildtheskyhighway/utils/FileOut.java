package de.replycodingchallenge.buildtheskyhighway.utils;

import de.replycodingchallenge.buildtheskyhighway.data.Antenna;

import java.util.ArrayList;

public class FileOut {
    public static void writeFile(Antenna[] antennas, String url) {
        try {
            ArrayList<String> lines = new ArrayList<>();
            lines.add(String.valueOf(antennas.length));
            for (int i = 0; i < antennas.length; i++) {
                lines.add(antennas[i].getId() + " " + antennas[i].getCoordination().getX() + " " + antennas[i].getCoordination().getY());
            }
        } catch (Exception e) {
            System.err.println("[FileOut]:\t Can't write file. Something went wrong.");
        }
    }
}
