package com.burkina.common.dto.event.messenger.message;

import com.burkina.common.enums.messenger.ChatType;
import com.burkina.common.enums.messenger.MessageType;
import lombok.Builder;

@Builder
public record SendMessageEvent(
        String text,
        MessageType messageType,
        Long mediaId,
        Long chatId,
        ChatType chatType,
        Long userId
) {}
