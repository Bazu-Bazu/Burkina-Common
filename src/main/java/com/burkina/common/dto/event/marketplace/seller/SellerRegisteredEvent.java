package com.burkina.common.dto.event.marketplace.seller;

import lombok.Builder;

import java.time.Instant;

@Builder
public record SellerRegisteredEvent(
        Long sellerId,
        Long userId,
        String name,
        Instant createdAt
) {}
