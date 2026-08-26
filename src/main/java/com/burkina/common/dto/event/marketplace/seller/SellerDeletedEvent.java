package com.burkina.common.dto.event.marketplace.seller;

import lombok.Builder;

import java.time.Instant;

@Builder
public record SellerDeletedEvent(
        Long sellerId,
        Long userId,
        Instant deletedAt
) {}
