package com.chandrika.personal_expense_tracker.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Expense {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NotNull(message = "Title is required")
    private String title;
    @NotNull(message = "amount is required")
    @Min(value=1, message = "Amount must be atleast 1")
    private double amount;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate date;
    @NotNull(message = "Category is required")
    @Enumerated(EnumType.STRING)
    private Category category;
    @NotNull(message = "Description is required")
    private String description;

    public enum Category {
        FOOD, TRANSPORT, ENTERTAINMENT, UTILITIES, HEALTH, OTHERS;
    }

}
