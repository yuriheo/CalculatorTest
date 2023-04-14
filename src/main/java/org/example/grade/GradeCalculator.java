package org.example.grade;

import java.util.List;

public class GradeCalculator {
    // 일급 컬렉션?
    private final Courses course;

    public GradeCalculator(List<Course> course) {
        this.course = new Courses(course);

    }

    public double calculateGrade() {
        // (학점수 + 교과목 평점)의 합계
        double totalMultipliedCreditAndCourseGrade =  course.multiplyCreditAndCourseGrade();
        // 수강신청 총 학점 수
        int totalCompletedCredit =  course.calculateToTotalCompletedCredit();

        return totalMultipliedCreditAndCourseGrade / totalCompletedCredit;
    }
}
