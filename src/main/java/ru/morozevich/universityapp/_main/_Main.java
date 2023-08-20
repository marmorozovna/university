package ru.morozevich.universityapp._main;

import ru.morozevich.universityapp.entity.Professor;
import ru.morozevich.universityapp.entity.Student;
import ru.morozevich.universityapp.entity.University;
import ru.morozevich.universityapp.util.LearnerExecutor;
import ru.morozevich.universityapp.util.LecturerExecutor;
import ru.morozevich.universityapp.util.UniMemberExecutor;

public class _Main {
    public static void main(String[] args) {

        UniMemberExecutor uniMemberExecutor = new UniMemberExecutor();
        LecturerExecutor lecturerExecutor = new LecturerExecutor();
        LearnerExecutor learnerExecutor = new LearnerExecutor();

        University university = new University("СПБГУ");
        Student student = new Student("Петров", university);
        Professor professor = new Professor("Лавочкин", university, student);
        student.setProfessor(professor);

        uniMemberExecutor.makeAttendLectures(student);
        uniMemberExecutor.makeAttendLectures(professor);
        uniMemberExecutor.makeVisitLibrary(student);
        uniMemberExecutor.makeVisitLibrary(professor);
        lecturerExecutor.makeTakeExam(professor);
        learnerExecutor.makePassExam(student);
    }
}