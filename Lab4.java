import java.lang.Math;
import java.util.Arrays;
import java.util.Comparator;
import java.io.*;


public class Lab4
{
    
    public static float CalculateAveragePrice (Device[] devices)
    {
        float sum = 0;
        
        for (int i = 0; i < devices.length; i++)
        {
            sum += devices [i].GetPrice ();
        }
        
        return sum / (float)devices.length;
    }
    
    
    public static void main (String[] args)
    {
        System.out.println ();
        System.out.println (">>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println ("# Welcome to Lab4 Program! #");
        System.out.println (">>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println ();
        
        Keyboard keyb1 = new Keyboard ();
        Keyboard keyb2 = new Keyboard (false, "Keyboard - 1", 450.15f);
        Keyboard keyb3 = new Keyboard (true, "Keyboard - 2", 800.3f);
        
        Scanner scan1 = new Scanner ();
        Scanner scan2 = new Scanner (200, "Scanner - 1", 2999f);
        Scanner scan3 = new Scanner (150, "Scanner - 2", 3999.99f);

        Device[] devices = {
            keyb1, keyb2, keyb3,
            scan1, scan2, scan3
        };
        
        System.out.println ("Printing all devices...");
        
        for (int i = 0; i < devices.length; i++)
        {
            System.out.println (devices [i].ToString ());
        }
        
        System.out.println ();
        System.out.println ("2. CHANGING PRICE");
        System.out.println ("Changing price of the 5th device to $320:");
        devices [5].SetPrice (320f);
        
        System.out.println (devices [5].ToString ());
        System.out.println ();
        
        System.out.println ("3. CALCULATING AVERAGE");
        System.out.println ("Price average of all devices: " + CalculateAveragePrice (devices));
        System.out.println ();
    }
}
