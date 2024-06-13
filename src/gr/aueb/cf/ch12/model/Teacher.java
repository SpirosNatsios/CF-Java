package gr.aueb.cf.ch12.model;

import gr.aueb.cf.ch12.model.Point;

/**
 * POJO - Java Bean
 */
public class Teacher {
    private int id;
    private String firstname;
    private String lastname;

    public Teacher(){}

    public Teacher(int id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    /**
     * Driver class.
     */
    public static class PointMain {

        public static void main(String[] args) {

            Point p1 = new Point(1, 2);
            Point p2 = new Point(11, 0);

            System.out.println("Point1 State");
            System.out.println("X: " + p1.getX());
            System.out.println("Y: " + p1.getY());

            System.out.println("Point2 State");
            System.out.println("X: " + p2.getX());
            System.out.println("Y: " + p2.getY());

            System.out.println("Total count of created points: " + Point.getNoOfPoints());
        }
    }
}

