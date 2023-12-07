/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libraryapp;

import java.util.Date;


public class Loan {
    private Book book;
    private Student student;
    private Date dueDate;

    public Loan(Book book, Student student, Date dueDate) {
        this.book = book;
        this.student = student;
        this.dueDate = dueDate;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public String getInfo() {
        return "Book: " + book.getTitle() + "\nStudent: " + student.getName() + "\nDue Date: " + dueDate.toString();
    }
    
    public boolean isOverdue() {
        Date currentDate = new Date();
        return currentDate.after(dueDate);
    }

}
