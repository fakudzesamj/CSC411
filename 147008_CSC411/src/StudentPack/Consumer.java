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
import javax.xml.parsers.DocumentBuilderFactory;  
import javax.xml.parsers.DocumentBuilder;  
import org.w3c.dom.Document;  
import org.w3c.dom.NodeList;  
import org.w3c.dom.Node;  
import org.w3c.dom.Element;  
import java.io.File;  
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class Consumer  
{  
public static void main(String argv[])   
{
    File file = null;
    File folder = new File("src//myxml//");
File[] listOfFiles = folder.listFiles();
ArrayList<ITStudent> studentlist = new ArrayList<ITStudent>();
try {  
for (int i = 0; i < listOfFiles.length; i++) {
    String Filename=listOfFiles[i].getName();
    int s=Filename.length();
  if (listOfFiles[i].isFile()&&Filename.substring(s-4, s).matches(".xml")) {

//creating a constructor of file class and parsing an XML file  
 file = new File("src//myxml//"+listOfFiles[i].getName());  
//an instance of factory that gives a document builder  
DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();  
//an instance of builder to parse the specified xml file  
DocumentBuilder db = dbf.newDocumentBuilder();  
Document doc = db.parse(file);  
doc.getDocumentElement().normalize();  
//System.out.println("Root element: " + doc.getDocumentElement().getNodeName());  
NodeList nodeList = doc.getElementsByTagName("ITStudent");  
// nodeList is not iterable, so we are using for loop  
for (int itr = 0; itr < nodeList.getLength(); itr++)   
{  
Node node = nodeList.item(itr);  
//System.out.println("\nNode Name :" + node.getNodeName());  
if (node.getNodeType() == Node.ELEMENT_NODE)   
{  
Element eElement = (Element) node;  
int stuId=Integer.parseInt(eElement.getElementsByTagName("StudentId").item(0).getTextContent());
String StudentName=eElement.getElementsByTagName("StudentName").item(0).getTextContent();
String Programme=eElement.getElementsByTagName("StudentProgramme").item(0).getTextContent();
String CourCode=eElement.getElementsByTagName("StudentCourCode").item(0).getTextContent();
int mark=Integer.parseInt(eElement.getElementsByTagName("StudentMark").item(0).getTextContent());

//System.out.println("Student id: "+ stuId);  
//System.out.println("Student Name: "+ StudentName); 
//System.out.println("Programme: "+ Programme);  
//System.out.println("Subject: "+ CourCode);  
//System.out.println("Marks: "+ mark);  
ITStudent student;
    student = new ITStudent(StudentName,stuId,Programme,CourCode, mark);
studentlist.add(student);

//System.err.println(student.StudentId); 
}  
}  
} 
file.delete();
}
}catch (Exception e)   
{  
e.printStackTrace();  
} 
   Collections.sort(studentlist,ITStudent.StudentNumberComparator);   
  int stunum=0;
String comment;
   for(ITStudent str: studentlist){
  if(stunum!=str.StudentId){
 System.out.println("___________________________________________________________________________");
 System.out.println("Student id: "+ str.StudentId+"\t\t Student Name: "+str.StudentName); 
 System.out.println("___________________________________________________________________________");
 System.out.println("Programme: "+ str.Programme);
 System.out.println("___________________________________________________________________________");
 System.out.println("Courcode\tMark\t\t\tComments ");
 System.out.println("___________________________________________________________________________");
  }
  if(str.Mark<50){
     comment="Failed"; 
  }else{
       comment="Passed"; 
  }
  
   System.out.println( str.CourCode+"\t\t"+str.Mark+"\t\t\t"+comment);
 System.out.println("----------------------------------------------------------------------------");
  stunum=str.StudentId;
    }
}
 static class ITStudent{
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
 public static Comparator<ITStudent> StudentNumberComparator = new Comparator<ITStudent>() {

	public int compare(ITStudent s1, ITStudent s2) {

	   int rollno1 = s1.StudentId;
	   int rollno2 = s2.StudentId;

	   /*For ascending order*/
	   return rollno1-rollno2;
    }
};
 }
    }
