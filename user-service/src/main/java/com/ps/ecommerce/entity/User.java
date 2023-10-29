package com.ps.ecommerce.entity;

import lombok.Builder;
import lombok.Generated;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Setter
@Generated
@Builder
@Entity
@Table(name = "users")
public class User extends Auditable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private Integer id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "image_url")
    private String imageUrl;
    @Column(name = "email")
    private String email;
    @Column(name = "phone")
    private String phone;
    @OneToMany(mappedBy = "addressId", cascade = CascadeType.ALL)
    //@JoinColumn(name = "address", referencedColumnName = "addressId")
    private List<Address> address = new ArrayList<>();
}
