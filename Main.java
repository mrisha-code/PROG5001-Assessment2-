
/**
 * Main class of the object.
 *
 * Mrisha Upadhyay 
 * 26/09/2022
 */
import java.util.*;
import java.io.*;
// Making Main class for an object
public class Main {

    private static String unitName; // Decleration of instance variables
    private static ArrayList<Student> studentRecords = new ArrayList<Student>(); // Decleration of instance variales

    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(new File("C:\\Users\\inlig\\Downloads\\prog5001_students_grade_2022.csv"));

            unitName = sc.nextLine().split(":", 2)[1]; // reading of unit name

            sc.nextLine(); // Skip for the header text
            
            // running while loop for student record
            while (sc.hasNextLine()) { 

                createStudentRecord(sc.nextLine()); // Creation of studentrecord
            }
            
        } catch (Exception e) {
            System.out.println("There is something wrong!"); // printing if code gets wrong
        }

        System.out.println(studentRecords.size()); // printing the size of studnet record..
    }
    
    //Creating class for the student record
        public static void createStudentRecord(String line) {

        Unit unit; // data type for units
        Student student; //data type for studnet
        ArrayList<Assignment> assignments; // for assignment
        String lastName; // data type for lastname
        String firstName; // data type for firstname
        String studentId; // data type for studentid
        String A1; // data type for Assignment 1
        String A2; // data type for Assignment 2
        String A3; // data type for Assignment 3
        double total = 0; // decleartion for total

        String[] studentRecord = line.split(",", -1); // decleration of arry for studentRecord

        lastName = studentRecord[0]; // geeting data from array for lastname
        firstName = studentRecord[1]; // geeting data from array firstname
        studentId = studentRecord[2]; // geeting data from array studentid

        A1 = studentRecord[3]; // geeting data from array for A1
        A2 = studentRecord[4]; // geeting data from array for A2
        A3 = studentRecord[5]; // geeting data from array for A3
        
        // if else condition to measure and get the length of the student record...
        if (studentRecord.length < 3) {
        A1 = "0";
         } else {
         A1 = studentRecord[3]; // geeting data of A1
         }
        if (studentRecord.length < 4) {
         A2 = "0";
         } else {
        A2 = studentRecord[4]; // geting data of A2
         }
        if (studentRecord.length < 5) {
        A3 = "0";
         } else {
         A3 = studentRecord[5]; // geting data of A3
         }

        assignments = new ArrayList<Assignment>(); // creating arry assignments
        assignments.add(new Assignment("A1", A1)); // adding A1
        assignments.add(new Assignment("A1", A2)); // adding A2
        assignments.add(new Assignment("A1", A3)); // adding A3

        // Calculating total marks and adding the data

        if (!A1.isEmpty()) {
            total += Double.parseDouble(A1); // calculating A1
        }
        if (!A2.isEmpty()) {
            total += Double.parseDouble(A2); // calculating A2
        }
        if (!A3.isEmpty()) {
            total += Double.parseDouble(A3); // calculating A3
        }

        System.out.println(assignments.size()); // printing the size of assignments

        unit = new Unit(unitName, assignments, total); // creating unit

        student = new Student(lastName, firstName, studentId, unit); // creating studnet

        studentRecords.add(student); // adding student to student reocrds

    }

    
}
