import java.util.Stack;
import java.util.Collections;

/**
 * Deck for a generic type of cards
 *
 *
 * @param <T>   The Type of the Cards
 * @param <T2>  Card Class of some chosen type
 */
public abstract class Deck<T, T2 extends Card<T>> 
{
    /** Stack of cards that have been used already. */
    protected Stack<T2> discardStack;
    
    /** Stack of cards yet to be used. */
    protected Stack<T2> drawingStack;
    
    /** Some description or title of the deck being used. */
    private String name;
    
    /**
     * Deck Constructor.
     * 
     * Creates a Discard Stack and Drawing Stack with initially
     * zero cards inside both. 
     * 
     * @param name The title or description of this deck
     */
    public Deck(String name)
    {
        this.name = name;
        
        discardStack = new Stack<>();
        drawingStack = new Stack<>();
    }
    
    /**
     * Add cards to the Stack to ensure the deck has some
     * cards to use for play.
     */
    public abstract void populateDeck();
    
    /**
     * Draw a card from the Drawing Stack if there is a card
     * to draw. If one is not available, the Discard Stack is 
     * popped completely into the Drawing Stack, and the Drawing 
     * Stack is shuffled. A card is then drawn.
     * 
     * Before this card's value is returned by the method, the 
     * card is first pushed onto the top of the Discard Stack.
     * 
     * @return  The value of the top card of the drawingStack
     */
    public T drawCard()
    {
    	// If the drawingStack is empty, refill the drawingDeck and shuffle
        if (drawingStack.isEmpty())
        {
            System.out
                    .println(String.format("Hold up. Shuffling the %s", 
                            name));
           resetDeck();
        }

        // TODO: Draw the top card of the Drawing Stack
        
        T2 card = drawingStack.pop();

        // TODO: Push it on the Discard Stack then return the card's value
        discardStack.push(card);
        
        return card.getCardValue();
    }
    
    /**
     * Shuffle the drawingStack
     */
    public void shuffleDeck()
    {
        Collections.shuffle(drawingStack);
    }
    
    /**
     * Push all of the cards in the Discard Stack onto the Drawing Stack and shuffle
     */
    public void resetDeck()
    {
        drawingStack.addAll(discardStack);
        discardStack.clear();
        shuffleDeck();
    }
    
    /**
     * Remove all cards from both card Stacks
     */
    protected void destroyDeck()
    {
    	discardStack.clear();
        drawingStack.clear();
    }
}
