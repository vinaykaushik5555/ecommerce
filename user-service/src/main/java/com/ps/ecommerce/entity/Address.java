package com.ps.ecommerce.entity;

import lombok.Builder;
import lombok.Generated;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Generated
@Builder
@Entity
@Table(name = "address")
public class Address extends Auditable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "address_id")
    private Integer addressId;
    @Column(name = "user_id")
    private Integer userId;
    @Column(name = "full_address")
    private String fullAddress;
    @Column(name = "postal_code")
    private String postalCode;
    @Column(name = "city")
    private String city;

    @Override
    public String toString() {
        return "Address{" +
                "id=" + addressId +
                ", userId=" + userId +
                ", fullAddress='" + fullAddress + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
