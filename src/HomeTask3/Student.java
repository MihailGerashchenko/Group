package HomeTask3;

public class Student extends Human {
    private String group;
    private long idCard;

    public Student() {
    }

    public Student(String name, String lastName, int age, Gender gender, String group, int idCard) {
        super(name, lastName, age, gender);
        this.group = group;
        this.idCard = idCard;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public long getIdCard() {
        return idCard;
    }

    public void setIdCard(int idCard) {
        this.idCard = idCard;
    }

    @Override
    public String toString() {
        return "Student{" +
                "group='" + group + '\'' +
                ", idCard=" + idCard + " " +
                super.toString();
    }
}
