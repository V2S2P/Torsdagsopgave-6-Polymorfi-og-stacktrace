package Task3;

import java.util.ArrayList;

public class Student extends Person{
    private ArrayList<String> passedCourses;
    private ArrayList<String> currentCourses;
    public Student(String name, ArrayList<String> passedCourses, ArrayList<String> currentCourses){
        super(name);
        this.passedCourses = passedCourses;
        this.currentCourses = currentCourses;
    }

    public ArrayList<String> getPassedCourses() {
        return passedCourses;
    }

    public void setPassedCourses(ArrayList<String> passedCourses) {
        this.passedCourses = passedCourses;
    }

    public ArrayList<String> getCurrentCourses() {
        return currentCourses;
    }

    public void setCurrentCourses(ArrayList<String> currentCourses) {
        this.currentCourses = currentCourses;
    }
    @Override
    public boolean addCourse(String course){
        if(!passedCourses.contains(course)){
            passedCourses.add(course);
            return true;
        }else {
            return false;
        }
    }
}
