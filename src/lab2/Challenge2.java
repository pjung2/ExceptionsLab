package lab2;

/**
 * This challenge is similar to the first one, except that the architecture has
 * change to SOA. Now it's more important than ever to throw exceptions back to
 * a class that is responsible for displaying error messages.
 * <p>
 * No input or output should be performed here.
 *
 * @author Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */

/**
 *
 * @author Paul Jung, pjung2@my.wctc.edu
 * @Version 2.00
 */

public class Challenge2
{
    public static void main(String[] args)
    {
        try
        {
            new InputOutputGui().startConversation();
        }
        
        catch (Exception iae)
        {
            
        }

    }
    
}
