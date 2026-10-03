package com.burkina.common.dto.event.messenger.groupChat;

import lombok.Builder;

import java.util.List;

@Builder
public record GroupChatMembersDeletedEvent(
        Long chatId,
        List<Long> userIds
) {}
