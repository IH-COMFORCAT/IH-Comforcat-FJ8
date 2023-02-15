package com.ironhack.netflix.services.impl.interfaces;

import com.ironhack.netflix.models.*;

public interface AccountServiceInterface {

    Account addAccount(Account account);
    Account getAccountById(Long id);
}
