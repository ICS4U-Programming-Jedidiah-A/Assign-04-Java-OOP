/**
* This program is a school grading system.
*
* @author  Jedidiah Alfred
* @version 1.0
* @since   2023-06-14
*/

public final class Main {
    /**
    * This is a private constructor used to satisfy the
    * style checker.
    *
    * @exception IllegalStateException Utility Class
     */
    private Main() {
        throw new IllegalStateException("Utility Class");
    }

    /**
    * Main code.
    *
    * @param args not used.
    */
    public static void main(String[] args) {
        // Create a SchoolGrading object
        final SchoolGrading schoolGrading = new SchoolGrading();

        // Create some Student objects
        final Student student1 = new Student(1, "John", "Doe");
        final Student student2 = new Student(2, "Jane", "Smith");

        // Create some Subject objects
        final Subject math = new Subject(1, "Mathematics");
        final Subject science = new Subject(2, "Science");

        // Add students and subjects to the school grading system
        schoolGrading.addStudent(student1);
        schoolGrading.addStudent(student2);
        schoolGrading.addSubject(math);
        schoolGrading.addSubject(science);

        // Record grades for students
        schoolGrading.recordGrade(student1, math, new Grade(90));
        schoolGrading.recordGrade(student1, science, new Grade(85));
        schoolGrading.recordGrade(student2, math, new Grade(95));
        schoolGrading.recordGrade(student2, science, new Grade(92));

        // Calculate and display average grades for students
        final double averageGrade1 =
            schoolGrading.calculateAverageGrade(student1);
        final double averageGrade2 =
            schoolGrading.calculateAverageGrade(student2);

        System.out.println("Average grade for " + student1.getFullName()
            + ": " + averageGrade1);
        System.out.println("Average grade for " + student2.getFullName()
            + ": " + averageGrade2);

        // Generate report cards for students
        schoolGrading.generateReportCard(student1);
        schoolGrading.generateReportCard(student2);
    }
}
