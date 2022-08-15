package com.company;
/*


import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

	// write your code
        Studnet[] studnets =new Studnet[4];
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();sc.nextLine();
        for (int i = 0; i < n; i++) {
            int a =sc.nextInt();sc.nextLine();
            String b =sc.nextLine();
            int c= sc.nextInt();sc.nextLine();
            int d= sc.nextInt();sc.nextLine();
            studnets[i]=new Studnet(a,b,c,d);



        }
        int input1=sc.nextInt();sc.nextLine();

        Studnet ans1=findStudnetwithMaximunAge(studnets);

        System.out.println("id="+ans1.id);
        System.out.println("name ="+ans1.name);
        System.out.println("Marks="+ans1.marks);
        System.out.println("Age="+ans1.age);



        Studnet ans2=SearchByStudentId(studnets,input1);
        if(ans2==null){
            System.out.println("No student found wt=ith mention attribute");
        }
        else{
            System.out.println("id ="+ans2.getName());
            System.out.println("name="+ans2.getName());
            System.out.println("mark"+ans2.marks);
            System.out.println("age"+ans2.age);
        }


    }


    private static Studnet SearchByStudentId(Studnet[] studnets, int input1) {
        for (int i = 0; i < studnets.length; i++) {
            if(studnets[i].id==input1){
                return studnets[i];

            }

        }
        return null;
    }

    private static Studnet findStudnetwithMaximunAge(Studnet[] studnets) {
        int max=studnets[0].age;
        for (int i = 1; i <studnets.length; i++) {
            if(studnets[i].age>max){
                max=studnets[i].age;
            }

        }
        for (int i = 0; i < studnets.length; i++) {
            if(studnets[i].age==max){
                return studnets[i];

            }

        }
        return null;
    }


}







class Studnet{
    int id;
    String name ;
    int marks;
    int age ;
    // constructor

    public Studnet(int id, String name, int marks, int age) {
        this.id = id;
        this.name = name;
        this.marks = marks;
        this.age = age;
    }

    // geter and seter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
*/

/*
package com.company;
import java.util.Arrays;
import java.util.Scanner;
 class Solution {


    public static void main(String[] args) {
        Enter your code here. Print output to STDOUT. Your class should be named Solution.
        Students[] students= new Students[4];
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();sc.nextLine();
        for (int i = 0; i < n; i++) {
            int id =sc.nextInt();sc.nextLine();
            String name=sc.nextLine();
            int marks=sc.nextInt();sc.nextLine();
            int age=sc.nextInt();sc.nextLine();
            students[i]=new Students(id, name, marks, age);

        }
        int input1=sc.nextInt();sc.nextLine();
        Students ans=findStudentWithMaximumAge(students);
        System.out.println("id"+ans.id);
        System.out.println("name="+ans.name);
        System.out.println("marks"+ans.marks);
        System.out.println("age"+ans.age);

        Students ans2=searchStudentById(students,input1);
        if(ans2==null){
            System.out.println("Nodata is found ");


        }else{

            System.out.println("id"+ans2.id);
            System.out.println("name="+ans2.name);
            System.out.println("marks"+ans2.marks);
            System.out.println("age"+ans2.age);
        }


    }
    public static Students findStudentWithMaximumAge(Students[] students){
        int max=students[0].age;
        for (int i = 1; i < students.length; i++) {
            if(students[i].age>max){
                max=students[i].age;

            }

        }
        for (int i = 0; i < students.length; i++) {
            if(students[i].age==max){
                return students[i];
            }
        }

        return null;
    }

    public static Students searchStudentById(Students[] students,int input1){
        for (int i = 0; i < students.length; i++) {
            if(students[i].id==input1){
                return students[i];
            }
        }
        return null;
    }
}


class Students{
    int id;
    String name;
    int marks;
    int age;

    public Students(int id, String name, int marks, int age){
        this.id=id;
        this.name=name;
        this.marks=marks;
        this.age=age;


    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }
    public int getMarks(){
        return marks;
    }
    public int getAge(){
        return age;
    }

    public void setId(int id){
        this.id=id;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setMarks(int marks){
        this.marks=marks;
    }
    public void setAge(int age){
        this.age=age;
    }
}
*/
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
import java.util.Arrays;
class Solution {
    public static void main(String[] args) {
        Student[] student=new Student[4];
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();sc.nextLine();
        for(int i=0;i<n;i++){
            int id=sc.nextInt();sc.nextLine();
            String name=sc.nextLine();
            int marks =sc.nextInt();sc.nextLine();
            int age=sc.nextInt();sc.nextLine();
            student[i]=new Student(id,name,marks,age);
        }
        int input1=sc.nextInt();sc.nextLine();
        Student ans=FindMaxWithId(student);
        System.out.println("id"+ans.id);
        System.out.println("id"+ans.name);
        System.out.println("id"+ans.marks);
        System.out.println("id"+ans.age);

        Student ans2=FindwihtAge(student, input1);

        if(ans2==null){
            System.out.println("No data is found");
        }
        else {
            System.out.println("id" + ans2.id);
            System.out.println("id" + ans2.name);
            System.out.println("id" + ans2.marks);
            System.out.println("id" + ans2.age);

        }


    }
    public static Student FindMaxWithId(Student[] student ){

        int max=student[0].id;
        for(int i=1;i<student.length;i++){
            if(student[i].id>max){
                max=student[i].id;
            }
        }
        for(int i=0;i<student.length;i++){
            if(student[i].id==max){
                return student[i];
            }
        }
        return null;
    }


    public static Student FindwihtAge(Student[] student, int input1){
        for(int i=0;i<student.length;i++){
            if(student[i].age==input1){
                return student[i];
            }
        }
        return null;
    }


}




class Student{
    int id;
    String name;
    int marks;
    int age;

    //  Contructor
    public Student(int id, String name, int marks, int age){
        this.id=id;
        this.name=name;
        this.marks=marks;
        this.age=age;
    }

    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getMarks(){
        return marks;
    }
    public int getAge(){
        return age;
    }
    public void setId(int id){
        this.id=id;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setMarks(int marks){
        this.marks=marks;
    }
    public void age(int age){
        this.age=age;
    }


}
