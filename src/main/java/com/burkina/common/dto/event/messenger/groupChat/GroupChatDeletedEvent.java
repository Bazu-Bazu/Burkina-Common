package com.burkina.common.dto.event.messenger.groupChat;

import lombok.Builder;

@Builder
public record GroupChatDeletedEvent(
        Long chatId
) {}
