package com.company;
import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String exit = "";
        String movie = "";
        int count = 0;
        while (!exit.equalsIgnoreCase("quit")) {
            System.out.println(" enter movie name: ");
            movie = keyboard.nextLine();

            if (movie.equalsIgnoreCase("quit"))
                exit = "quit";
            else {
                System.out.println("title of  the movie :" + movie);
                count++;
            }

        }
        System.out.println("you enrered " + count+" movies:");
    }
}
