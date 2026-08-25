package com.burkina.common.dto.event;

import lombok.Builder;

@Builder
public record CategoryActivatedEvent(
        Long categoryId
) {}
