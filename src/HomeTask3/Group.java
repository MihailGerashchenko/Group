package HomeTask3;

import java.util.Arrays;
import java.util.Comparator;

public class Group {
    private String name;
    private Student[] students = new Student[10];

    public Group(String name) {
        this.name = name;
    }

    public Group() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student[] getStudent() {
        return students;
    }

    public void setStudent(Student[] student) {
        this.students = student;
    }

    public Boolean addStudent(Student student) throws GroupEngagedException {
        for (int i = 0; i <= students.length; i++) {
            if (i > 9) {
                throw new GroupEngagedException("The group " + getName() + " is already engaged, the last student was " + students[9].getName());
            }
            if (students[i] == null) {
                students[i] = student;
                return true;
            } else {
                continue;
            }
        }
        return false;
    }

    public Boolean removeStudent(Long id) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null && students[i].getIdCard() == id) {
                students[i] = null;
                return true;
            }
        }
        return false;
    }

    public Student findStudent(String lastName) throws NoSuchLastNameStudentException {
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null && students[i].getLastName().equals(lastName)) {
                return students[i];
            } else {
                continue;
            }
        }
        throw new NoSuchLastNameStudentException("There is no student with such lastname");
    }
    public void showArray(Group group){
        for (Student student : students) {
            System.out.println(student);
        }
    }

    @Override
    public String toString() {
        Arrays.sort(students, Comparator.nullsFirst(new StudentsLastNameCamparator()));
        return "Group{" +
                "name='" + name + '\'' +
                ", student=" + Arrays.toString(students) +
                '}';
    }
}
