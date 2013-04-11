package lab1;

import javax.swing.JOptionPane;

/**
 * The purpose of this challenge is to give you practice time using Java
 * Exception handling techniques.
 * <p>
 * Your challenge is to consider all the possible things that can go wrong with
 * this program and use exception handling where appropriate to prevent the
 * program from crashing. In addition you must display a friendly error message
 * in a JOptionPane and ask the user to try again.
 *
 * @author Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */

/**
 *
 * @author Paul Jung, pjung2@my.wctc.edu
 * @Version 2.00
 */

public class Challenge1
{
    private static final int LAST_NAME_IDX = 1;

    public static void main(String[] args)
    {
        Challenge1 app = new Challenge1();

        String msg = "";
        String lastName = "";
        String fullName = JOptionPane.showInputDialog("Enter full name:");

        try
        {
            lastName = app.extractLastName(fullName);
        }
        
        catch (IllegalArgumentException iae)
        {
            msg = "Please enter a valid full name";
        }

        if (msg.equals(""))
        {
            msg = "Your last name is: " + lastName;
        }

        JOptionPane.showMessageDialog(null, msg);
    };
    
public String extractLastName(String fullName) throws IllegalArgumentException
    {
        int dif = fullName.length() - fullName.replaceAll(" ", "").length();
        
        if (dif != 1)
        {
            throw new IllegalArgumentException();
        }
        
        String[] nameParts = fullName.split(" ");
        return nameParts[LAST_NAME_IDX];
    }

}
