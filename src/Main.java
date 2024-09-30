import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        String partyAffil = "";
        String trash = "";

        // create a scanner and read in the PartyAfil

        System.out.print("Enter your political affiliation [RDI]:");
        partyAffil = console.nextLine();

        if(partyAffil.equalsIgnoreCase("R"))
        {
            System.out.println("You get a Republican Elephant!");
        }
        else if(partyAffil.equalsIgnoreCase("D"))
        {
            System.out.println("You get a Democratic Donkey!");
        }
        else if(partyAffil.equalsIgnoreCase("I"))
        {
            System.out.println("You get an Independent Man!");
        }
        else
        {
            System.out.println("I dont know what party you belong to!");
        }




    }
}