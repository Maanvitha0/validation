package com.example.validation.dto;



import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.*;
import lombok.Data;


@Data
public class UserDTO {

    @NotNull(message = "{user.name.required}")
    @Size(min = 2, max = 10, message = "{user.name.length}")
    private String name;

   @NotNull(message = "{user.email.required}")
    private String email;

    @Size(min = 5, message = "{user.password.length}")
    @NotNull(message = "{user.password.required}")
    private String password;
}