package com.example.demo.service;


import com.example.demo.model.Account;

import java.util.Collection;

/**
 * Created by christospapidas on 24012016--.
 */
public interface AccountService {

    Collection<Account> findAll();

    Account findByUsername(String userename);

    Account createNewAccount(Account account);


}
