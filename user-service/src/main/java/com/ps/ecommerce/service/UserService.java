package com.ps.ecommerce.service;

import com.ps.ecommerce.dto.UserDto;
import com.ps.ecommerce.entity.User;

public interface UserService {
    public User addUser(UserDto userDto);
}
