package com.company;

import java.util.Scanner;
import java.io.File;

public class Main {



    public static void main(String[] args) throws Exception
    {
	// write your code here
        File file = new File("Movie.txt");
        Scanner fileScanner = new Scanner(file);
        Scanner scanner = new Scanner(System.in);

        int errors = 0;
        int wordNumber = (int) (Math.random() * 25) + 1;

        for (int i = 0; i < wordNumber; i++)
        {
            fileScanner.nextLine();
        }
        String movieName = fileScanner.nextLine();
        System.out.println(movieName);

        System.out.print("You are guessing:");
        char guess[] = new char[movieName.length()];
        for (int i = 0; i < movieName.length(); i++) {
            guess[i] = '_';
            System.out.print('_');
        }
        System.out.println();
        System.out.println("You have guessed (" + errors + ") wrong letters:");
        while(errors < 10)
        {

            System.out.print("Guess a letter:");
            char letter = scanner.next().charAt(0);

            for (int i = 0; i < movieName.length(); i++)
            {
                if (movieName.charAt(i) == letter)
                {
                    guess[i] = letter;
                }
            }

            if (movieName.indexOf(letter) == -1)
            {
                errors++;
            }

            System.out.print("You are guessing:");
            for (int i = 0; i < movieName.length(); i++) {
                System.out.print(guess[i]);
            }
            System.out.println();
            System.out.println("You have guessed (" + errors + ") wrong letters:");
            if (win(guess))
            {
                System.out.println("YOU WON!!!!!!");
                break;
            }
        }
        if (errors == 10)
        {
            System.out.println("YOU LOSE!!!!");
        }
    }

    public static boolean win(char arr[])
    {
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] == '_')
            {
                return false;
            }
        }
        return true;
    }
}
