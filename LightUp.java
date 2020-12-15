package soares_raiza;
/***********************************************************************
 * Class: LightUp
 * author: Raiza Soares
 * Description: The LightUp child class implements the visitor. Based on
 * adjacent cells it determines the brightness of the bulb.
 **********************************************************************/
public class LightUp implements Visitor
{
    private Grid temp= new Grid();
    //the count variable is useful in determining the location of the lightbulb.
    int count=-1;
    //constructor. Gets initial grid.
    public LightUp(Grid g)
    {
        temp=g;

    }
    /***********************************************************************
     * function: accept
     * author: Raiza Soares
     * inputs: Empty e - an Empty object from the grid.
     * Description: Just increment count so we get accurate locations for
     * the lightbulb.
     **********************************************************************/
    @Override
    public void accept(Empty e) {
        ++count;
    }
    /***********************************************************************
     * function: accept
     * author: Raiza Soares
     * inputs: Greenspace g - an Greenspace  object from the grid.
     * Description: Just increment count so we get accurate locations for
     * the lightbulb.
     **********************************************************************/
    @Override
    public void accept(Greenspace g) {
        ++count;

    }
    /***********************************************************************
     * function: accept
     * author: Raiza Soares
     * inputs: Panel p- an Panel  object from the grid.
     * Description: Just increment count so we get accurate locations for
     * the lightbulb.
     **********************************************************************/
    @Override
    public void accept(Panel p) {
        ++count;
    }
    /***********************************************************************
     * function: accept
     * author: Raiza Soares
     * inputs: Lightbulb l - a Lightbulb object from the grid.
     * Description: For lightbulbs, we determine the location of the current
     * bulb, and then use the CheckAdjacent Visitor to determine if the adjacent
     * cells are panels.
     **********************************************************************/
    @Override
    public void accept(LightBulb l) {
        ++count;
        //get x and y using the counts
        int y= count%5;
        int x= count/5;
        //make a CheckAdjacent visitor
        CheckAdjacent VisCh =new CheckAdjacent();
        Empty p = new Empty();
        //call the visitor on the adjacent objects.
        if(y!= 0) {
            p = temp.getSmallArea(y - 1, x);
            //GRADING: NESTED
            p.visit(VisCh);
        }
        if(y!=4) {
            p = temp.getSmallArea(y + 1, x);
            p.visit(VisCh);
        }
        if(x!=4) {
            p = temp.getSmallArea(y, x + 1);
            p.visit(VisCh);
        }
        if(x!=0) {
            p = temp.getSmallArea(y, x - 1);
            p.visit(VisCh);
        }
        int numPanels=0;
        String gridEle= "";
        //get the number of panels from CheckAdjacent
        numPanels= VisCh.RetNumPanels();

        gridEle= changeString(gridEle, numPanels);
        l.SetType(gridEle);

    }
    /***********************************************************************
     * function: changeString
     * author: Raiza Soares
     * inputs: String gridEle - string to be colored.
     * numPanels: number of panels.
     * Description: This is a helper function to color the given object's
     * symbol to a certain color depending on the number.
     **********************************************************************/
    private String changeString(String gridEle, int numPanels)
    {
        String q= "✦";
        switch(numPanels)
        {
            case(0):
                gridEle= ColorText.colorString(q.toString(),ColorText.Color.BLACK);
                break;
            case(1):
                gridEle= ColorText.colorString(q.toString(),ColorText.Color.GRAY);
                break;
            case(2):
                gridEle= ColorText.colorString(q.toString(),ColorText.Color.ORANGE);
                break;
            case(3):
                gridEle= ColorText.colorString(q.toString(),ColorText.Color.YELLOW);
                break;
            case(4):
                gridEle= ColorText.colorString(q.toString(),ColorText.Color.LIGHT_YELLOW);
                break;
        }
        return gridEle;
    }


}
