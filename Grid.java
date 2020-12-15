package soares_raiza;
/***********************************************************************
 * Class: Grid
 * author: Raiza Soares
 * Description: Contains the grid that holds the different types of
 * objects. It is initialised to contain all empty objects. This class
 * also contains functions to print the grid, change the symbols and
 * call the visitors.
 **********************************************************************/
public class Grid {
        private Empty [][] grid= new Empty[5][5];
        //constructor initialises all elements in grid to empty objects
         public Grid()
        {
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    grid[i][j]= new Empty();
                }
            }
        }
    /***********************************************************************
     * function: getSmallArea
     * author: Raiza Soares
     * Description: Function to return an individual area when called.
     **********************************************************************/
    public Empty getSmallArea(int y, int x)
    {
        return grid[x][y];
    }
    /***********************************************************************
     * function: printGrid
     * author: Raiza Soares
     * Description: Function to print the symbols of all the objects in the
     * grid
     **********************************************************************/
    public void printGrid() {

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++)
            {
                String t= grid[i][j].StringSend();
                System.out.print(t);
            }
            System.out.println("\n");
        }

    }
    /***********************************************************************
     * function: ChangeSymbol
     * author: Raiza Soares
     * Description: Set a particular location to any area object specified.
     **********************************************************************/
    public void ChangeSymbol(int index, int x, int y)
    {
        String t="";
        //index contains information regarding which object to change to.
        if(index==1)
        {
            grid[y][x]= new Greenspace();
        }
        else if(index==2)
        {
            grid[y][x]= new LightBulb();
        }
        else if(index==3)
        {
            grid[y][x]= new Panel();
        }
        else
        {
            grid[y][x]= new Empty();

        }

    }
    /***********************************************************************
     * function: changeEmpty
     * author: Raiza Soares
     * Description: Function to set a location to an empty object.
     **********************************************************************/
    public void changeEmpty(int x, int y)
    {
        grid[y][x]= new Empty();
    }
    /***********************************************************************
     * function: makeDefaultGrid
     * author: Raiza Soares
     * Description: Function to set the grid objects to a certain given
     * grid.
     **********************************************************************/
    public void makeDefaultGrid()
    {
        grid[0][0]=new Panel();
        grid[0][1]=new Panel();
        grid[0][2]=new Panel();
        grid[0][3]=new Empty();
        grid[0][4]= new Greenspace();

        grid[1][0]=new LightBulb();
        grid[1][1]=new LightBulb();
        grid[1][2]=new LightBulb();
        grid[1][3]=new Panel();
        grid[1][4]= new Empty();

        grid[2][0]=new Empty();
        grid[2][1]=new Panel();
        grid[2][2]=new Panel();
        grid[2][3]=new LightBulb();
        grid[2][4]= new Panel();

        grid[3][0]=new Empty();
        grid[3][1]=new Empty();
        grid[3][2]=new Empty();
        grid[3][3]=new Panel();
        grid[3][4]= new Empty();

        grid[4][0]=new Greenspace();
        grid[4][1]=new LightBulb();
        grid[4][2]=new Empty();
        grid[4][3]=new  Empty();
        grid[4][4]= new Greenspace();
    }
    /***********************************************************************
     * function: VisCount
     * author: Raiza Soares
     * Description: Function to call the count visitor on every object of the
     * grid. The visitor will then take care of counting the individual objects
     **********************************************************************/
    public void VisCount()
    {
        Count vi= new Count();
        //loops through every element in the grid.
        for(int i=0; i<5; i++) {
            for (int j = 0; j < 5; j++) {
                // GRADING: COUNT
                grid[i][j].visit(vi);
            }
        }
        //function in the count visitor that prints the counts of the objects.
        vi.printS();
    }
    /***********************************************************************
     * function: VisColor
     * author: Raiza Soares
     * inputs: areaType - Integer to describe the type of object we want to color
     * color - Integer to describe the color the above object must be colored to.
     * Description: Function to call the color visitor on every object of the
     * grid. The visitor will then take care of coloring the specified objects
     **********************************************************************/
    public void VisColor(int areaType, int color)
    {
        //Color visitor takes in areaType and color.
        Color vis= new Color(areaType,color);
        //loops through every element in the grid.
        for(int i=0; i<5; i++) {
            for (int j = 0; j < 5; j++) {
                //GRADING: COLOR
                grid[i][j].visit(vis);
            }
        }
    }
    /***********************************************************************
     * function: VisLightUp
     * author: Raiza Soares
     * inputs: visi - LightUp visitor created in SolarStart.
     * Description: Function to call the LightUp visitor on every object of the
     * grid. The visitor will then take care of Lighting up the bulbs accordingly
     **********************************************************************/
    public void VisLightUp(LightUp visi)
    {
        for(int i=0; i<5; i++) {
            for (int j = 0; j < 5; j++) {

                grid[i][j].visit(visi);

            }
        }
    }



}
