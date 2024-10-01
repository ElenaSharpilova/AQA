package hw1;

public class Student implements Printable{
    private String nameStudent;
    private String gradeBook;
    private double mark;

    public void setNameStudent(String nameStudent){
        this.nameStudent=nameStudent;
    }
    public void getNameStudent(String nameStudent){
        this.nameStudent=nameStudent;
    }

    public void setGradeBook(String gradeBook) {
        this.gradeBook=gradeBook;
    }
    public void getGradeBook(String gradeBook){
        this.gradeBook=gradeBook;
    }

    public void setMark(double mark){
        this.mark=mark;
    }
    public void getMark(double mark){
        this.mark=mark;
    }

    @Override
    public void print() {
        System.out.println("Студент: " + this.nameStudent);
        System.out.println("Номер зачетки: " + this.gradeBook);
        System.out.println("Средний бал: " + this.mark);
    }
}
