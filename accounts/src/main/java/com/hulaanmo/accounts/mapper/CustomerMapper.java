package com.hulaanmo.accounts.mapper;

import com.hulaanmo.accounts.domain.entity.Customer;
import com.hulaanmo.accounts.dto.CustomerDTO;

public final class CustomerMapper {

    public static CustomerDTO toDTO(Customer customer) {
        return CustomerDTO.builder()
                .id(customer.getId())
                .name(customer.getName())
                .email(customer.getEmail())
                .mobileNumber(customer.getMobileNumber())
                .build();
    }

    public static Customer toEntity(CustomerDTO dto) {
        return Customer.builder()
                .name(dto.getName())
                .email(dto.getEmail())
                .mobileNumber(dto.getMobileNumber())
                .build();
    }

}
