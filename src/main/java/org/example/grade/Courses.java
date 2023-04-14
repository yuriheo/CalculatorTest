package org.example.grade;

import java.util.List;

public class Courses {
    private final List<Course> course;
    // 여러개의 정보를 가지고 있는 컬렌션?
    public Courses(List<Course> course){
        this.course = course;

    }

    public double multiplyCreditAndCourseGrade() {
        return course.stream()
                .mapToDouble(Course::multiplyCreditAndCourseGrade)
                .sum();


//        // (학점수 + 교과목 평점)의 합계
//        double multipleCreditAndCourseGrade = 0;
//        // 이부분이 잘못되었음? --> 응집도가 약함 --> course에서 수행한다면 아주 좋을 것 같음
//        for(Course course: course){
//            //multipleCreditAndCourseGrade += course.getCredit() * course.getGradeToNumber();
//            //getter 이용하는 방식은 사용하는 곳곳마다 찾아가서 1.0을 더해줘야함
//            multipleCreditAndCourseGrade += course.multiplyCreditAndCourseGrade();
//        }
//        // 이부분이 잘못되었음?
//        return multipleCreditAndCourseGrade;
    }

    public int calculateToTotalCompletedCredit() {
        return course.stream()
                .mapToInt(Course::getCredit)
                .sum();

    }
}
