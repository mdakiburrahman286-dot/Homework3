class Line {

    private Task1 p1;
    private Task1 p2;

    // Default constructor
    public Line() {
        this.p1 = new Task1(0, 0);
        this.p2 = new Task1(0, 0);
    }

    // Parameterized constructor
    public Line(Task1 p1, Task1 p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    // Getters
    public Task1 getP1() {
        return p1;
    }

    public Task1 getP2() {
        return p2;
    }

    // Setters
    public void setP1(Task1 p1) {
        this.p1 = p1;
    }

    public void setP2(Task1 p2) {
        this.p2 = p2;
    }

    // Convert line to string
    @Override
    public String toString() {
        return "Line: " + p1.toString() + " -> " + p2.toString();
    }

    // Calculate line length
    public double length() {
        return p1.distance(p2);
    }
}

// Main class
public class Task2 {

    public static void main(String[] args) {

        Task1 p1 = new Task1(2, 3);
        Task1 p2 = new Task1(6, 6);

        Line line = new Line(p1, p2);

        System.out.println(line);
        System.out.println("Line length: " + line.length());

        line.setP1(new Task1(1, 1));
        line.setP2(new Task1(4, 5));

        System.out.println("After setters:");
        System.out.println(line);
        System.out.println("New line length: " + line.length());

        Line line2 = new Line();

        System.out.println("Default line: " + line2);
        System.out.println("Default line length: " + line2.length());
    }
}