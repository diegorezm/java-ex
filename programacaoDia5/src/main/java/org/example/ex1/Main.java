package org.example.ex1;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Instant;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String filePath;
        System.out.print("Give the full file path: ");
        filePath = scanner.next();
        filePath = filePath.replace("\\", "/");
        Path path = Paths.get(filePath);
        try {
            List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);
            Set<User> userSet = new HashSet<>();
            for (String line : lines) {
                String[] l = line.split(" ");
                Date d = Date.from(Instant.parse(l[1]));
                User user = new User(l[0], d);
                userSet.add(user);
            }
            System.out.println(userSet.size());
        } catch (Exception e) {
            System.out.println("Could not resolve file path: " + e.getMessage());
        }
    }
}
