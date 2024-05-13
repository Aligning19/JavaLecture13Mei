/**
 * The Red Deck which holds cards of type Color.
 *
 * 
 *          
 */
public class FateDeck extends Deck<Fate, Card<Fate>>
{
    /**
     * Constructor for the Red Deck
     */
    public FateDeck()
    {
        super("Fate Deck");
    }

    /**
     * Build the Red Deck.
     * 
     * This is specifically: 1 Red Card and 4 Black Cards
     */
    @Override
    public void populateDeck()
    {
        destroyDeck();
        drawingStack.add(new Card<>(Fate.RICHES));
        drawingStack.add(new Card<>(Fate.REVOLUTION));
    }
}
