package org.example.ex2;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Set<Byte>> courseList = new HashMap<>();
        byte totalA, totalB, totalC;
        System.out.print("How many students for course A: ");
        totalA = scanner.nextByte();
        Set<Byte> codeA = new HashSet<>();
        for (int i = 0; i < totalA; i++) {
            byte age = scanner.nextByte();
            codeA.add(age);
        }
        courseList.put("A", codeA);
        System.out.print("How many students for course B: ");
        totalB = scanner.nextByte();
        Set<Byte> codeB = new HashSet<>();
        for (int i = 0; i < totalB; i++) {
            byte age = scanner.nextByte();
            codeB.add(age);
        }
        courseList.put("B", codeB);
        System.out.print("How many students for course C: ");
        totalC = scanner.nextByte();
        Set<Byte> codeC = new HashSet<>();
        for (int i = 0; i < totalC; i++) {
            byte age = scanner.nextByte();
            codeC.add(age);
        }
        courseList.put("C", codeC);
        int total = codeA.size() + codeB.size() + codeC.size();
        courseList.forEach((key, value) -> {
            System.out.print("Students for class " + key + ": ");
            value.forEach(e -> {
                System.out.print(e + " -> ");
            });
            System.out.println();
        });
        System.out.println("Total: " + total);
    }
}
