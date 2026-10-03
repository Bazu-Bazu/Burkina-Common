package com.burkina.common.dto.event.messenger.groupChat;

import lombok.Builder;

import java.util.List;

@Builder
public record GroupChatCreatedEvent(
        Long chatId,
        String name,
        Long avatarId,
        List<Long> userIds
) {}
