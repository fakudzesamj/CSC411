/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentPack;

/**
 *
 * @author SSFAKUDZE
 */
public class Student{
    class ITStudent{
        String StudentName;
        int StudentId;
        String Programme;
        String CourCode;
        double Mark;
        public ITStudent(String StudentName, int studentId, String Programme,String CourCode,
        double Mark){
            this.StudentName=StudentName;
            this.StudentId=studentId;
            this.Programme=Programme;
            this.CourCode= CourCode;
        this.Mark= Mark;
        } String getStudentName(){
            return this.StudentName;
        } int getStudentId(){
            return this.StudentId;
        } String getProgramme(){
            return this.Programme;
        }String getCourCode(){
            return this.CourCode;
        }double getMark(){
          return this.Mark;
        }
    }
}
