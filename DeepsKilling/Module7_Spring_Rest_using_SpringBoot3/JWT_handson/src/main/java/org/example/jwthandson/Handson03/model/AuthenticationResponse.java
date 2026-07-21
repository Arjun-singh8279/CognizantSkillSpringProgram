package JavaFSE.DeepsKilling.Module7_Spring_Rest_using_SpringBoot3.JWT_handson.src.main.java.org.example.jwthandson.Handson03.model;

public class AuthenticationResponse {

    private String token;

    public AuthenticationResponse() {
    }

    public AuthenticationResponse(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}