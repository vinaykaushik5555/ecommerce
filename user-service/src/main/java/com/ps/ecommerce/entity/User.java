package com.ps.ecommerce.entity;

import lombok.Generated;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Generated
@Entity
@Table(name = "users")
public class User extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private int id;
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
}
