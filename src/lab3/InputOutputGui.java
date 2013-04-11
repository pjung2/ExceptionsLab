package lab3;

import javax.swing.JOptionPane;

/**
 * This class is responsible for all input and output in the program.
 *
 * @author Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */

/**
 *
 * @author Paul Jung, pjung2@my.wctc.edu
 * @Version 2.00
 */

public class InputOutputGui
{
    private NameService nameService;

    public InputOutputGui()
    {
        nameService = new NameService();
    }

    public void startConversation()
    {
        try
        {
            String fullName = JOptionPane.showInputDialog("Enter full name:");
            String lastName = nameService.extractLastName(fullName);
            String msg = "Your last name is: " + lastName;
            JOptionPane.showMessageDialog(null, msg);
        }
        
        catch (InvalidNameException e)
        {
            String title = "Invalid Name";
            JOptionPane.showMessageDialog(null, e.getMessage(), title, JOptionPane.ERROR_MESSAGE);
            System.err.println(e.getMessage() + "\n");
            System.err.println(e.toString() + "\n");
        }
        
        finally
        {
            System.exit(0);

        }

    }

    public static void main(String[] args)
    {
        InputOutputGui iog = new InputOutputGui();
        iog.startConversation();
    }
    
}
