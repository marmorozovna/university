package ru.morozevich.universityapp.entity;

public class Professor implements UniMember, Lecturer {

    private String name;
    private Student student;
    private University university;

    public Professor() {
    }

    public Professor(String name) {
        this.name = name;
    }

    public Professor(String name, University university, Student student) {
        this(name);
        this.university = university;
        this.student = student;
    }

    @Override
    public void attendLectures() {
        System.out.println("Я профессор " + name + ", я пришел в " + university.getName() + " на лекцию преподавать!");
    }

    @Override
    public void visitLibrary() {
        System.out.println("Я профессор " + name + ", я пришел в библиотеку " + university.getName() + " писать научную работу!");
    }

    @Override
    public void takeExam() {
        System.out.println("Я профессор " + name + ", я принимаю экзамен в " + university.getName() + " у " + student.getName() + "а!");
    }

    public String getName() {
        return name;
    }

}
