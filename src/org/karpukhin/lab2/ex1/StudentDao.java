package org.karpukhin.lab2.ex1;

import java.util.List;

/**
 * @author Pavel Karpukhin
 * @since 01.10.12
 */
public interface StudentDao {

    /**
     * Creates new student with given data or throws {@link ApplicationException} if no rows were inserted
     * @param student data of student to be created
     * @throws ApplicationException if no rows were inserted
     * @return student just created
     */
    Student createStudent(Student student);

    /**
     * Returns student found by given unique id or {@code null} otherwise
     * @param id unique id of student
     * @return student found by given unique id or {@code null} otherwise
     */
    Student getStudentById(int id);

    /**
     * Returns entire list of students
     * @return entire list of students
     */
    List<Student> getAllStudents();

    /**
     * Updates existing student by given data or throws {@link ApplicationException} if no rows were updated
     * @param student student data to be updated
     * @throws ApplicationException if no rows were updated
     */
    void updateStudent(Student student);

    /**
     * Deletes student with given unique id or throws {@link ApplicationException} if no rows were deleted
     * @param id unique id of student
     * @throws ApplicationException if no rows were deleted
     */
    void deleteStudentById(int id);

    /**
     * Creates STUDENTS table
     */
    void createTable();
}
