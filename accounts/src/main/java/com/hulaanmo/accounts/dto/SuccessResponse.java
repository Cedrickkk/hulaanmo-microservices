package com.hulaanmo.accounts.dto;


import lombok.*;
import lombok.experimental.SuperBuilder;
import org.springframework.http.HttpStatus;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class SuccessResponse<T> extends BaseResponse {
    private T data;

    public static <T> SuccessResponse<T> ok(T data, String message) {
        return SuccessResponse.<T>builder()
                .code(HttpStatus.OK.value())
                .status(HttpStatus.OK.getReasonPhrase())
                .message(message)
                .data(data)
                .build();
    }

}
