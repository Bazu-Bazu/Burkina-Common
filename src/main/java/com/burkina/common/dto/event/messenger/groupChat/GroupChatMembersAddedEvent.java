package com.burkina.common.dto.event.messenger.groupChat;

import lombok.Builder;

import java.util.List;

@Builder
public record GroupChatMembersAddedEvent(
        Long chatId,
        List<Long> userIds
) {}
