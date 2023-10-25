package com.ps.ecommerce.service;

import com.ps.ecommerce.dto.UserDto;
import com.ps.ecommerce.entity.User;
import com.ps.ecommerce.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImp implements UserService {

    private final UserRepository repository;

    @Override
    public User addUser(UserDto userDto) {
        User user = User.builder()
                .firstName(userDto.getFirstName())
                .lastName(userDto.getLastName())
                .email(userDto.getEmail())
                .phone(userDto.getPhone())
                .imageUrl(userDto.getImageUrl())
                .build();

        User savedUser = repository.save(user);
        return savedUser;
    }
}
