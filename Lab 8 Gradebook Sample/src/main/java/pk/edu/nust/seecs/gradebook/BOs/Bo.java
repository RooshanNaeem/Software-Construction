/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pk.edu.nust.seecs.gradebook.BOs;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import pk.edu.nust.seecs.gradebook.dao.CloDao;
import pk.edu.nust.seecs.gradebook.dao.ContentDao;
import pk.edu.nust.seecs.gradebook.dao.CourseDao;
import pk.edu.nust.seecs.gradebook.dao.GradeDao;
import pk.edu.nust.seecs.gradebook.dao.StudentDao;
import pk.edu.nust.seecs.gradebook.dao.TeacherDao;
import pk.edu.nust.seecs.gradebook.entity.Clo;
import pk.edu.nust.seecs.gradebook.entity.Content;
import pk.edu.nust.seecs.gradebook.entity.Course;
import pk.edu.nust.seecs.gradebook.entity.Grade;
import pk.edu.nust.seecs.gradebook.entity.Student;
import pk.edu.nust.seecs.gradebook.entity.Teacher;

/**
 *
 * @author roosh
 */
public class Bo {
    @Autowired
    private CloDao clo;
    private ContentDao content;
    private CourseDao course;
    private GradeDao grade;
    private StudentDao student;
    private TeacherDao teacher;
    
    private String name;
    
    public String getName(){
        return name;
    }
    public void setName(String n){
        this.name=n;
    }
    public CloDao getClo() {
        return clo;
    }

    public void setClo(CloDao clo) {
        this.clo = clo;
    }

    public ContentDao getContent() {
        return content;
    }

    public void setContent(ContentDao content) {
        this.content = content;
    }

    public CourseDao getCourse() {
        return course;
    }

    public void setCourse(CourseDao course) {
        this.course = course;
    }

    public GradeDao getGrade() {
        return grade;
    }

    public void setGrade(GradeDao grade) {
        this.grade = grade;
    }

    public StudentDao getStudent() {
        return student;
    }

    public void setStudent(StudentDao student) {
        this.student = student;
    }

    public TeacherDao getTeacher() {
        return teacher;
    }

    public void setTeacher(TeacherDao teacher) {
        this.teacher = teacher;
    }
    
    
    
    public void updateClo(Clo clo1){
    
    clo.updateClo(clo1);
    }
    public void addClo(Clo clo1){
    clo.addClo(clo1);
    }
    public void updateContent(Content c){
    content.updateContent(c);
    }
    public void addContent(Content c){
    content.addContent(c);
    }
    public void updateCourse(Course c){
    course.updateCourse(c);
    }
    public void addCourse(Course c){
    course.addCourse(c);
    }
    public void updateGrade(Grade g){
    grade.updateGrade(g);
    }
    public void addGrade(Grade g){
    grade.addGrade(g);
    }
    public void updateStudent(Student s){
    student.updateStudent(s);
    }
    public void addStudent(Student s){
    student.addStudent(s);
    }
    public void updateTeacher(Teacher t){
    teacher.updateTeacher(t);
    }
    public void addTeacher(Teacher t){
    teacher.addTeacher(t);
    }
    
    public String getClocsv(){
    
    List<Clo> clos = clo.getAllClos();
    String header ="CloId,name,description,Plo,btLevel\n";
    String body = "";
    
    for(Clo clo: clos){
        body += clo.csv() + "\n";
        System.out.print(body);
        
    }
    
    return (header+body).trim();
    
    }
    
    
}
