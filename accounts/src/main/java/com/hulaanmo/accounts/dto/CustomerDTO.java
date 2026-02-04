package com.hulaanmo.accounts.dto;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDTO {

    private Long id;

    private String name;

    private String email;

    private String mobileNumber;

}
