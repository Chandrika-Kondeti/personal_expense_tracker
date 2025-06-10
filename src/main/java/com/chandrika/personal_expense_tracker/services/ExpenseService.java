package com.chandrika.personal_expense_tracker.services;

import com.chandrika.personal_expense_tracker.repository.ExpenseRepository;
import org.springframework.stereotype.Service;

@Service
public class ExpenseService {
    private ExpenseRepository repo;

    ExpenseService(ExpenseRepository erepo){
        this.repo = erepo;
    }
}
