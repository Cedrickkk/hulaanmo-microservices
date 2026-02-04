package com.hulaanmo.accounts.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public abstract class BaseResponse {
    private int code;
    private String status;
    private String message;
    @Builder.Default
    private Meta meta = new BaseResponse.Meta(Timestamp.from(Instant.now()), UUID.randomUUID().toString());

    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Meta {
        private Timestamp timestamp;
        private String requestId;
    }
}
