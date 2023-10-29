package com.ps.ecommerce.service;

import com.ps.ecommerce.dto.UserDto;
import com.ps.ecommerce.entity.Address;
import com.ps.ecommerce.entity.User;
import com.ps.ecommerce.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserServiceImp implements UserService {

    private final UserRepository repository;

    @Override
    public User addUser(UserDto userDto) {
        System.out.println(userDto);
        User user = User.builder()
                .firstName(userDto.getFirstName())
                .lastName(userDto.getLastName())
                .email(userDto.getEmail())
                .phone(userDto.getPhone())
                .imageUrl(userDto.getImageUrl())
                .address(getAddressList(userDto))
                .build();

        User savedUser = repository.save(user);
        return savedUser;
    }

    private List<Address> getAddressList(UserDto userDto) {
        return userDto.getAddress().stream().map(addressDto ->
                Address.builder()
                        .fullAddress(addressDto.getFullAddress())
                        .city(addressDto.getCity())
                        .postalCode(addressDto.getPostalCode())
                        .userId(addressDto.getUserId())
                        .build()
        ).collect(Collectors.toList());
    }
}
