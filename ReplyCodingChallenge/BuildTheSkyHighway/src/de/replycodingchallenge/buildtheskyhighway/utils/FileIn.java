package de.replycodingchallenge.buildtheskyhighway.utils;

import java.io.*;
import java.util.*;

public class FileIn {
    public static ArrayList<String> getData(String url) {
        File file = new File(url);
        try {
            Scanner scanner = new Scanner(file);
            ArrayList<String> data = new ArrayList<>();
            while (scanner.hasNextLine()) {
                data.add(scanner.nextLine());
            }
            return data;
        } catch (Exception e) {
            System.err.println("[FileIn]:\nCan't read file. Something went wrong!");
        }
        return null;
    }
}
