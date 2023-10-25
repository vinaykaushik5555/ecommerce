package com.ps.ecommerce.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class UserDto extends BaseDto {
    private String firstName;
    private String lastName;
    private String imageUrl;
    private String email;
    private String phone;
}
