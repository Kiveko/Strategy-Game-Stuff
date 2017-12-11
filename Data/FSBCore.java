/**
 * Fantasy Simulated Battle
 *
 * @author (Jacob Grayson)
 * @version (0.01)
 */
 
import java.util.Scanner;

public class FSBCore
{
    public static void main(String[] args)
    {
        //Variables
        Scanner ScannerInput = new Scanner(System.in);
        
        int TroopCountA,TroopCountB;
        String RaceSelection;
        
        System.out.println("Hello User! Welcome to fantasy battle simulator!");
        System.out.println("S,H,B?");
        
        RaceSelection = ScannerInput.next();
        if (RaceSelection == "S")
        {
            System.out.println("You selected Skeletons! Is this correct?");
        }
            
        }
    }