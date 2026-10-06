package com.burkina.common.dto.event.messenger.message;

import com.burkina.common.enums.messenger.ChatType;
import lombok.Builder;

import java.util.Set;

@Builder
public record MessageRemovedEvent(
        Long messageId,
        Long chatId,
        ChatType chatType,
        Set<Long> userIds
) {}
