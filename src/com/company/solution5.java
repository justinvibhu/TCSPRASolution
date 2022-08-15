package com.company;
import java.util.Scanner;
public class solution5 {
    public static void main(String[] args ){
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();sc.nextLine();
       Students[] students=new Students[n];
        for (int i = 0; i <n ; i++) {
            int id=sc.nextInt();sc.nextLine();
            String name=sc.nextLine();
            int marks=sc.nextInt();sc.nextLine();
            students[i]=new Students(id,name,marks);

        }
        String input=sc.nextLine();sc.close();
        Students ans=findBymarks(students);
        Students ans2=searchByname(students,input);
        if(ans!=null){
            System.out.println("id="+ans.getId());
        }
        else{
            System.out.println("No data is found");
        }
        if(ans2!=null){
            System.out.println("id="+ans2.getId());
        }
        else{
            System.out.println("No data is found");
        }

    }
    public static Students findBymarks(Students[] students){
        Students st=students[0];
        int max=students[0].getMark();
        for(Students temp:students){
            if(temp.getMark()>max){
                max= temp.getMark();
                st=temp;
            }
        }
        return st;
    }
    public static Students searchByname(Students[] students, String input){
        Students st=null;
        for(Students temp: students){
            if(temp.getName().equalsIgnoreCase(input)){
                st=temp;
            }
        }
        return st;
    }
}

class Students{
    int id;
    String name;
    int marks;
    public Students(int id, String name,int marks){
        this.id=id;
        this.name=name;
        this.marks=marks;
    }
    public int getId(){ return id; }
    public String getName(){return name;}
    public int getMark(){return marks;}
}
/*
4
1
w
34
2
sf
3434
4
df
34
5
df
34
sf

*/