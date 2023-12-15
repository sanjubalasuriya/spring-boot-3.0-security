package com.security.sample.dto.request;

import lombok.Data;

@Data

public class SignUpRequestDto {

    private String firstName;

    private String lastName;

    private String email;

    private String password;
}
