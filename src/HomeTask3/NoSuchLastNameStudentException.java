package HomeTask3;

public class NoSuchLastNameStudentException extends Exception {
    public NoSuchLastNameStudentException() {
    }

    public NoSuchLastNameStudentException(String message) {
        super(message);
    }
}
