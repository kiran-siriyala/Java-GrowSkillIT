package CoreJavaProject1;

interface ProgressTrackable {
    void trackProgress();
}

// Abstract User class
abstract class User {
    private String Username;
    private String Emailid;
    private String Userid;

    public User(String Username, String Emailid, String Userid) {
        this.Username = Username;
        this.Emailid = Emailid;
        this.Userid = Userid;
    }

    public String getUsername() {
        return Username;
    }

    public String getEmailid() {
        return Emailid;
    }

    public String getUserid() {
        return Userid;
    }

    public abstract void viewProfile();

    public final void displayWelcome() {
        System.out.println("Welcome to EduSmart!");
    }
}

// Student class
class Student extends User implements ProgressTrackable {
    private String Course1;
    private String Course2;

    public Student(String Username, String Emailid, String Userid) {
        super(Username, Emailid, Userid);
    }

    public void Course(String courseName) {
        if (Course1 == null) {
            Course1 = courseName;
        } else if (Course2 == null) {
            Course2 = courseName;
        } else {
            System.out.println("Maximum courses enrolled!");
        }
    }

    @Override
    public void viewProfile() {
    	System.out.println("Student Profile:");
        System.out.println("Username: " + getUsername());
        System.out.println("Emailid: " + getEmailid());
        System.out.println("Userid: " + getUserid());
        System.out.println("Courses: " + Course1 + ", " + Course2);
    }

    @Override
    public void trackProgress() {
        System.out.println("Tracking progress...");
    }
}

// Instructor class
class Instructor extends User {
    private String Course1;
    private String Course2;

    public Instructor(String Username, String Emailid, String Userid) {
        super(Username, Emailid, Userid);
    }

    public void createCourse(String courseName) {
        if (Course1 == null) {
            Course1 = courseName;
        } else if (Course2 == null) {
            Course2 = courseName;
        } else {
            System.out.println("Maximum courses created!");
        }
    }

    @Override
    public void viewProfile() {
        System.out.println("Instructor Profile:");
        System.out.println("Name: " + getUsername());
        System.out.println("Email: " + getEmailid());
        System.out.println("User ID: " + getUserid());
        System.out.println("Created Courses: " + Course1 + "," + Course2);
    }
}

// Admin class
class Admin extends User {
    public Admin(String Username, String Emailid, String Userid) {
        super(Username, Emailid, Userid);
    }

    public void removeUser(User Username) {
        System.out.println("Removing user: " + Username.getUsername());
    }

    @Override
    public void viewProfile() {
        System.out.println("Admin Profile:");
        System.out.println("Name: " + getUsername());
        System.out.println("Email: " + getEmailid());
        System.out.println("User ID: " + getUserid());
    }
}

// Course class
class Course {
    private String title;
    private int durationInHours;
    private final int maxStudents;

    public Course(String title, int durationInHours, int maxStudents) {
        this.title = title;
        this.durationInHours = durationInHours;
        this.maxStudents = maxStudents;
    }

    public Course(String title) {
        this(title, 0, 0);
    }

    public void showCourseDetails() {
        System.out.println("Course Title: " + title);
        System.out.println("Duration: " + durationInHours + " hours");
        System.out.println("Max Students: " + maxStudents);
    }
}

public class EduSmart {
    public static void main(String[] args) {
        // Create users
        Student student1 = new Student("Kiran", "kiran@example.com", "S1");
        Student student2 = new Student("Mouli", "mouli@example.com", "S2");
        Instructor instructor1 = new Instructor("Instructor Shiva", "shiva@example.com", "I1");
        Instructor instructor2 = new Instructor("Instructor Kumar ", "kumar@example.com", "I2");
        Admin admin = new Admin("Admin", "admin@example.com", "A1");

        // Create courses
        Course course1 = new Course("Course 1", 15, 20);
        Course course2 = new Course("Course 2", 25, 30);
        instructor1.createCourse("Course 1");
        instructor1.createCourse("Course 2");
        instructor2.createCourse("Course 3");
        instructor2.createCourse("Course 4");

        // Enroll students in courses
        student1.Course("Course 1");
        student1.Course("Course 2");
        student2.Course("Course 3");

        // Display user profiles
        student1.viewProfile();
        student2.viewProfile();
        instructor1.viewProfile();
        instructor2.viewProfile();
        admin.viewProfile();

        // Track progress
        student1.trackProgress();

        // Remove user
        admin.removeUser(student1);

        // Show course details
        course1.showCourseDetails();
        course2.showCourseDetails();
    }
    
}