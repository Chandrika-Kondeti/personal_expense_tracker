package com.chandrika.personal_expense_tracker.controller;

import com.chandrika.personal_expense_tracker.model.Expense;
import com.chandrika.personal_expense_tracker.repository.ExpenseRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddExpenseController {

    private final ExpenseRepository expenseRepository;

    public AddExpenseController(ExpenseRepository expenseRepository){
        this.expenseRepository=expenseRepository;
    }

    @PostMapping("/add")
    public ResponseEntity<Expense> addExpense(@RequestBody Expense expense){
        Expense saveExpense = expenseRepository.save(expense);
        return new ResponseEntity<>(saveExpense, HttpStatus.CREATED);
    }

}
