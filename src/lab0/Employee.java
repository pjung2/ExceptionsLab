package lab0;

import java.util.Date;

/**
 * In this challenge you need to address the probability that at some
 * point the arguments to method parameters may not be valid. 
 * <p>
 * For example, String arguments may be null or empty; other objects may be 
 * null; or primitive numbers may be out of acceptable range.
 * <p>
 * You need to validate ALL method parameters to make sure any and all 
 * arguments are valid. The only exception is when any argument is acceptable 
 * based on requirements. Fix the code below using if logic to validate
 * method arguments and throw IllegalArgumentException or a custom
 * exception if the validation fails.
 * 
 * @author  Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */

/**
 * 
 * @author Paul Jung, pjung2@my.wctc.edu
 * @Version 2.0
 */

public class Employee
{
    public static final int MAX_VACATION_DAYS = 28;
    private String firstName;
    private String lastName;
    private String ssn;
    private Date hireDate;
    private int daysVacation;

    public Employee()
    {
        firstName = "Unknown";
        lastName = "Unknown";
        ssn = "Unknown";
        hireDate = new Date();
        daysVacation = 0;
    }

    public Employee(String firstName, String lastName, String ssn, Date hireDate, int daysVacation)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
        this.hireDate = hireDate;
        this.daysVacation = daysVacation;
    }
    
    // All Exceptions (set methods) are organized here to enhance readability.
    public void setDaysVacation(int daysVacation)
    {
        if(daysVacation < 0)
        {
            throw new IllegalArgumentException();
        }
        this.daysVacation = daysVacation;
    }
    
    public void setFirstName(String firstName)
    {
        if(firstName == null)
        {
            throw new IllegalArgumentException();
        }
        this.firstName = firstName;
    }
    
    public void setHireDate(Date hireDate)
    {
        if(hireDate == null)
        {
            throw new IllegalArgumentException();
        }
        this.hireDate = hireDate;
    }
    
    public void setLastName(String lastName)
    {
        if(lastName == null)
        {
            throw new IllegalArgumentException();
        }
        this.lastName = lastName;
    }
    
    public void setSsn(String ssn)
    {
        if(ssn == null)
        {
            throw new IllegalArgumentException();
        }
        this.ssn = ssn;
    }
    
    public int getDaysVacation()
    {
        return daysVacation;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public Date getHireDate()
    {
        return hireDate;
    }

    public String getLastName()
    {
        return lastName;
    }

    public final String getSsn()
    {
        return ssn;
    }
    
}
