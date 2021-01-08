package lecture13;

import lombok.extern.slf4j.Slf4j;

@Slf4j

public class Lecture13Main {

    public static void main(String[] args) {
        QualityEngineer qa = new QualityEngineer("Rumy", 15, true);
        BusinessAnalyst ba = new BusinessAnalyst("Elena", 75);
        LeadDeveloper dev = new LeadDeveloper("Galina", 34);

        //Overridden toString method from Employee class
        log.info(qa.toString());
        log.info(ba.toString());

        qa.getSalary(20, 100);
        qa.getSalary(20,100, 500);

        ba.getDailyRate();
        qa.getDailyRate();
        dev.leadProject();
        dev.managePeople();
    }
}
