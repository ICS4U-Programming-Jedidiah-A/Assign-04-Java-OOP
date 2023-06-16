import java.util.Map;

/**
* This program is a school grading system.
*
* @author  Jedidiah Alfred
* @version 1.0
* @since   2023-06-15
*/

class SchoolGrading {
    private Student[] students;
    private Subject[] subjects;

    /**
    * Constructor for this class.
    */
    SchoolGrading() {
        students = new Student[0];
        subjects = new Subject[0];
    }

    /**
    * This is the method returns a string.
    *
    * @param student This is the student for the output
    */

    public void addStudent(Student student) {
        // Append the student to the students array
        final Student[] updatedStudents = new Student[students.length + 1];
        System.arraycopy(students, 0, updatedStudents, 0, students.length);
        updatedStudents[students.length] = student;
        students = updatedStudents;
    }

    /**
    * This is the method returns an array.
    *
    * @param subject This is the student for the output
    */

    public void addSubject(Subject subject) {
        // Append the subject to the subjects array
        final Subject[] updatedSubjects = new Subject[subjects.length + 1];
        System.arraycopy(subjects, 0, updatedSubjects, 0, subjects.length);
        updatedSubjects[subjects.length] = subject;
        subjects = updatedSubjects;
    }

    /**
    * This method returns an array.
    *
    * @param student This is the student output
    * @param subject This is the subject output
    * @param grade This is the grade output
    */

    public void recordGrade(Student student, Subject subject, Grade grade) {
        // Set the grade for the student in the specified subject
        student.setGrade(subject, grade);
    }

    /**
    * This is the method returns an .
    *
    * @param student This is the student for the output
    * @return the student's average.
    */

    public double calculateAverageGrade(Student student) {
        // Calculate the average grade for the student
        final Map<Subject, Grade> studentGrades = student.getGrades();
        double totalGrade = 0;
        final int count = studentGrades.size();

        for (Grade grade : studentGrades.values()) {
            totalGrade += grade.getValue();
        }

        return totalGrade / count;
    }

    /**
    * This is the method returns a string.
    *
    * @param student This is the student for the output
    */

    public void generateReportCard(Student student) {
        // Generate the report card for the student
        final Map<Subject, Grade> studentGrades = student.getGrades();
        System.out.println("Report Card for " + student.getFullName() + ":");

        for (Map.Entry<Subject, Grade> entry : studentGrades.entrySet()) {
            final Subject subject = entry.getKey();
            final Grade grade = entry.getValue();
            System.out.println(subject.getName() + ": " + grade.getValue());
        }
    }
}
