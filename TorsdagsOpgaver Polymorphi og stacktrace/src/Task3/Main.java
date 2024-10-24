package Task3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> studentPassedCourses1 = new ArrayList<>();
        //studentPassedCourses1.add("Java 1.0");
        ArrayList<String> studentCurrentCourses1 = new ArrayList<>();

        ArrayList<String> studentPassedCourses2  = new ArrayList<>();
        ArrayList<String> studentCurrentCourses2 = new ArrayList<>();

        Student student1 = new Student("Small Hank", studentPassedCourses1, studentCurrentCourses1);
        Student student2 = new Student("Tiny Tim", studentPassedCourses2, studentCurrentCourses2);

        ArrayList<String> teacherCanTeach1 = new ArrayList<>();
        teacherCanTeach1.add("Math");
        teacherCanTeach1.add("Science");
        teacherCanTeach1.add("Java 1.0");
        ArrayList<String> teacherCurrentCourses1 = new ArrayList<>();

        ArrayList<String> teacherCanTeach2 = new ArrayList<>();
        teacherCanTeach2.add("History");
        teacherCanTeach2.add("Geography");
        ArrayList<String> teacherCurrentCourses2 = new ArrayList<>();

        Teacher teacher1 = new Teacher("Big Hank", teacherCanTeach1, teacherCurrentCourses1);
        Teacher teacher2 = new Teacher("Smith", teacherCanTeach2, teacherCurrentCourses2);

        ArrayList<Person> persons = new ArrayList<>();
        persons.add(student1);
        persons.add(student2);
        persons.add(teacher1);
        persons.add(teacher2);

        for (Person person: persons){
            boolean added = person.addCourse("Java 1.0");
            if (!added){
                if (person instanceof Student) {
                    System.out.println(person.getName() + " already passed this course");
                } else if (person instanceof Teacher) {
                    System.out.println(person.getName() + " can not teach this subject");
                }
            }
        }
    }
}
