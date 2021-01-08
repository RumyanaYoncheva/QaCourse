package lecture13;

import lombok.extern.slf4j.Slf4j;

@Slf4j

public class LeadDeveloper extends Employee implements LeadingRole, ProjectManagement{
    private static final String EMPLOYEE_POSITION_NAME = "Lead Software Engineer";
    private static final String EMPLOYEE_DEPARTMENT_NAME = "Development";

    public LeadDeveloper(String name, int employeeId) {
        super(name, employeeId, EMPLOYEE_DEPARTMENT_NAME, EMPLOYEE_POSITION_NAME);
    }

    @Override
    public void managePeople() {
        log.info("DEV should lead, support and manage people in the team");
    }

    @Override
    public void giveFeedback() {
    }

    @Override
    public void leadProject() {
        log.info("Lead DEV is responsible for helping the PM with the project execution");
    }
}
