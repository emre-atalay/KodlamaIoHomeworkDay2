public class Course {
    public Course () {
        System.out.println("Course object is created");
    }

    public Course(String teacher, String courseName, String detailOfCourse, double rate, String situation) {
        System.out.println("Course object is created erhan");
        this.teacher = teacher;
        this.courseName = courseName;
        this.detailOfCourse = detailOfCourse;
        this.rate = rate;
        this.situation = situation;
    }
    public String teacher;
    public String courseName;
    public String detailOfCourse;
    public double rate;
    public String situation;



}
