import java.util.HashMap;
import java.util.Map;

/**
* This program is a school grading system.
*
* @author  Jedidiah Alfred
* @version 1.0
* @since   2023-06-14
*/

class Student {
    private int id;
    private String firstName;
    private String lastName;
    private Map<Subject, Grade> grades;

    /**
    * Constructor for this class.
    *
    * @param id from main class.
    * @param firstName from main class.
    * @param lastName from main class.
    */
    Student(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        grades = new HashMap<>();
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public Map<Subject, Grade> getGrades() {
        return grades;
    }

    /**
    * Sets student's grade in subject.'
    *
    * @param subject from main class.
    * @param grade from main class.
    */
    public void setGrade(Subject subject, Grade grade) {
        // Set the grade for the student in the specified subject
        grades.put(subject, grade);
    }
}
