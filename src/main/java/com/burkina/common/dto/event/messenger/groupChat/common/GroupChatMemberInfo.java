package com.burkina.common.dto.event.messenger.groupChat.common;

import lombok.Builder;

@Builder
public record GroupChatMemberInfo(
        Long userId,
        Boolean canSendMessage
) {}