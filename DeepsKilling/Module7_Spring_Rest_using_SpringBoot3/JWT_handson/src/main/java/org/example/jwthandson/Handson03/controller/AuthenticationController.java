package JavaFSE.DeepsKilling.Module7_Spring_Rest_using_SpringBoot3.JWT_handson.src.main.java.org.example.jwthandson.Handson03.controller;

import org.example.jwthandson.Handson03.model.AuthenticationRequest;
import org.example.jwthandson.Handson03.model.AuthenticationResponse;
import org.springframework.web.bind.annotation.*;

//@RestController
public class AuthenticationController {

    @PostMapping("/authenticate")
    public AuthenticationResponse authenticate(@RequestBody AuthenticationRequest request) {

        return new AuthenticationResponse("Authentication Successful");
    }
}