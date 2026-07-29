package com.burkina.response;

import lombok.Builder;

import java.time.Instant;

@Builder
public record ErrorResponse(

        Integer errorCode,
        String error,
        String message,
        Instant timestamp
) {}
