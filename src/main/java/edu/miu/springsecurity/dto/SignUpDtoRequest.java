package edu.miu.springsecurity.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SignUpDtoRequest {
    private String userName;
    private String password;
    private String firstName;
    private String lastName;

    private int roleId;
}