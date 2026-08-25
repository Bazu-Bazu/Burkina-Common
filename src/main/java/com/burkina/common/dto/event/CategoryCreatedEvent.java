package com.burkina.common.dto.event;

import lombok.Builder;

@Builder
public record CategoryCreatedEvent(
        Long categoryId,
        Long parentId,
        String name
) {}
