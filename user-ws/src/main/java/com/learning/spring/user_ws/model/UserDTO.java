package com.learning.spring.user_ws.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.io.Serializable;

public class UserDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private String encryptedPassword;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String userId;
}
