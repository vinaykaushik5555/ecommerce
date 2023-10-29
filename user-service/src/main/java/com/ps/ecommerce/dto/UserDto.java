package com.ps.ecommerce.dto;

import com.ps.ecommerce.base.BaseDto;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class UserDto extends BaseDto {
    @NotNull(message = "First name can not be null or empty.")
    @NotEmpty(message = "First name can not be null or empty.")
    private String firstName;
    private String lastName;
    private String imageUrl;
    @Email(message = "Please enter valid email address.")
    @NotNull(message = "Email can not be null or empty.")
    @NotEmpty(message = "Email can not be null or empty.")
    private String email;
    @NotNull(message = "Phone number can not be null or empty.")
    @NotEmpty(message = "Phone number can not be null or empty.")
    private String phone;
    private List<AddressDto> address = new ArrayList<>();

    @Override
    public String toString() {
        return "UserDto{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", addresses=" + address +
                '}';
    }
}
