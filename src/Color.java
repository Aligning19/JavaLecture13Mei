/**
 * Color enumerated data type
 * 
 * Contains three colors:
 *      GREEN - wins against BLACK
 *      BLACK - wins against RED
 *      RED   - wins against GREEN
 *
 *
 */
public enum Color 
{
    /** Green value */
    GREEN("Green"),
    /** Black value */
    BLACK("Black"),
    /** Red value */
    RED("Red");
    
    private String cardName;
    
    /**
     * Color Enum constructor.
     * @param cardName  The respective string of the 
     *                  Color card being made
     */
    private Color(String cardName)
    {
        this.cardName = cardName;
    }
    
    /**
     * Turn the Enum into a string
     * 
     * @return String representation of the color
     */
    public String toString()
    {
        return cardName;
    }
}
