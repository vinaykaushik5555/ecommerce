package com.ps.ecommerce.dto;

import com.ps.ecommerce.base.BaseDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDto extends BaseDto {
    private String firstName;
    private String lastName;
    private String imageUrl;
    private String email;
    private String phone;
}
