package dev.zbib.userservice.model.request;

import lombok.Getter;

@Getter
public class UserRequest {
    private String username;
    private String password;
    private String repeatPassword;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
}
