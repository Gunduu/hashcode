/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class HashCode {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student s1 = new Student(1,"Prasanth","prasanthnonline@gmail.com");
        Student s2 = new Student(2,"Sruthi","sruthionline@gmail.com");
        Student s3 = s1;
        
        System.out.println("s1 and s3 are equal ==>" +(s1.equals(s3)) );
        
        //------------------- List and arraylist belong to equal logic---------
        List<Student> s4= new ArrayList<>();
        s4.add(s1);
        s4.add(s2);
        
        if(s4.contains(new Student(1,"Prasanth","prasanthnonline@gmail.com"))){
            System.out.println("yes");
        }
        else{
            System.out.println("No");
        }
        
        //-------------- Set and HashSet belong to Hashcode logic---------------
        Set<Student> s5= new HashSet<>();
        s5.add(s1);
        s5.add(s2);
        
        if(s5.contains(new Student(1,"Prasanth","prasanthnonline@gmail.com"))){
            System.out.println("yes");
        }
        else{
            System.out.println("No");
        }
    }
    
}
