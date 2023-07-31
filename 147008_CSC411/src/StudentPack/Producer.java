/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentPack;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 *
 * @author SSFAKUDZE
 */
public class Producer {

    static String xmlFilePath = "src//myxml//";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] name = {"MICHAEL", "JAMES", "JOHN", "ROBERT", "DAVID", "WILLIAM",
            "MARY", "CHRISTOPHER", "JOSEPH", "RICHARD", "DANIEL", "THOMAS",
            "MATTHEW", "JENNIFER", "CHARLES", "ANTHONY",            "PATRICIA", "LINDA", "MARK", "ELIZABETH",
            "JOSHUA", "STEVEN", "ANDREW",
            "KEVIN",
            "BRIAN",
            "BARBARA",
            "JESSICA",
            "JASON",
            "SUSAN",
            "TIMOTHY",
            "PAUL",
            "KENNETH",
            "LISA",
            "RYAN",
            "SARAH",
            "KAREN",
            "JEFFREY",
            "DONALD",
            "ASHLEY",
            "ERIC",
            "JACOB",
            "NICHOLAS",
            "JONATHAN",
            "RONALD",
            "MICHELLE",
            "KIMBERLY",
            "NANCY",
            "JUSTIN",
            "SANDRA",
            "AMANDA",
            "BRANDON",
            "STEPHANIE",
            "EMILY",
            "MELISSA",
            "GARY",
            "EDWARD",
            "STEPHEN",
            "SCOTT",
            "GEORGE",
            "DONNA",
            "JOSE",
            "REBECCA",
            "DEBORAH",
            "LAURA",
            "CYNTHIA",
            "CAROL",
            "AMY",
            "MARGARET",
            "GREGORY",
            "SHARON",
            "LARRY",
            "ANGELA",
            "MARIA",
            "ALEXANDER",
            "BENJAMIN",
            "NICOLE",
            "KATHLEEN",
            "PATRICK",
            "SAMANTHA",
            "TYLER",
            "SAMUEL",
            "BETTY",
            "BRENDA",
            "PAMELA",
            "AARON",
            "KELLY",
            "HEATHER",
            "RACHEL",
            "ADAM",
            "CHRISTINE",
            "ZACHARY",
            "DEBRA",
            "KATHERINE",
            "DENNIS",
            "NATHAN",
            "CHRISTINA",
            "JULIE",
            "JORDAN",
            "KYLE",
            "ANNA"};
        String[] Surname = {"SMITH",
            "JOHNSON",
            "WILLIAMS",
            "BROWN",
            "JONES",
            "GARCIA",
            "RODRIGUEZ",
            "MILLER",
            "MARTINEZ",
            "DAVIS",
            "HERNANDEZ",
            "LOPEZ",
            "GONZALEZ",
            "WILSON",
            "ANDERSON",
            "THOMAS",
            "TAYLOR",
            "LEE",
            "MOORE",
            "JACKSON",
            "PEREZ",
            "MARTIN",
            "THOMPSON",
            "WHITE",
            "SANCHEZ",
            "HARRIS",
            "RAMIREZ",
            "CLARK",
            "LEWIS",
            "ROBINSON",
            "WALKER",
            "YOUNG",
            "HALL",
            "ALLEN",
            "TORRES",
            "NGUYEN",
            "WRIGHT",
            "FLORES",
            "KING",
            "SCOTT",
            "RIVERA",
            "GREEN",
            "HILL",
            "ADAMS",
            "BAKER",
            "NELSON",
            "MITCHELL",
            "CAMPBELL",
            "GOMEZ",
            "CARTER",
            "ROBERTS",
            "DIAZ",
            "PHILLIPS",
            "EVANS",
            "TURNER",
            "REYES",
            "CRUZ",
            "PARKER",
            "EDWARDS",
            "COLLINS",
            "STEWART",
            "MORRIS",
            "MORALES",
            "ORTIZ",
            "GUTIERREZ",
            "MURPHY",
            "ROGERS",
            "COOK",
            "KIM",
            "MORGAN",
            "COOPER",
            "RAMOS",
            "PETERSON",
            "GONZALES",
            "BELL",
            "REED",
            "BAILEY",
            "CHAVEZ",
            "KELLY",
            "HOWARD",
            "RICHARDSON",
            "WARD",
            "COX",
            "RUIZ",
            "BROOKS",
            "WATSON",
            "WOOD",
            "JAMES",
            "MENDOZA",
            "GRAY",
            "BENNETT",
            "ALVAREZ",
            "CASTILLO",
            "PRICE",
            "HUGHES",
            "VASQUEZ",
            "SANDERS",
            "JIMENEZ",
            "LONG",
            "FOSTER"};

        for (int i = 1; i <= 10; i++) {
            try {

                DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();

                DocumentBuilder documentBuilder = documentFactory.newDocumentBuilder();

                Document document = documentBuilder.newDocument();

                // root element
                Element root = document.createElement("class");
                document.appendChild(root);
 String[][] ss= PrintMarks((int) (Math.random() * 100000000),name[(int) (Math.random() * 100)]+" "+
         Surname[(int) (Math.random() * 100)],"Bsc IT");
                // employee element
               for (int v=0; v<10;v++){
                Element student = document.createElement("ITStudent");

                root.appendChild(student);

                // set an attribute to staff element
                // Attr attr = document.createAttribute("StudentId");
                //attr.setValue("10");
                //student.setAttributeNode(attr);
                //you can also use staff.setAttribute("id", "1") for this
                Element StudentId = document.createElement("StudentId");
                StudentId.appendChild(document.createTextNode(ss[v][0]));
                student.appendChild(StudentId);

                // firstname element
                Element firstName = document.createElement("StudentName");
                firstName.appendChild(document.createTextNode(ss[v][1]));
                student.appendChild(firstName);

                // lastname element
                Element programme = document.createElement("StudentProgramme");
                programme.appendChild(document.createTextNode(ss[v][2]));
                student.appendChild(programme);

                // email element
                Element CourCode = document.createElement("StudentCourCode");
                CourCode.appendChild(document.createTextNode(ss[v][3]));
                student.appendChild(CourCode);

                // department elements
                Element StudentMark = document.createElement("StudentMark");
                StudentMark.appendChild(document.createTextNode(ss[v][4]));
                student.appendChild(StudentMark);
               }
                // create the xml file
                //transform the DOM Object to an XML File
                TransformerFactory transformerFactory = TransformerFactory.newInstance();
                Transformer transformer = transformerFactory.newTransformer();
                DOMSource domSource = new DOMSource(document);
                StreamResult streamResult = new StreamResult(new File(xmlFilePath + "Student" + i + ".xml"));

                // If you use
                // StreamResult result = new StreamResult(System.out);
                // the output will be pushed to the standard output ...
                // You can use that for debugging 
                transformer.transform(domSource, streamResult);

                System.out.println("Done creating XML File");

            } catch (ParserConfigurationException pce) {
                pce.printStackTrace();
            } catch (TransformerException tfe) {
                tfe.printStackTrace();
            }
        }
    } public static String[][] PrintMarks(int StudentId,String Names,String Programme) {
        String[][] myArrayString = new String[10][5];
myArrayString[0][0]=StudentId+"";
myArrayString[0][1]=Names+"";
myArrayString[0][2]=Programme+"";
myArrayString[0][3]="CSC111";
myArrayString[0][4]=(int) (Math.random() * 100)+"";
myArrayString[1][0]=StudentId+"";
myArrayString[1][1]=Names+"";
myArrayString[1][2]=Programme+"";
myArrayString[1][3]="ACS111";
myArrayString[1][4]=(int) (Math.random() * 100)+"";
myArrayString[2][0]=StudentId+"";
myArrayString[2][1]=Names+"";
myArrayString[2][2]=Programme+"";
myArrayString[2][3]="GNS113";
myArrayString[2][4]=(int) (Math.random() * 100)+"";
myArrayString[3][0]=StudentId+"";
myArrayString[3][1]=Names+"";
myArrayString[3][2]=Programme+"";
myArrayString[3][3]="ACF111";
myArrayString[3][4]=(int) (Math.random() * 100)+"";  
myArrayString[4][0]=StudentId+"";
myArrayString[4][1]=Names+"";
myArrayString[4][2]=Programme+"";
myArrayString[4][3]="ACF112";
myArrayString[4][4]=(int) (Math.random() * 100)+"";  
myArrayString[5][0]=StudentId+"";
myArrayString[5][1]=Names+"";
myArrayString[5][2]=Programme+"";
myArrayString[5][3]="CSC113";
myArrayString[5][4]=(int) (Math.random() * 100)+"";  
myArrayString[6][0]=StudentId+"";
myArrayString[6][1]=Names+"";
myArrayString[6][2]=Programme+"";
myArrayString[6][3]="MAT112";
myArrayString[6][4]=(int) (Math.random() * 100)+"";  
myArrayString[7][0]=StudentId+"";
myArrayString[7][1]=Names+"";
myArrayString[7][2]=Programme+"";
myArrayString[7][3]="CSC112";
myArrayString[7][4]=(int) (Math.random() * 100)+"";  
myArrayString[8][0]=StudentId+"";
myArrayString[8][1]=Names+"";
myArrayString[8][2]=Programme+"";
myArrayString[8][3]="BUS122";
myArrayString[8][4]=(int) (Math.random() * 100)+"";  
myArrayString[9][0]=StudentId+"";
myArrayString[9][1]=Names+"";
myArrayString[9][2]=Programme+"";
myArrayString[9][3]="BUS134";
myArrayString[9][4]=(int) (Math.random() * 100)+"";  
return myArrayString;
    }
}
