package Task3;

import java.util.ArrayList;

public class Teacher extends Person{
    private ArrayList<String> canTeach;
    private ArrayList<String> currentCourses;
    public Teacher(String name,ArrayList<String> canTeach,ArrayList<String> currentCourses){
        super(name);
        this.canTeach = canTeach;
        this.currentCourses = currentCourses;
    }

    public ArrayList<String> getCanTeach() {
        return canTeach;
    }

    public void setCanTeach(ArrayList<String> canTeach) {
        this.canTeach = canTeach;
    }

    public ArrayList<String> getCurrentCourses() {
        return currentCourses;
    }

    public void setCurrentCourses(ArrayList<String> currentCourses) {
        this.currentCourses = currentCourses;
    }
    @Override
    public boolean addCourse(String course){
        if (canTeach.contains(course)){
            currentCourses.add(course);
            return true;
        }else {
            return false;
        }
    }
}
