package coms;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        Nurse nurse = (Nurse) context.getBean("nurse");
        Doctor doctor = context.getBean(Doctor.class);
        doctor.assist();
        nurse.assist();

        System.out.println("The Doctor's qualification is " + doctor.getQualification());

        Staff staff1 = context.getBean(Doctor.class);
        Staff staff2 = context.getBean(Nurse.class);
        staff1.assist();
        staff2.assist();



    }
}