package com.chandrika.personal_expense_tracker.controller;

import com.chandrika.personal_expense_tracker.model.Expense;
import com.chandrika.personal_expense_tracker.repository.ExpenseRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ExpenseController {

    private ExpenseRepository expenseRepository;

    ExpenseController(ExpenseRepository expenseRepository){
        this.expenseRepository=expenseRepository;
    }
    @GetMapping("/expenses")
    public List<Expense> getAllExpense(){
        return expenseRepository.findAll();
    }

}
