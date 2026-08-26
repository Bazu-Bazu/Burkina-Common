package com.burkina.common.dto.event.marketplace.product;

import lombok.Builder;

import java.math.BigDecimal;
import java.util.List;

@Builder
public record ProductPublishedEvent(
        Long productId,
        Long sellerId,
        String name,
        String description,
        BigDecimal price,
        String imageUrl,
        List<Long> categoryIds
) {}
