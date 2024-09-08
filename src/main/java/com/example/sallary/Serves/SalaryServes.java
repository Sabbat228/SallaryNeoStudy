package com.example.sallary.Serves;

import org.springframework.stereotype.Service;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.YearMonth;
import java.util.HashSet;
import java.util.Set;

@Service
public class SalaryServes {
    public double calculateSalary(double averageSalary, LocalDate startDay, LocalDate endDay){
        int workingDays = calculateWorkingDays(startDay, endDay);
        int monthDays = YearMonth.of(startDay.getYear(),startDay.getMonth()).lengthOfMonth();
        return (averageSalary / monthDays) * workingDays;
    }
    private int calculateWorkingDays(LocalDate start, LocalDate end) {
        int workingDays = 0;

        Set<LocalDate> holidays = new HashSet<>();
        holidays.add(LocalDate.of(2024, 1, 1));//Добавляем все праздники

        for (LocalDate date = start; !date.isAfter(end); date = date.plusDays(1)) {
            if (date.getDayOfWeek() != DayOfWeek.SATURDAY && date.getDayOfWeek() != DayOfWeek.SUNDAY && !holidays.contains(date)) {
                workingDays++;
            }
        }

        return workingDays;
    }
}
