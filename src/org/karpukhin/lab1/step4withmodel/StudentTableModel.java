package org.karpukhin.lab1.step4withmodel;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Pavel Karpukhin
 */
public class StudentTableModel extends AbstractTableModel {

    private static final String[] columns = {"Фамилия", "Имя", "Группа", "Дата рождения"};

    private List<Student> students = new ArrayList<Student>();

    public StudentTableModel(List<Student> students) {
        this.students = students;
    }

    @Override
    public int getRowCount() {
        return students.size();
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Student student = students.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return student.getLastName();
            case 1:
                return student.getFirstName();
            case 2:
                return student.getGroup();
            case 3:
                return student.getBirthDate();
        }
        return null;
    }

    @Override
    public String getColumnName(int column) {
        return columns[column];
    }

    public void setStudents(List<Student> students) {
        this.students = students;
        fireTableDataChanged();
    }
}
