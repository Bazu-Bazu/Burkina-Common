package com.burkina.common.dto.event.messenger.savedChat;

import lombok.Builder;

@Builder
public record SavedChatDeletedEvent(
        Long chatId
) {}
