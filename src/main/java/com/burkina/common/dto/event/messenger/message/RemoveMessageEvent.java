package com.burkina.common.dto.event.messenger.message;

import lombok.Builder;

@Builder
public record RemoveMessageEvent(
        Long messageId,
        Long userId
) {}
