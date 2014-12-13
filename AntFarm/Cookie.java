/**
 * Cookie.java 
 *
 * @author - Jane Doe
 */

/**
 * A <code>Cookie</code> sits around and waits for a
 * <code>WorkerAnt</code> to get food from it.
 * It does not act.
 */
public class Cookie extends Food
{
    /** The size of a bite */
    private static final int BITE=1;

    /**
     * Constructs a <code>Cookie</code> actor.  The Cookie.gif is
     * displayed for this actor without tinting.
     */
    public Cookie()
    {
        super(BITE);
        
        
    }
}
