import java.util.Scanner;

public class Student {

  private int rating;
  private String name;
  public static int count;
  public static double summaryRating;
  public static double averageStaticRating;

  public Student(String name) {
    this.name = name;
    count++;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a name of student 1: ");
    String tmp = scanner.nextLine();
    Student student1 = new Student(tmp);
    System.out.print("Enter a name of student 2: ");
    tmp = scanner.nextLine();
    Student student2 = new Student(tmp);
    System.out.print("Enter a name of student 3: ");
    tmp = scanner.nextLine();
    Student student3 = new Student(tmp);
    System.out.println();

    System.out.print("Enter a rating of student 1: ");
    int temp = scanner.nextInt();
    student1.setRating(temp);
    System.out.print("Enter a rating of student 2: ");
    temp = scanner.nextInt();
    student2.setRating(temp);
    System.out.print("Enter a rating of student 3: ");
    temp = scanner.nextInt();
    student3.setRating(temp);
    System.out.println();

    System.out.println("Avg rating = " + getAvgRating() + "\n");

    System.out.print("Enter a new rating of student 1: ");
    temp = scanner.nextInt();
    student1.changeRating(temp);
    System.out.println();

    System.out.println("New avg rating = " + getAvgRating());

  }

  public static double getAvgRating() {
    if (count != 0) {
      averageStaticRating = (summaryRating / count);
      return averageStaticRating;
    }
    return averageStaticRating;

}

  public String getName() {
    return name;
  }

    public void setName(String name) {
    this.name = name;
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
  }

  public static void removeStudent(Student student) {
    student.count = 0;
    student.rating = 0;
    summaryRating = 0;
    averageStaticRating = 0;
  }

  @Override
  public String toString() {
    return getName() + " " + getRating() + " ";
  }
}
