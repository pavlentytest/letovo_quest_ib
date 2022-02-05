package ru.samsung.itschool.mdev;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Game {
    private Question[] questions;
    private int counter;

    public Game( Question[] questions) {
        this.questions = questions;
    }

    void doPlay() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello! Let's play!");
        for(int i=0;i<questions.length;i++) {
            System.out.println(questions[i].getValue());
            // answers
            String input = scanner.nextLine();
            if(input.toLowerCase().equals(questions[i].getCorrect().toLowerCase())) {
                counter = counter + 1;
            }
        }
        if(counter > 3) {
            System.out.println("");
        }
    }
}
