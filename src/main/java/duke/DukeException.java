package duke;

public class DukeException extends Exception {
    public DukeException(String err) {
        super("OOPS!!! " + err);
    }
}