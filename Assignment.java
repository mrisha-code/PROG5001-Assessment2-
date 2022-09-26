

/**
 * The main class of the assesement 
 *
 * Mrisha Upadhyay
 * 26/09/2022
 */
public class Assignment
{
    // creating instance variables for name and mark
    private String name;
    private String mark;

    // creating constructor for assignmnet
    public Assignment(String name, String mark)
    {
        // initialising instance variables
        this.name = name; // instance variable name
        this.mark = mark; // instance variable mark
    }
    // geting assignment name
    public String getAssignementName(){
        return this.name; // returning the assignment name
    }
    //geeting assignment mark
    public String getAssignmentMark(){
        return this.mark; // returning assignment marks
    }
}
