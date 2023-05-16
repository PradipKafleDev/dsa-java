package hashing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class HashingBasic {
    public static void main(String[] args) {
//        //HashMap
//        HashMap<String,String> map = new HashMap<>();
//        map.put("One","I");
//        map.put("Two","II");
//        map.put("Three","III");
//
//        System.out.println(map);



        //HashSet
//        HashSet<Integer> set = new HashSet<>();
//        set.add(34);
//        set.add(3);
//        set.add(4);
//        set.add(3);
//        System.out.println(set);

//        Set<Student> rollCall = new HashSet<>();
//        Student s1 = new Student(1, "Pradip");
//        Student s2 = new Student(2, "Aman");
//        Student s3 = new Student(3, "Pradip");
//
//        rollCall.add(s1);
//        rollCall.add(s2);
//        rollCall.add(s3);
//
//        System.out.println(rollCall);
//        Student s4 = new Student(1, "Pradip");
//        rollCall.add(s4);
//        System.out.println(rollCall);

        Set <Student>rollCall = new HashSet<>();
        Student s1 = new Student(1,"pradip");
        Student s2 = new Student(1,"Aman");
        System.out.println(s1.hashCode());
        System.out.println(s1.hashCode());

        System.out.println(s1.equals(s2));






    }



}

class Student{
    int rollNo;
    String name;

    public Student(int rollNo, String name){
        this.rollNo = rollNo;
        this.name = name;
    }

    public String toString(){
        return "("+rollNo+" , "+name+")";
    }

//    @Override
//    public int hashCode(){
//        return rollNo;
//    }
    @Override
    public boolean equals(Object obj){
        Student that = (Student) obj;
        if(this.rollNo == that.rollNo){
            return true;
        }
        return false;
    }

    }
