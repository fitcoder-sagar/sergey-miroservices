package com.learning.spring.user_ws.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class UserRequest {
    @NotNull(message = "First name of user cannot be null")
    @Size(min = 2 ,message="First name should be of minimum 2 charcters")
    private String firstName;
    @NotNull(message = "Last name of user cannot be null")
    @Size(min =2,message= "Last name should be of minimum 2 charcters")
    private String lastName;
    @Email(message = "Enter a valid email")
    private String email;
    private String password;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
