package com.burkina.common.dto.event.messenger.message;

import lombok.Builder;

@Builder
public record MarkMessageAsReadEvent(
        Long messageId,
        Long userId
) {}
