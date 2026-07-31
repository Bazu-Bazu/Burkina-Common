package com.burkina.common.dto.event;

import lombok.Builder;

import java.time.Instant;

@Builder
public record UserDeletedEvent(
        Long userId,
        Instant deletedAt
) {}
