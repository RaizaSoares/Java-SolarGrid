package soares_raiza;
/***********************************************************************
 * Class: Color
 * author: Raiza Soares
 * Description: The color child class implements the visitor. Given a
 * type of object to color, it will color all instances of that object
 * in the grid with that particular color.
 **********************************************************************/
public class Color implements Visitor
{
    private int  areaT=0, c=0;
    //constructor
    public Color(int areaType, int color)
    {
        //stores the kind of object to color and the color.
        areaT= areaType;
        c= color;

    }
    /***********************************************************************
     * function: changeString
     * author: Raiza Soares
     * inputs: String gridEle - string to be colored.
     * Description: This is a helper function to color the given object's
     * symbol to a certain color depending on the number.
     **********************************************************************/
    private String changeString(String gridEle)
    {
        switch(c)
        {
            case(1):
                gridEle= ColorText.colorString(gridEle.toString(),ColorText.Color.RED);
                break;
            case(2):
                gridEle= ColorText.colorString(gridEle.toString(),ColorText.Color.YELLOW);
                break;
            case(3):
                gridEle= ColorText.colorString(gridEle.toString(),ColorText.Color.BLUE);
                break;
            case(4):
                gridEle= ColorText.colorString(gridEle.toString(),ColorText.Color.GREEN);
                break;
            default:
                gridEle= ColorText.colorString(gridEle.toString(),ColorText.Color.BLACK);
                break;
        }
        return gridEle;
    }
    /***********************************************************************
     * function: accept
     * author: Raiza Soares
     * inputs: Empty e - an Empty object from the grid.
     * Description: Checks if we need to color empty objects based on areaT
     * variable. If yes, proceeds to color using the changeString. If no,
     * returns.
     **********************************************************************/
    @Override
    public void accept(Empty e) {
        if(areaT!= 1 && areaT!=2 && areaT!=3) {
            String gridEle= "⛶";
            gridEle= changeString(gridEle);
            e.SetType(gridEle);
        }


    }
    /***********************************************************************
     * function: accept
     * author: Raiza Soares
     * inputs: GreenSpace g- a Greenspace object from the grid.
     * Description: Checks if we need to color greenspace objects based on areaT
     * variable. If yes, proceeds to color using the changeString. If no,
     * returns.
     **********************************************************************/
    @Override
    public void accept(Greenspace g) {
        if(areaT==1) {
            String gridEle= "❦";
            gridEle= changeString(gridEle);
            g.SetType(gridEle);
        }


    }
    /***********************************************************************
     * function: accept
     * author: Raiza Soares
     * inputs: Panel p - a Panel object from the grid.
     * Description: Checks if we need to color panel objects based on areaT
     * variable. If yes, proceeds to color using the changeString. If no,
     * returns.
     **********************************************************************/
    @Override
    public void accept(Panel p) {
        if(areaT==3) {
            String gridEle= "⊞";
            gridEle= changeString(gridEle);
            p.SetType(gridEle);
        }

    }
    /***********************************************************************
     * function: accept
     * author: Raiza Soares
     * inputs: LightBulb b - a Lightbulb object from the grid.
     * Description: Checks if we need to color Lightbulb objects based on areaT
     * variable. If yes, proceeds to color using the changeString. If no,
     * returns.
     **********************************************************************/
    @Override
    public void accept(LightBulb l) {
        if(areaT==2) {
            String gridEle= "✦";
            gridEle= changeString(gridEle);
            l.SetType(gridEle);
        }

    }


}
