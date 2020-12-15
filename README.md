# Java-SolarGrid
Solar grid design- Used Java's support for ANSI color encoding of text, and the visitor pattern.
The program starts with displaying the menu and an empty
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
