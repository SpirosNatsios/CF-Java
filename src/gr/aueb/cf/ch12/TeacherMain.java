package gr.aueb.cf.ch12;

import gr.aueb.cf.ch12.model.Teacher;

/**
 * Client Class that created a {@link Teacher}
 * instance and populates its state
 */
public class TeacherMain {

    public static void main(String[] args) {
        Teacher elon = new Teacher();
        Teacher anna = new Teacher(2, "Anna","G.");

        elon.setId(1);
        elon.setFirstname("Elon");
        elon.setLastname("M.");

        System.out.println("Elon's State");
        System.out.println("ID: " + elon.getId());
        System.out.println("Firstname " + elon.getFirstname());
        System.out.println("Lastname " + elon.getLastname());

        System.out.println("Anna's State");
        System.out.println("ID: " + anna.getId());
        System.out.println("Firstname " + anna.getFirstname());
        System.out.println("Lastname " + anna.getLastname());
    }
}
