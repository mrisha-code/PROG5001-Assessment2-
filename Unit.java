
/**
 * This class helps in managing student unit.
 *
 * Mrisha Upadhyay
 * 26/09/2022
 */
import java.util.*;
// creating class unit
public class Unit {
    // creating instance variables
    private String name; // instance variabke name
    private double total; // total from all assignments
    private ArrayList<Assignment> assignments; // creating array instance

    // creating constructor unit 
    public Unit(String name, ArrayList<Assignment> assignments, double total) {
        // initialising instance variables
        this.name = name; // initialise name
        this.total = total; // initialise total
        this.assignments = assignments; // initialise assignments
    }
    //geting unitname

    public String getUnitName() {
        return this.name; // returing unitname
    }
    // geting total mark

    public double getTotalMarks() {
        return this.total; // returing total marks
    }
    //geeting assigmnets from array list

    public ArrayList<Assignment> getassignments() {
        return this.assignments; // returing assignments from arraylist
    }

}
