package soares_raiza;
/***********************************************************************
 * Interface: Visitor
 * author: Raiza Soares
 * Description: Contains the accept functions for the four different
 * object types.
 **********************************************************************/
public interface Visitor {
    void accept(Empty e);
    void accept(Greenspace g);
    void accept (Panel p);
    void accept (LightBulb l);



}
