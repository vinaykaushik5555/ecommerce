package com.ps.ecommerce.controller;

import com.ps.ecommerce.base.BaseResponse;
import com.ps.ecommerce.dto.UserDto;
import com.ps.ecommerce.entity.User;
import com.ps.ecommerce.service.UserServiceImp;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class UserController {

    private final UserServiceImp userServiceImp;

    @ResponseBody
    @PostMapping("/user")
    public ResponseEntity<BaseResponse> addUser(@RequestBody UserDto userDto) {
        User addedUser = userServiceImp.addUser(userDto);
        BaseResponse response = new BaseResponse();
        if (addedUser!=null) {
            response.setStatus(true);
            response.setStatusCode(HttpStatus.CREATED.value());
            response.setMessage("User added successfully.");

            userDto.setCreatedBy(addedUser.getCreatedBy());
            userDto.setCreatedAt(addedUser.getCreatedAt());
            userDto.setUpdatedBy(addedUser.getUpdatedBy());
            userDto.setUpdatedAt(addedUser.getUpdatedAt());

            response.setData(userDto);
            return new ResponseEntity<>(response, HttpStatus.CREATED);
        } else {
            response.setStatus(false);
            response.setStatusCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
            response.setMessage("User not added.");
            response.setData(null);
            return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


}
