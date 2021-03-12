package de.rcc.buildtheskyhighway.utils;

import de.rcc.buildtheskyhighway.data.Antenna;

import java.io.BufferedWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileOut {
    public static void writeSolution(Antenna[] antennas, String url) {
        Path path = Path.of(url);
        try (BufferedWriter writer = Files.newBufferedWriter(path, StandardCharsets.UTF_8)) {
            for (Antenna antenna : antennas) {
                if ((int)antenna.getCoordination().getX() != -1 && (int)antenna.getCoordination().getY() != -1) {
                    writer.write(antenna.getId() + " " + (int)antenna.getCoordination().getX() + " " + (int)antenna.getCoordination().getY());
                } else {
                    writer.write("X");
                }
                writer.newLine();
            }
        } catch (Exception e) {
            System.err.println("[FileOut]: The was a problem on writing a solution file!");
        }
        System.out.println("A solution file has been created");
    }
    public static void writeScore(int score, char inputId, String url) {
        Path path = Path.of(url);
        try (BufferedWriter writer = Files.newBufferedWriter(path, StandardCharsets.UTF_8)) {
            writer.write("Input " + inputId + ": " + score + " ");
        } catch (Exception e) {
            System.err.println("[FileOut]: The was a problem on writing a scoring file!");
        }
        System.out.println("Score for input file " + inputId + ": " + score);
    }
}
