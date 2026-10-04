package com.burkina.common.dto.event.messenger.message;

import lombok.Builder;

@Builder
public record MessageReadEvent(
        Long messageId
) {}
