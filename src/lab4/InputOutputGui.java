package lab4;

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
        String fullName = JOptionPane.showInputDialog("Enter full name:");
        String lastName = "";
        String msg = "";

        try
        {
            lastName = nameService.extractLastName(fullName);
        }
        
        catch (Exception e)
        {
            msg = "Please enter a valid full name";
        }
        
        finally
        {
            System.out.println("The startConversion method has been run");
        }

        if (msg.equals(""))
        {
            msg = "Your last name is: " + lastName;
        };

        JOptionPane.showMessageDialog(null, msg);
    }
    
}
