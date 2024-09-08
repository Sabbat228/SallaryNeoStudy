package com.example.sallary.model;

import java.time.LocalDate;

public class ModellSalary {
    private double averageSalary;
    private int vacationDay;

    private LocalDate startDay;
    private LocalDate endDay;

    public LocalDate getStartDay() {
        return startDay;
    }

    public void setStartDay(LocalDate startDay) {
        this.startDay = startDay;
    }

    public LocalDate getEndDay() {
        return endDay;
    }

    public void setEndDay(LocalDate endDay) {
        this.endDay = endDay;
    }

    public double getAverageSalary() {
        return averageSalary;
    }

    public void setAverageSalary(double averageSalary) {
        this.averageSalary = averageSalary;
    }

    public int getVacationDay() {
        return vacationDay;
    }

    public void setVactionDay(int vacationDay) {
        this.vacationDay = vacationDay;
    }
}
