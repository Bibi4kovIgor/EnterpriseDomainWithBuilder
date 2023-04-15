package org.example;

import org.example.model.Position;
import org.example.model.Worker;
import org.example.model.WorkerLombok;

public class Main {
    public static void main(String[] args) {
        Worker worker = Worker.builder()
                .lastName("last Name")
                .position(Position.DIRECTOR)
                .build();

        WorkerLombok.builder()
                .firstName("First name")
                .lastName("Last name")
                .phone("44457")
                .build();

        System.out.println(worker);
    }
}