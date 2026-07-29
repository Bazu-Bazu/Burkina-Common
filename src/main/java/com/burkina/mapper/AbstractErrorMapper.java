package com.burkina.mapper;

import com.burkina.response.ErrorResponse;

import java.time.Instant;
import java.util.concurrent.CompletionException;

public abstract class AbstractErrorMapper {

    public final ErrorResponse from(Exception e) {
        Throwable cause = unwrapCompletionException(e);

        return ErrorResponse.builder()
                .errorCode(getErrorCode(cause))
                .error(cause.getClass().getSimpleName())
                .message(cause.getMessage())
                .timestamp(Instant.now())
                .build();
    }

    protected abstract int getErrorCode(Throwable e);

    private Throwable unwrapCompletionException(Throwable e) {
        Throwable cause = e;
        while (cause instanceof CompletionException) {
            cause = cause.getCause();
            if (cause == null) return e;
        }
        return cause;
    }
}
