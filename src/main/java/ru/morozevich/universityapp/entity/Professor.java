package ru.morozevich.universityapp.entity;

public class Professor implements UniMember, Tutor {

    private String name;
    private int age;

    private University university;

    public Professor() {
    }

    public Professor(String name) {
        this.name = name;
    }

    public Professor(String name, University university) {
        this(name);
        this.university = university;
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
        System.out.println("Я профессор " + name + ", я принимаю экзамен в " + university.getName() + "!");
    }

    public String getName() {
        return name;
    }
}
