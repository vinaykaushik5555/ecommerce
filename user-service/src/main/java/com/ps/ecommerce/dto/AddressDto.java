package com.ps.ecommerce.dto;

import com.ps.ecommerce.base.BaseDto;
import com.ps.ecommerce.entity.Address;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class AddressDto extends BaseDto {
    private Integer userId;
    private String fullAddress;
    private String postalCode;
    private String city;

    @Override
    public String toString() {
        return "AddressDto{" +
                "userId=" + userId +
                ", fullAddress='" + fullAddress + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
