package org.example.grade;

public class Course {
    private final String subject; // 과목명
    private final int credit; // 학점
    private final String grade; // 성적 (A+, A, B+, B ...)

    public Course(String subject, int credit, String grade) {
        this.subject = subject;
        this.credit = credit;
        this.grade = grade;
    }

    public double multiplyCreditAndCourseGrade() {
        // 해당 부분만 수정해주면 됨
        // 응집도가 높아지기 때문에 수정할때 위의 코드만 수정하면 됨.
        // getter로 정보를 가져와서 처리하지 말고 해당 데이터를 가진 객체에게 메세지를 던져서 작업을 처리해주게 된다면 --> 변화에 유연한 코드를 만들 수 있다.
        return credit * getGradeToNumber();
    }

    public int getCredit() {
        return credit;
    }

    public double getGradeToNumber() {
        double grade = 0;
        switch (this.grade) {
            case "A+":
                grade = 4.5;
                break;
            case "A":
                grade = 4.0;
                break;
            case "B+":
                grade = 3.5;
                break;
            case "B":
                grade = 3.0;
                break;

        }
        return grade;
    }


}
