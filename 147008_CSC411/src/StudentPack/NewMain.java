/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentPack;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author SSFAKUDZE
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        //sets the delimiter pattern  
       
        int Random1 = (int) (Math.random() * 100);
        int Random2 = (int) (Math.random() * 100);
       int Random4 = (int) (Math.random() * 100000000);
        System.out.println(Random4);

//System.out.print( named+" "+surnamed);  //find and returns the next complete token from this scanner  
    }

    public String[][] PrintMarks(int StudentId,String Names,String Programme) {
        String[][] myArrayString = new String[5][4];
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
        return myArrayString;
    }

}
