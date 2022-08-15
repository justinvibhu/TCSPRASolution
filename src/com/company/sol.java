package com.company;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


import java.util.Scanner;

class Sol {
    public static void main(String[] args) throws Exception{
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();sc.nextLine();
        Player[] players=new Player[n];
        for (int i = 0; i < n; i++) {
            int id=sc.nextInt();sc.nextLine();
            int matchesPlayed=sc.nextInt();sc.nextLine();
            int totalRuns=sc.nextInt();sc.nextLine();
            String name=sc.nextLine();
            String team=sc.nextLine();
            players[i]=new Player(id, matchesPlayed, totalRuns, name, team);

        }
        //Enter your Code here

        int id =sc.nextInt();sc.nextLine();sc.close();
        Player ans=findPlayerWithMinimumMatchesPlayed(players);
        Player ans2=searchPlayerById(players, id);
        if(ans!=null){
            System.out.println("id-"+ans.getid());
            System.out.println("matchesPlayed-"+ans.getmachesplayed());
            System.out.println("totalRuns-"+ans.gettotalruns());
            System.out.println("name-"+ans.getname());
            System.out.println("team-"+ans.getteam());
        }else{
            System.out.println("No Player found with mentioned attribute");
        }
        if(ans2!=null){
            System.out.println("id-"+ans2.getid());
            System.out.println("matchesPlayed-"+ans2.getmachesplayed());
            System.out.println("totalRuns-"+ans2.gettotalruns());
            System.out.println("name-"+ans2.getname());
            System.out.println("team-"+ans2.getteam());
        }else{
            System.out.println("No Player found with mentioned attribute");
        }

    }

    public static Player findPlayerWithMinimumMatchesPlayed(Player[] players)
    {
        //Enter your Code here
        Player pl=players[0];
        int min=players[0].getmachesplayed();
        for(Player temp: players){
            if(temp.matchesPlayed<min){
                min=temp.getmachesplayed();
                pl=temp;
            }
        }
        return pl;
    }

    public static Player searchPlayerById(Player[] players, int id)
    {
        //Enter your Code here
        Player nm=null;
        for(Player temp:players){
            if(temp.getid()==id){
                nm=temp;

            }
        }
        return nm;

    }

}

class Player
{
    //Enter your Code here

    int id;
    int matchesPlayed;
    int totalRuns;
    String name;
    String team;


    public Player(int id,int matchesPlayed,int totalRuns,String name,String team){
        this.id=id;
        this.matchesPlayed=matchesPlayed;
        this.totalRuns=totalRuns;
        this.name=name;
        this.team=team;
    }

    public int getid(){return id;}
    public int getmachesplayed(){return matchesPlayed;}
    public int gettotalruns(){return totalRuns;}
    public String getname(){return name;}
    public String getteam(){return team;}
}
