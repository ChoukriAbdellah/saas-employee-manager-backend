package tech.getarrays.sass_employee_manager.exception;

public class UserNotFoundException  extends  RuntimeException {
    public UserNotFoundException(String message) {
        super(message);
    }
}
