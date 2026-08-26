package com.burkina.common.dto.event.marketplace.product;

import lombok.Builder;

@Builder
public record ProductUnlockedEvent(
        Long productId
) {}
