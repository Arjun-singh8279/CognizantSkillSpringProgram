package JavaFSE.DeepsKilling.Module7_Spring_Rest_using_SpringBoot3.spring_rest_handson.src.main.java.org.example.springresthandson.exception;

public class CountryNotFoundException extends RuntimeException {

    public CountryNotFoundException(String message) {
        super(message);
    }
}