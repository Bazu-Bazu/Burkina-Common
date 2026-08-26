package com.burkina.common.dto.event.user;

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
