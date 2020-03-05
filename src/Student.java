import java.util.Scanner;

public class Student {
  private int rating;
  private String name;
  public static int count;
  public static double summaryRating;
  public static double averageStaticRating;

  // TODO implement Student class according to the instructions provided in the README.md file

  public Student(String name) {
    this.name = name;
    count++;
  }

  public Student() {
    count++;
  }

  public static void main(String[] args) {
    Student student1 = new Student("Petro");
    Student student2 = new Student("Volodymyr");

    student1.setRating(15);
    student2.setRating(30);
    Scanner scanner = new Scanner(System.in);

    System.out.println("Please provide info about student1: " + student1.getName() + " Rating: " + student1.getRating());
    double avr1 = scanner.nextDouble();

    System.out.println("Please provide info about" + student2 + " Rating ");
    double avr2 = scanner.nextDouble();

    double avRating = ((avr1 + avr2) / 2);
    System.out.println("Current average rating is:" + ((avr1 + avr2) / 2));

  }

  public static double getAvgRating() {
    if (count != 0) {
      averageStaticRating = (summaryRating / count);
      return averageStaticRating;
    }
    return averageStaticRating;

  // TODO return average rating of all students
}

  public String getName() {
    return name;
  }

    public void setName(String name) {
    this.name = name; // TODO set student's name
  }

  public int getRating() {
    return rating;
  }

  public int setRating(int rating) {
    this.rating = rating;
    summaryRating += this.rating;
    return rating;
  }

  public boolean betterStudent(Student student) {
    // TODO return the result of comparing this.student's rating with the student's rating
    if (this.rating > student.rating) {
      return true;
    }
      else {
        return false;
      }
  }

  public void changeRating(int rating) {
    summaryRating -= this.rating;
    this.rating = setRating(rating);
    // TODO change this student's rating and average rating of all students
  }

  public static void removeStudent(Student student) {
    student.count = 0;
    student.rating = 0;
    summaryRating = 0;
    averageStaticRating = 0;
    // TODO remove student
  }

  @Override
  public String toString() {
    return getName() + " " + getRating() + " ";
    // TODO return String with name and rating of this student
  }
}
