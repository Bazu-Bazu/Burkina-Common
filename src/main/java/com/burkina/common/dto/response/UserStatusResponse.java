package com.burkina.common.dto.response;

import lombok.Builder;

@Builder
public record UserStatusResponse(
        Long userId,
        boolean exists,
        boolean active
) {}
