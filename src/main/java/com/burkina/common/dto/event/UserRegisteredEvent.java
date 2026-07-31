package com.burkina.common.dto.event;

import lombok.Builder;

import java.time.Instant;

@Builder
public record UserRegisteredEvent(
        Long userId,
        String username,
        String phone,
        String email,
        Instant registeredAt
) {}
