package HomeTask3;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Misha", "Gerashchenko", 27, Gender.MALE, "MSKD", 14881);
        Student student2 = new Student("August", "Fantasy", 27, Gender.MALE, "MSKD", 14882);
        Student student3 = new Student("September", "Mix", 27, Gender.MALE, "MSKD", 14883);
        Student student4 = new Student("October", "Aroma", 27, Gender.FEMALE, "MSKD", 14884);
        Student student5 = new Student("November", "Labrador", 27, Gender.MALE, "MSKD", 14885);
        Student student6 = new Student("December", "Fiona", 27, Gender.FEMALE, "MSKD", 14886);
        Student student7 = new Student("January", "Malifisenta", 27, Gender.MALE, "MSKD", 14887);
        Student student8 = new Student("Fabrury", "Alkan", 27, Gender.MALE, "MSKD", 14888);
        Student student9 = new Student("March", "Gordeev", 27, Gender.MALE, "MSKD", 14889);
        Student student10 = new Student("April", "Stanislavsky", 27, Gender.MALE, "MSKD", 148810);
        Student student11 = new Student("May", "Leshcehnko", 27, Gender.MALE, "MSKD", 148811);


        Group group = new Group("MSKD");

        try {
            group.addStudent(student1);
            group.addStudent(student2);
            group.addStudent(student3);
            group.addStudent(student4);
            group.addStudent(student5);
            group.addStudent(student6);
            group.addStudent(student7);
            group.addStudent(student8);
            group.addStudent(student9);
            group.addStudent(student10);
            group.addStudent(student11);
        } catch (GroupEngagedException e) {
            System.out.println(e.getMessage());
        }
        group.removeStudent(14884L);
        System.out.println(group);
        try {
            System.out.println(group.findStudent("Alkan"));
        } catch (NoSuchLastNameStudentException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("-------------------------------------------------------");
        System.out.println(group);
        group.showArray(group);
    }
}
