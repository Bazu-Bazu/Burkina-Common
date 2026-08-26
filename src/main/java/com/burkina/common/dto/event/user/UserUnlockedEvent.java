package com.burkina.common.dto.event.user;

import lombok.Builder;

@Builder
public record UserUnlockedEvent(
        Long userId
) {}
