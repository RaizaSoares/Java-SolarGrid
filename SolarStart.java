/**************************************************************************
 *@file
 *
 *@brief The SolarStart class has main in it that runs the whole program.
 * You are able to do 7 things with the solar grid, as detailed in the
 * description below.
 *
 * @author  Raiza Soares
 *@mainpage Program - Java OOP
 *
 * @description  The program starts with displaying the menu and an empty
 * grid that was created. A user can choose from the menu:
 *                          1) Set Area
 *                         2) Remove Area
 *                         3) Make Default Grid
 *                         4) Count Types
 *                         5) Set Type Color
 *                         6) Light Up Bulbs
 *                         0) Quit
 * by pressing the appropriate button. The SetArea sets a certain location on the
 * grid to a particular object as requested by the user. The Remove area sets a
 * certain location to empty. Make default grid converts the grid to a prearranged
 * grid. Count Types uses a Visitor to count how many of each object there are in
 * the grid. Set Type Color also uses a Visitor and allows the user to set a certain
 * type of object to a color they pick. Light Up bulbs lights up all the bulbs based
 * on their proximity solar panels. This is done using a visitor as well. Lastly,
 * Quit exits the program. This program takes care of bad input and does error
 * checking.
 *
 * @KnownBugs None
 *
 * @To_Do None
 *
 ******************************************************************************/


package soares_raiza;

import java.util.Scanner;

/***********************************************************************
 * Class: Solar Start
 * author: Dr. Lisa Rebenitsch,Raiza Soares
 * Description: Has a menu that a user can pick from and does
 * specific tasks based on the options chosen.
 **********************************************************************/
public class SolarStart {

    public static Scanner cin; //intentionally public for ease of use
    /***********************************************************************
     * Class: Main
     * author: Raiza Soares
     * Description: Has a meu that a user can pick from and does
     * specific tasks based on the options chosen. Always reprints the menu
     * and the grid until the user quits the program. Handles bad input in
     * an options by one try catch block.
     **********************************************************************/
    public static void main(String[] args) {
        Grid empGrid= new Grid();

        cin = new Scanner(System.in);
        String menu =
                "1) Set Area\n" +
                        "2) Remove Area\n" +
                        "3) Make Default Grid\n" +
                        "4) Count Types\n" +
                        "5) Set Type Color\n" +
                        "6) Light Up Bulbs\n" +
                        "0) Quit\n";
        int input = -1;
        int inp=-1;
        int inp2=-1;
        int x,y;
        while (input != 0) {

            System.out.println("\n" );
            empGrid.printGrid();
            System.out.println(menu);
            System.out.print("Choice: ");

            try {
                input = cin.nextInt();

            //set area
            if(input==1)
            {
                System.out.print("Input area type 1) greenspace 2) light 3) panel #) empty: ");
                inp = cin.nextInt();
                System.out.print("input location (x y): ");
                x= cin.nextInt();
                y= cin.nextInt();
                empGrid.ChangeSymbol(inp,x,y);
            }
            //remove area
            else if(input==2)
            {
                System.out.print("Input location (x y): ");
                x= cin.nextInt();
                y= cin.nextInt();
                empGrid.changeEmpty(x,y);
            }
            //make default grid
            else if(input==3)
            {
                empGrid.makeDefaultGrid();
            }
            //Count types
            else if(input==4)
            {
                empGrid.VisCount();
            }
            //set type color
            else if(input==5)
            {
                System.out.print("Input area type 1) greenspace 2) light 3) panel #) empty: ");
                inp= cin.nextInt();
                System.out.print("Input color 1) red 2) yellow 3) blue 4) green #) black: ");
                inp2= cin.nextInt();
                empGrid.VisColor(inp, inp2);

            }
            //light up bulbs
            else if(input==6)
            {
                LightUp visi= new LightUp(empGrid);
                //function to Light Up
                empGrid.VisLightUp( visi);
            }
            //quit
            else if(input==0)
            {
                return;
            }
            //invalid inputs
            else
            {
                System.out.println("Unknown menu option");
            }
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Invalid option");
            }
            catch (Exception e) {
                System.out.println("Invalid option");
                cin.next();
            }

        }


    }

}
