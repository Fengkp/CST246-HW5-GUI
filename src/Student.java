
public class Student {
    private String name;
    private int id;
    private double gpa;
    private String major;

    public Student(String n, int i, double g, String m) {
        name = n;
        id = i;
        gpa = g;
        major = m;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String toString() {
        return name;
    }

    public String display() {
        return name + ", " + id + ", " + gpa + ", " + major;
    }
}
