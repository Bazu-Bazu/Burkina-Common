package com.burkina.common.dto.event.messenger.groupChat;

import com.burkina.common.dto.event.messenger.groupChat.common.GroupChatMemberInfo;
import lombok.Builder;

import java.util.List;

@Builder
public record GroupChatMembersAddedEvent(
        Long chatId,
        List<GroupChatMemberInfo> members
) {}
