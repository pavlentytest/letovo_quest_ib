package ru.samsung.itschool.mdev;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Question[] questions = new Question[2];
        String quest1 = "The capital of USA?";
        Answer[] answers  = new Answer[3];
        answers[0] = new Answer("Moscow");
        answers[1] = new Answer("Berlin");
        answers[2] = new Answer("Washington");

        questions[0] = new Question(quest1,answers,"Washington");
        Game game = new Game(questions);




        /*
	    Apple[] apples = new Apple[10];
        Spinach[] spinaches = new Spinach[2];

        Fruit[] fruits = new Fruit[5];
        fruits[0] = new Apple();
        fruits[0].setPrice(100);
        fruits[1] = new Orange();
        fruits[1].setPrice(0);

        // generics - параметризованный тип
        ArrayList<Fruit> fruitArrayList = new ArrayList<>(0);
        fruitArrayList.add(new Apple());
        fruitArrayList.add(new Orange());

         */
    }
}
