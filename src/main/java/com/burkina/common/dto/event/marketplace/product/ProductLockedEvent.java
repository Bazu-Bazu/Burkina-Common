package com.burkina.common.dto.event.marketplace.product;

import lombok.Builder;

@Builder
public record ProductLockedEvent(
        Long productId
) {}
