package soares_raiza;
/***********************************************************************
 * Class: Panel
 * author: Raiza Soares
 * Description: Extends Empty. Changes type to symbol "⊞"
 **********************************************************************/
public class Panel extends Empty
{
    private String type= ColorText.colorString("⊞".toString(),ColorText.Color.BLACK);;
    //constructor- modifies parent's type
    public Panel()
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
