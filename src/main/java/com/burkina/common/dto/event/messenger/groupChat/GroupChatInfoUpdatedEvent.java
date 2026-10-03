package com.burkina.common.dto.event.messenger.groupChat;

import lombok.Builder;

@Builder
public record GroupChatInfoUpdatedEvent(
        Long chatId,
        String name,
        Long avatarId
) {}
