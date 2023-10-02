package com.eugene.etranzacttest.repo;

import com.eugene.etranzacttest.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account,Long> {
}
