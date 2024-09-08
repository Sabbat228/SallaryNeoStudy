package com.example.sallary;

import com.example.sallary.Serves.SalaryServes;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SallaryApplicationTests {

	private final SalaryServes salaryServes = new SalaryServes();

	@Test
	void contextLoads() {
		double averageSalary = 60000;
		LocalDate startDay = LocalDate.of(2024, 1, 2);
		LocalDate endDay = LocalDate.of(2024, 1, 6);

		double expectedPay = (averageSalary / 30) * 4;
		double actualPay = salaryServes.calculateSalary(averageSalary, startDay, endDay);

		assertEquals(expectedPay, actualPay, 0.01);
	}

	@Test
	public void testCalculateVacationPay_ZeroWorkingDays() {
		double averageSalary = 3000.0;
		LocalDate startDay = LocalDate.of(2024, 1, 6);
		LocalDate endDay = LocalDate.of(2024, 1, 7);

		double expectedPay = (averageSalary / 31) * 0;
		double actualPay = salaryServes.calculateSalary(averageSalary, startDay, endDay);

		assertEquals(expectedPay, actualPay, 0.01);
	}

}
