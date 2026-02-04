package com.hulaanmo.accounts.mapper;

import com.hulaanmo.accounts.domain.entity.Account;
import com.hulaanmo.accounts.dto.AccountDTO;

public final class AccountMapper {

    public static AccountDTO toDTO(Account account) {
        return AccountDTO.builder()
                .id(account.getId())
                .type(account.getType())
                .branchAddress(account.getBranchAddress())
                .build();
    }

    public static Account toEntity(AccountDTO dto) {
        return Account.builder()
                .id(dto.getId())
                .type(dto.getType())
                .branchAddress(dto.getBranchAddress())
                .build();
    }

}
