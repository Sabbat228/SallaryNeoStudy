package com.example.sallary.controller;

import com.example.sallary.Serves.SalaryServes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;

@Controller
@RequestMapping("/calculate")
public class ControllerSalary {
    @Autowired
    private SalaryServes salaryServes;

    @GetMapping
    public double calculate(@RequestParam double averageSalary, @RequestParam LocalDate startDay, @RequestParam LocalDate endDay){
        return salaryServes.calculateSalary(averageSalary, startDay, endDay);
    }
}
