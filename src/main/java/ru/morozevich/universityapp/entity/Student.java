package ru.morozevich.universityapp.entity;

public class Student implements UniMember, Learner {

    private String name;

    private University university;

    private Professor professor;

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, University university, Professor professor) {
        this(name);
        this.university = university;
        this.professor = professor;
    }

    @Override
    public void attendLectures() {
        System.out.println("Я студент " + name + ", я пришел в " + university.getName() + " на лекцию слушать " + professor.getName() + "а!");
    }

    @Override
    public void visitLibrary() {
        System.out.println("Я студент, я пришел в библиотеку " + university.getName() + " закрывать пробелы!");
    }

    @Override
    public void passExam() {
        System.out.println("Я студент, я сдал экзамен в " + university.getName() + " у " + professor.getName() + "а!");
    }

    ;
}
