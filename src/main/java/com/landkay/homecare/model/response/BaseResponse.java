package com.landkay.homecare.model.response;

import lombok.Data;

@Data
public abstract class BaseResponse<T> {

    public String code;
    public String msg;
    public T result;
}
