//FSB Core v.01
//Import random number and import functionality
import java.util.Random;
import java.util.Scanner;
import flash.display.Bitmap;
import openfl.Assets;

public class FSBCore
{
    public static void main(String[] args)
    {
        //Intialise Random and Scanner
        Random randGen = new Random();
        Scanner userInput = new Scanner(System.in);
        
        //Variables(System)
        int loopCounter;
        int randInt = randGen.nextInt(999) + 1;
        string userName, systemDebug;
        boolean appState;
        
        //Variables (Gameplay)
        float attackPower,defensePower,Evasion;
        int resourceFood,resourceStone,resourceTimber,resourceSilver;

        //System
        for(appState == true)
        {
            if(appState == false)
            {
                System.exit(0);
            }
        }
        
        //Testing dialog
        System.out.println("Generate Map? (y/n)");
        String genAnswer = userInput.next();
        if(genAnswer.equals("y"))
        {
            
        }
    }
}
