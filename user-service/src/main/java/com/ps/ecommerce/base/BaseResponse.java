package com.ps.ecommerce.base;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
public class BaseResponse<T> {
    private int statusCode;
    private boolean status;
    private String message;
    private T data;
}
