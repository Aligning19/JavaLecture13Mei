/**
 * Fate enumerated data type
 *  
 * Contains fates:
 *      Riches      - receiver uses the Green Deck
 *      Revolution  - receiver uses the Red Deck
 */
public enum Fate 
{
    /** Riches value.  */
    RICHES("You have Green"),
    /** Revolution value. */
    REVOLUTION("You have Red");
    
    private String playersFate;
    
    /**
     * Fate Enum constructor.
     * @param playersFate   The string representing the
     *                      player's beginning fate.
     */
    private Fate(String playersFate)
    {
        this.playersFate = playersFate;
    }
    
    /**
     * Turn the Fate into a string
     * 
     * @return String representation of the player's fate
     */
    public String toString()
    {
        return playersFate;
    }
}
