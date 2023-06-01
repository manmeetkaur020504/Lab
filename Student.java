
import java.util.*;

/**
 * 
 */
public class Student {

    /**
     * Default constructor
     */
    public Student() {
    }

    /**
     * 
     */
    private String firstname;

    /**
     * 
     */
    private String lastname;

    /**
     * @return
     */
    public String getFirstname() {
        // TODO implement here
        return "";
    }

    /**
     * @param value
     */
    public void setFirstname(String fname) {
        // TODO implement here
        if (fname != null && !fname.isEmpty()) {
            firstname = fname;
        } else {
            throw new IllegalArgumentException("Enter your Firstname");
        }
    }

    /**
     * @return
     */
    public String getLastname() {
        // TODO implement here
        return "";
    }

    /**
     * @param value
     */
    public void setLastname(String lname) {
        // TODO implement here
        if (lname != null && !lname.isEmpty()) {
            lastname = lname;
        } else {
            throw new IllegalArgumentException("Eneter your last name");
        }
    }

    /**
     * @param First_name 
     * @param Last_name
     */
    public void Student(String First_name, String Last_name) {
        // TODO implement here
    }

}