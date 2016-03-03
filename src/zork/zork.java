package zork;
import java.util.Scanner;

import java.util.Random;

public class zork {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int counter =0;

        String room[];

        String response;

        System.out.println("Welcome to ZORK!!!");

        System.out.println("You can choose to LIVE or DIE");

        response = sc.nextLine();

        do

        {

        if(response.equalsIgnoreCase("live"))

        {

            System.out.println("Go live your life!!!");

            sc.close();

            break;

        }

        else if(response.equalsIgnoreCase("die"))

        {

            System.out.println("Welcome to HELL!!!!!");

            foyer(sc ,response ,counter);

            

        }

        else

        {

            System.out.println("Invalid Choice");

            response = sc.nextLine();

            

        }

        }while(!response.equalsIgnoreCase("live") || !response.equalsIgnoreCase("die"));

    }

    public static void foyer(Scanner sc , String response ,int counter )

    {

        System.out.println("You are currently in the Foyer!!!");

        System.out.println("You can see dead Scorpions!!!");

        System.out.println("Do you want to still continue................(y/n)");

        response = sc.nextLine();

        if(response.equalsIgnoreCase("n"))

        {

            System.out.println("Go live your life!!!");

            System.out.println("Rooms visited: "+counter);

            

            

        }

        

        if(response.equalsIgnoreCase("y"))

        {

            

            frontRoom(sc ,response,counter);

            

        }

    }

    public static void frontRoom(Scanner sc , String response ,int counter)

    {

        counter++;

        System.out.println("You are currently in the Front Room!!!");

        System.out.println("You can see a Piano!!!");

        System.out.println("You are can go EAST or WEST or SOUTH");

        

        response = sc.nextLine();

        if(response.equalsIgnoreCase("EAST"))

        {

            kitchen(sc,response,counter);

        }

        else if(response.equalsIgnoreCase("WEST"))

        {

            

            library(sc,response,counter);

            

        }

        else if(response.equalsIgnoreCase("SOUTH"))

        {

            foyer(sc,response,counter);

        }

        else

        {

            System.out.println("Invalid Choice");

        }

    }

    public static void library(Scanner sc ,String response ,int counter)

    {

        counter++;

        System.out.println("You are currently in the Library!!!");

        System.out.println("You can see a Spiders!!!Oh my god one just got onto you!!!!!");

        System.out.println("You are can go EAST or NORTH");

        

        response = sc.nextLine();

        if(response.equalsIgnoreCase("NORTH"))

        {

            diningRoom(sc,response,counter);

        }

        else  if(response.equalsIgnoreCase("EAST"))

        {

            

            frontRoom(sc,response,counter);

            

        }

        else

        {

            System.out.println("Invalid Choice");

        }

        

        

    }

    public static void kitchen(Scanner sc,String response ,int counter)

    {

        counter++;

        System.out.println("You are currently in the Kitchen!!!");

        System.out.println("LO0k around you ......your Surrounded by \"BATS\"");

        System.out.println("You are can go WEST or NORTH");

        

        response = sc.nextLine();

        if(response.equalsIgnoreCase("NORTH"))

        {

            parlor(sc,response,counter);

        }

        else  if(response.equalsIgnoreCase("WEST"))

        {

            

            frontRoom(sc,response,counter);

            

        }

        else

        {

            System.out.println("Invalid Choice");

        }

        

    }

    public static void diningRoom(Scanner sc ,String response ,int counter)

    {

        counter++;

        System.out.println("You are currently in the Dining R000000M!!!");

        System.out.println("YUCK its DUSTY and look around the boxes tell you someone was around!!!");

        System.out.println("YoU can move South!!! Do you want to proceed?");

        response =sc.nextLine();

        if(response.equalsIgnoreCase("South"))

        {

            

            library(sc,response,counter);

            

        }

        else

        {

            System.out.println("Invalid Choice");

        }

        

        

    }

    public static void parlor(Scanner sc ,String response ,int counter)

    {

        counter++;

        System.out.println("You are currently in the Parlor!!!");

        System.out.println("You found a Treasure Chest!!!");

        System.out.println("You are can go WEST or SOUTH");

        

        response = sc.nextLine();

        while(!response.equalsIgnoreCase("West") || !response.equalsIgnoreCase("south"))

        {

            if(response.equalsIgnoreCase("SOUTH"))

            {

                kitchen(sc,response,counter);

            }

            else if(response.equalsIgnoreCase("WEST"))

            {

                

                vault(sc,response,counter);

                

            }

        }

        

        

    }

    public static void vault(Scanner sc ,String response ,int counter)

    {

        counter++;

        Random rnd = new Random();

        int guess , number;

        number = 1+rnd.nextInt(5);

        System.out.println("Guess a number between 1 and 4");

        guess=sc.nextInt();

        if(guess == number)

        {

            secretRoom(sc,response,counter);

        }

        else

        {

            System.out.print("You are being attcked by Skeletons!!!");

        }

        /*System.out.println("YoU can move East!!! Do you want to proceed?");

        response=sc.nextLine();

        if(response.equalsIgnoreCase("EAST"))

        {*/

            

            parlor(sc,response,counter);

        /*  

        }

        else

        {

            System.out.println("Invalid Choice");

        }*/

        

        

    }

    public static void secretRoom(Scanner sc , String response ,int counter)

    {

        counter++;

        System.out.println("Congratulations!!!!! Welcome to the SECRET ROOOOM");

        System.out.println("You found piles of gold");

        vault(sc,response,counter);

    }

}
