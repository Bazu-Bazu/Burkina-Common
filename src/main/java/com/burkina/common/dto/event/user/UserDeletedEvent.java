package com.burkina.common.dto.event.user;

import lombok.Builder;

import java.time.Instant;

@Builder
public record UserDeletedEvent(
        Long userId,
        Instant deletedAt
) {}
