package com.csrent.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public class UserDTO {

    private String name;
    @Email(message = "El correo no cumple una estructura válida")//De la estructura de un correo electrónico
    @NotBlank(message = "El correo no puede estar vacío")
    @Pattern(regexp = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[!@#$%^&*()]).{8,}$",
            message = "Expresión regular (lo que necesitamos que tenga), debería de llevar mayúsculas,minúsculas,etc.")
    private String email;
    private String password;
    private String rol;



}//end of class
