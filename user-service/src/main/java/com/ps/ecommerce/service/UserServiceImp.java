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
        User user = new User();
        user.setFirstName(userDto.getFirstName());
        user.setLastName(userDto.getLastName());
        user.setEmail(userDto.getEmail());
        user.setPhone(userDto.getPhone());
        user.setImageUrl(userDto.getImageUrl());
        user.setCreatedAt(userDto.getCreatedAt());
        user.setUpdatedAt(userDto.getUpdatedAt());
        User savedUser = repository.save(user);
        return savedUser;
    }
}
