package de.rcc.buildtheskyhighway.utils;

import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class FileIn {
    public static ArrayList<String> read(String url) {
        ArrayList<String> file = new ArrayList<>();
        Path path = Path.of(url);
        String line;
        try(BufferedReader reader = Files.newBufferedReader(path))  {
            while((line = reader.readLine()) != null) {
                file.add(line);
            }
        } catch (Exception e) {
                System.err.println("[FileIn]: There was a problem on reading a file!");
        }
        return file;
    }
}
