package com.company;

import com.company.task1.TestLambdas;
import com.company.task2.UserList;
import com.company.task3.ListOfMovie;
import com.company.task4.ListBox;

public class AppRelise {
    public static void appStart() {
        System.out.println("Task 1 : \n");
        TestLambdas t = new TestLambdas(){
            @Override
            public Object calculate(Integer a, Integer b, Integer c) {
                double s = Math.pow(a * b, c);
                return s;
            }
        };
        System.out.println(t.calculate(12, 23, 55));

        System.out.println("\nTask 2 : \n");
        UserList s = new UserList();
        s.createListOfUsers();
        s.filterListByUsers();
        System.out.println("\nTask 3 : \n");
        ListOfMovie k = new ListOfMovie();
        k.filtredByMovie();
        System.out.println("\nTask 4 : \n");
        ListBox p = new ListBox();
        p.findFragileThing();
    }
}
