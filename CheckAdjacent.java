package soares_raiza;
/***********************************************************************
 * Class: CheckAdjacent
 * author: Raiza Soares
 * Description: The CheckAdjacent child class implements the visitor. It
 * determines how many panels are adjacent.
 **********************************************************************/
public class CheckAdjacent implements Visitor
{
    private Grid temp= new Grid();
    private int count=0;
    //constructor
    public CheckAdjacent()
    {
    }
    /***********************************************************************
     * function: accept
     * author: Raiza Soares
     * inputs: Empty e - an Empty object from the grid.
     * Description: Does nothing since we only want to count panels
     **********************************************************************/
    @Override
    public void accept(Empty e) {

    }
    /***********************************************************************
     * function: accept
     * author: Raiza Soares
     * inputs: Greenspace g - an Greenspace object from the grid.
     * Description: Does nothing since we only want to count panels
     **********************************************************************/
    @Override
    public void accept(Greenspace g) {

    }
    /***********************************************************************
     * function: accept
     * author: Raiza Soares
     * inputs: Panel p - an Panel object from the grid.
     * Description: Counts panels
     **********************************************************************/
    @Override
    public void accept(Panel p) {
        count++;

    }
    /***********************************************************************
     * function: accept
     * author: Raiza Soares
     * inputs: LightBulb l - an LightBulb object from the grid.
     * Description: Does nothing since we only want to count panels
     **********************************************************************/
    @Override
    public void accept(LightBulb l) {

    }
    /***********************************************************************
     * function: RetNumPanels
     * author: Raiza Soares
     * Description: Returns count of Panels
     **********************************************************************/
    public int RetNumPanels()
    {
        return count;
    }

}
