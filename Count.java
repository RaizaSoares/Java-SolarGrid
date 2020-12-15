package soares_raiza;
/***********************************************************************
 * Class: Count
 * author: Raiza Soares
 * Description: The Count class counts each of the objects and prints them.
 **********************************************************************/
public class Count implements Visitor
{

    private int CountEmp=0, CountPan=0, CountGreen=0, CountBulb=0;
    //constructor
    public void Count()
    {

    }
    /***********************************************************************
     * function: accept
     * author: Raiza Soares
     * inputs: Empty e - an empty object from the grid.
     * Description: Counts Empty
     **********************************************************************/
    @Override
    public void accept(Empty e) {
     ++CountEmp;

    }
    /***********************************************************************
     * function: accept
     * author: Raiza Soares
     * inputs: Greenspace g- a greenspace object from the grid.
     * Description: Counts greenspace
     **********************************************************************/
    @Override
    public void accept(Greenspace g) {
         ++CountGreen;
    }
    /***********************************************************************
     * function: accept
     * author: Raiza Soares
     * inputs: Panel p - an Panel object from the grid.
     * Description: Counts panels
     **********************************************************************/
    @Override
    public void accept(Panel p) {
     ++CountPan;
    }
    /***********************************************************************
     * function: accept
     * author: Raiza Soares
     * inputs: Lightbulb l - an Lightbulb object from the grid.
     * Description: Counts Lightbulbs
     **********************************************************************/
    @Override
    public void accept(LightBulb l) {
     ++CountBulb;
    }
    /***********************************************************************
     * function: printS
     * author: Raiza Soares
     * Description: prints counts
     **********************************************************************/
    public void printS()
    {
        System.out.println("Empty: "+ CountEmp);
        System.out.println("GreenSpaces: "+ CountGreen);
        System.out.println("Panel: "+ CountPan);
        System.out.println("Light: "+ CountBulb);
    }

}
