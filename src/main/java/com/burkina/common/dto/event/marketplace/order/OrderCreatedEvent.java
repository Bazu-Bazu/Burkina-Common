package com.burkina.common.dto.event.marketplace.order;

import lombok.Builder;

@Builder
public record OrderCreatedEvent(
        Long orderId,
        Long userId,
        Long sagaId
) {}
