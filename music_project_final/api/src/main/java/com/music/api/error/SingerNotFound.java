package com.music.api.error;

import com.music.api.base.Error;
import org.springframework.http.HttpStatus;

public class SingerNotFound implements Error {
    @Override
    public HttpStatus getCode() {
        return HttpStatus.NOT_FOUND;
    }

    @Override
    public String getMessage() {
        return "Singer not found!";
    }
}
