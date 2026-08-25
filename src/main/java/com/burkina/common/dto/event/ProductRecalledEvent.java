package com.burkina.common.dto.event;

import lombok.Builder;

@Builder
public record ProductRecalledEvent(
        Long productId
) {}
