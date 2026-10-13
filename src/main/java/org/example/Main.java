package org.example;

import java.sql.Array;
import java.sql.SQLOutput;
import java.util.*;
import java.lang.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) {
//        List<Integer> boys_pair = new ArrayList<>();
//        List<Integer> girls_pair = new ArrayList<>();
//        List<Integer> not_alloc = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
//        char[] students = {
//                'M', 'F', 'M', 'M', 'F',
//                'F', 'M', 'F', 'M', 'M',
//                'F', 'M', 'F', 'F', 'M',
//                'M', 'F', 'M', 'F', 'M',
//                'F'
//        };
//
        List<List<String>> rooms= new ArrayList<>();
//
//        int boys = 0,girls=0;
//        for(int i=0;i<21;i++)
//        {
//            if(students[i]=='M') boys++;
//            else girls++;
//        }
//        for(int i=0;i<21;i++)
//        {
//                if(students[i]=='M')
//                {
//                    boys_pair.add(i);
//                }
//                else {
//                    girls_pair.add(i);
//                }
//
//                if(boys_pair.size()==2)
//                {
//                    rooms.add(new ArrayList<>(boys_pair));
//                    boys_pair.clear();
//                }
//                if(girls_pair.size()==2) {
//                    rooms.add(new ArrayList<>(girls_pair));
//                    girls_pair.clear();
//                }
//        }
//        not_alloc.addAll(boys_pair);
//        not_alloc.addAll(girls_pair);
//        for(int i=0;i<rooms.toArray().length;i++)
//        {
//            System.out.println("room number "+i+" is allocated to Student "+rooms.get(i).get(0) +" and "+rooms.get(i).get(1) + " are in same room");
//        }
//        System.out.println("Not allocating Students are");
//        for(int i=0;i<not_alloc.toArray().length;i++) {
//            System.out.println(not_alloc.get(i));
//        }

//        int boys=0,girls=0;

        List<Student> students = new ArrayList<>();
        for(int i=0;i<21;i++)
        {
            String name = scan.next();
            String gender = scan.next();
            students.add(new Student(name,gender));
//            if(students.get(i).gender.equals("female"))
//            {
//                girls++;
//            }
//            else boys++;
        }

//        if(boys%2!=0)
//        {
//            for(int i=0;i<21;i++)
//            {
//                if(students.get(i).gender.equals("male"))
//                {
//                    boys--;
//                    if(boys==0)
//                    {
//                        System.out.println(students.get(i).name+ " didn't got room");
//                        return;
//                    }
//                }
//            }
//        }
//        else {
//            for(int i=0;i<21;i++)
//            {
//                if(students.get(i).gender.equals("female"))
//                {
//                    girls--;
//                    if(girls==0)
//                    {
//                        System.out.println(students.get(i).name+ " didn't got room");
//                        return;
//                    }
//                }
//            }
//        }


        List<String> boys_pair = new ArrayList<>();
        List<String> girls_pair = new ArrayList<>();


        for(int i=0;i<21;i++)
        {
            if(students.get(i).gender.equals("male"))
            {
                boys_pair.add(students.get(i).name);
            }
            else {
                girls_pair.add(students.get(i).name);
            }


            if(boys_pair.size()==2)
            {
//                System.out.println(boys_pair.get(0)+" and "+boys_pair.get(1)+" are in same room");
                rooms.add(new ArrayList<>(boys_pair));
                boys_pair.clear();
            }
            if(girls_pair.size()==2)
            {
//                System.out.println(girls_pair.get(0)+" and "+girls_pair.get(1)+" are in same room");
                rooms.add(new ArrayList<>(girls_pair));
                girls_pair.clear();
            }
        }



        for(int i=0;i<rooms.size();i++)
        {
            System.out.println(rooms.get(i).get(0)+ " and " + rooms.get(i).get(1) + "are int room no " + (i+1));

        }


        int i=0;
        while(i<boys_pair.size())
        {
            System.out.println(boys_pair.get(i)+" didnt got room");
            i++;
        }
        i=0;
        while(i<girls_pair.size())
        {
            System.out.println(girls_pair.get(i)+" didnt got room");
            i++;
        }

    }
}