package lecture13;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Slf4j

public class QualityEngineer extends Employee {

    private static final String EMPLOYEE_POSITION_NAME = "Quality Assurance Engineer";
    private static final String EMPLOYEE_DEPARTMENT_NAME = "Quality Assurance";

    @Getter
    private boolean isTestAutomationExpert;

    public QualityEngineer(String name, int employeeId) {
        super(name, employeeId, EMPLOYEE_DEPARTMENT_NAME, EMPLOYEE_POSITION_NAME);
    }

    public QualityEngineer(String name, int employeeId, boolean isTestAutomationExpert) {
        super(name, employeeId, EMPLOYEE_DEPARTMENT_NAME, EMPLOYEE_POSITION_NAME);
        this.isTestAutomationExpert = isTestAutomationExpert;
    }

    public int getSalary(int workedDays, int dailyCrossRate, int bonus){
        return calculateEmployeeMonthlySalaryWithBonus(workedDays, dailyCrossRate, bonus);
    }

    public int getSalary(int workedDays, int dailyCrossRate){
        return super.calculateEmployeeMonthlySalaryWithBonus(workedDays, dailyCrossRate, 2000);
    }

    //call the method from parent class with the keyword super but change the bonus
    protected int calculateEmployeeMonthlySalaryWithBonus(int workedDays, int dailyCrossRate, int bonus) {
//        return super.calculateEmployeeSalaryWithBonus(workedDays, dailyCrossRate, bonus);
        log.info("Salary is: " + 3500);
        return 3500;
    }
}
