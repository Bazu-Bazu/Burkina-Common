package com.burkina.common.dto.event.marketplace.category;

import lombok.Builder;

@Builder
public record CategoryActivatedEvent(
        Long categoryId
) {}
