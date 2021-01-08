package lecture13;

import lombok.extern.slf4j.Slf4j;

@Slf4j

public class BusinessAnalyst extends Employee{

    private static final String EMPLOYEE_POSITION_NAME = "Business Analyst";
    private static final String EMPLOYEE_DEPARTMENT_NAME = "Business Analysis & Calculation";

    public BusinessAnalyst(String name, int employeeId) {
        super(name, employeeId, EMPLOYEE_DEPARTMENT_NAME, EMPLOYEE_POSITION_NAME);
    }

    @Override
    public int getDailyRate() {
        log.info("Business Analyst Rate: " + 70);
        return 70;
    }
}
