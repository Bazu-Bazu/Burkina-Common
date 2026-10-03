package com.burkina.common.dto.event.messenger.personalChat;

import lombok.Builder;

@Builder
public record PersonalChatDeletedEvent(
        Long chatId
) {}
