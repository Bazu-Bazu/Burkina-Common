package com.burkina.common.dto.event.marketplace.product;

import lombok.Builder;

import java.math.BigDecimal;
import java.util.List;

@Builder
public record ProductUpdatedEvent(
        Long productId,
        String name,
        String description,
        BigDecimal price,
        String imageUrl,
        List<Long> categoryIds
) {}
