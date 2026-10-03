package com.burkina.common.dto.event.messenger.personalChat;

import lombok.Builder;

@Builder
public record PersonalChatCreatedEvent(
        Long chatId,
        Long user1Id,
        Long user2Id
) {}
