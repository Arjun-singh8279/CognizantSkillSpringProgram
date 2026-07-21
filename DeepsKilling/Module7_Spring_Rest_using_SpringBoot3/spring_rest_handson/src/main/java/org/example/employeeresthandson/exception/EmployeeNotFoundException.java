package JavaFSE.DeepsKilling.Module7_Spring_Rest_using_SpringBoot3.spring_rest_handson.src.main.java.org.example.employeeresthandson.exception;

public class EmployeeNotFoundException extends RuntimeException {

    public EmployeeNotFoundException(String message) {
        super(message);
    }
}