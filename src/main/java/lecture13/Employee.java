package lecture13;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@AllArgsConstructor
@Getter
@Slf4j

public class Employee {

    private String name;
    private int employeeId;
    private String department;
    private String position;

    protected int calculateEmployeeMonthlySalaryWithBonus(int workedDays, int dailyCrossRate, int monthBonus){
        int calculatedSalary = calculateSalary(workedDays, dailyCrossRate) + monthBonus;
        log.info("The Employee {} has salary {}", name, calculatedSalary);
        return calculatedSalary;
    }

    protected int calculateSalary(int workedDays, int dailyGrossRate){
        return workedDays * dailyGrossRate;
    }

    @Override
    public String toString(){
        return("Employee: " + name + " with ID: " + employeeId + " on position " + position + " in department " + department);
    }

    public int getDailyRate(){
        log.info("Rate: " + 50);
        return 50;
    }
}
