

/**
 * The class helps to display student details. 
 *
 * Mrisha Upadhyay
 * 26/09/2022
 */
public class Student {
    // Creating instance variables 
    private String lastName; // instance vatiables lastname
    private String firstName;// instance vatiables firstname
    private String studentId;// instance vatiables studentId
    
   //Creating constructor students
    public Student(String lastName, String firstName, String studentId, Unit unit) {
        // initialising instance variables
        this.lastName = lastName;// instance variable lastname
        this.firstName = firstName; // instance variable firstname
        this.studentId = studentId; // instance variable studentname
    }
    // Geting studnetname

    public String getStudentName() {
        return this.lastName + " " + this.firstName; // returing lastname and fistname
    }
    // geting studentId

    public String getStudentId() {
        return this.studentId; // returing studentId
    }

}
