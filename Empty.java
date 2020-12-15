package soares_raiza;
/***********************************************************************
 * Class: Empty
 * author: Raiza Soares
 * Description: Empty object with symbol "⛶"
 **********************************************************************/
public class Empty {
    private String type= ColorText.colorString("⛶".toString(),ColorText.Color.BLACK);
    //constructor
    public  Empty()
    {

    }
    /***********************************************************************
     * function: SetType
     * author: Raiza Soares
     * input: String t : String that needs to the new Type.
     * Description: Function that can be used to change Type
     **********************************************************************/
    public void SetType(String t)
    {
        type= t;
    }
    /***********************************************************************
     * function: StringSend
     * author: Raiza Soares
     * Description: Function that can be used to return Type. Used mainly
     * during printing.
     **********************************************************************/
    public String StringSend()
    {
        return type;
    }

    /***********************************************************************
     * function: visit
     * author: Raiza Soares
     * Description: Function that accepts the Visitor.
     **********************************************************************/
    public void visit (Visitor v)
    {
         v.accept(this);
    }


}
