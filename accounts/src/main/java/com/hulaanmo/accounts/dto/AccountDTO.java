package com.hulaanmo.accounts.dto;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AccountDTO {

    private Long id;

    private String type;

    private String branchAddress;

}
