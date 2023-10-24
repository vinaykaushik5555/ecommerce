package com.ps.ecommerce.base;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class BaseResponse<T> {
    private int statusCode;
    private boolean status;
    private String message;
    private T data;
}
