package com.burkina.common.dto.event.messenger.savedChat;

import lombok.Builder;

@Builder
public record SavedChatCreatedEvent(
        Long chatId,
        Long userId
) {}
