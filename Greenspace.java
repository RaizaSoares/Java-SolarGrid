package soares_raiza;
/***********************************************************************
 * Class: Greenspace
 * author: Raiza Soares
 * Description: Extends Empty. Changes type to symbol "❦"
 **********************************************************************/
public class Greenspace extends Empty
{
    private String type= ColorText.colorString("❦".toString(),ColorText.Color.BLACK);
    //constructor- modifies parent's type
    public Greenspace()
    {
        super.SetType(type);
    }

    /***********************************************************************
     * function: visit
     * author: Raiza Soares
     * Description: Function that accepts the Visitor.
     **********************************************************************/
    @Override
    public void visit(Visitor v)
    {
         v.accept(this);
    }

}
