package com.burkina.common.dto.event.messenger.message;

import com.burkina.common.enums.messenger.ChatType;
import com.burkina.common.enums.messenger.MessageType;
import lombok.Builder;

import java.time.Instant;
import java.util.Set;

@Builder
public record MessageSentEvent(
        Long messageId,
        String text,
        MessageType messageType,
        Instant createdAt,
        Long mediaId,
        Long chatId,
        ChatType chatType,
        Long userId,
        Set<Long> userIds
) {}
