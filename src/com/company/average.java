package com.company;

//public class average {


import java.io.*;
import java.util.*;
import java.util.Scanner;

public class average{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int n =sc.nextInt();sc.nextLine();
        Lawyer[] laws =new Lawyer[n];
        for (int i = 0; i < n; i++) {
            int id=sc.nextInt();sc.nextLine();
            String name=sc.nextLine();
            double salary=sc.nextDouble();sc.nextLine();
            int age=sc.nextInt();sc.nextLine();
            laws[i]=new Lawyer(id, name, salary, age);

        }
        String lname=sc.nextLine();sc.close();
        double ans=findAverageAgeOfLawyer(laws);
        Lawyer ans2=searchLawyerByName(laws, lname);

        if(ans>0){
            System.out.println("Average of age "+ans);
        }
        else{
            System.out.println("No Lawyer found with mentioned attribute.");
        }
        if(ans2!=null){
            System.out.println("id-"+ans2.getid());
            System.out.println("name-"+ans2.getname());
            System.out.println("salary-"+ans2.getsalary());
            System.out.println("age-"+ans2.getage());
        }
        else{
            System.out.println("No Lawyer found with mentioned attribute.");
        }
    }



    public static double findAverageAgeOfLawyer(Lawyer[] laws)
    {
        double avg=0;
        int count=0;
        for(Lawyer temp:laws){
            avg=avg+temp.getage();
            count=count+1;
        }
        return (avg/count);

    }
    public static Lawyer searchLawyerByName(Lawyer[] laws, String lname)
    {
        Lawyer vn=null;
        for(Lawyer temp: laws){
            if(temp.getname().equalsIgnoreCase(lname)){
                vn=temp;
            }
        }
        return vn;
    }

}





class Lawyer
{
    int id;
    String name;
    double salary;
    int age;

    public Lawyer(int id,String name , double salary, int age ){
        this.id=id;
        this.name=name;
        this.salary=salary;
        this.age=age;
    }

    public int getid(){return id;}
    public String getname(){return name;}
    public double getsalary(){return salary;}
    public int getage(){return age;}





}

