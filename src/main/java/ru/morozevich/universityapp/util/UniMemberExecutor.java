package ru.morozevich.universityapp.util;

import ru.morozevich.universityapp.entity.UniMember;

public class UniMemberExecutor {

    public void makeAttendLectures (UniMember uniMember) {
        uniMember.attendLectures();
    }

    public void makeVisitLibrary (UniMember uniMember) {
        uniMember.visitLibrary();
    }

}
