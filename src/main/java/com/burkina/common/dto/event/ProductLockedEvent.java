package com.burkina.common.dto.event;

import lombok.Builder;

@Builder
public record ProductLockedEvent(
        Long productId
) {}
