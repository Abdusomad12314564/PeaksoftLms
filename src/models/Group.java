package models;

import java.util.List;

public class Group {
    private String name;
    private String descriptions;
    private List<Student> students;
    private List<Lesson>lessons;

    public Group(String name, String descriptions, List<Student> students, List<Lesson> lessons) {
        this.name = name;
        this.descriptions = descriptions;
        this.students = students;
        this.lessons = lessons;
    }

    public Group(String name, String descriptions) {
        this.name = name;
        this.descriptions = descriptions;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public List<Lesson> getLessons() {
        return lessons;
    }

    public void setLessons(List<Lesson> lessons) {
        this.lessons = lessons;
    }

    @Override
    public String toString() {
        return  "| Group"+
                "| name  :  " + name +
                "| descriptions :  " + descriptions +
                "|  student: " + students +
                "|  lessons :" + lessons;
    }
}