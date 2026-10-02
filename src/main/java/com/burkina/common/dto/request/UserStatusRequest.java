package com.burkina.common.dto.request;

import java.util.List;

public record UserStatusRequest(
        List<Long> userIds
) {}
