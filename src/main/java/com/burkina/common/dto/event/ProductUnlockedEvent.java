package com.burkina.common.dto.event;

import lombok.Builder;

@Builder
public record ProductUnlockedEvent(
        Long productId
) {}
