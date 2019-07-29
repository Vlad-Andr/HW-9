package com.company.task2;


import com.company.task2.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class UserList {

    private static final LocalDate LOCAL_DATE = LocalDate.of(2019, 7, 20);


    public UserList() {

    }


        public static void filterListByUsers () {
            List<User> users = createListOfUsers();

            Map<String, List<String>> groupByTeam = users.stream()
                            .filter(d -> d.getLoginDate()
                            .isAfter(LOCAL_DATE))
                            .collect(Collectors.groupingBy(User::getTeam, Collectors.mapping(User::getEmail, Collectors.toList())));

            System.out.println("\n" + users + "\n");
            System.out.println("\n" + groupByTeam + "\n");
        }

            public static List<User> createListOfUsers () {
                List<User> users = new ArrayList<>();

                users.add(new User("alf@hi.com", LocalDate.of(2019, 7, 22), "Green"));
                users.add(new User("kris@lava.com", LocalDate.of(2019, 7, 23), "Yellow"));
                users.add(new User("misterio@hak.com", LocalDate.of(2019, 7, 21), "Orange"));
                users.add(new User("min@fyb.com", LocalDate.of(2019, 7, 24), "Green"));
                users.add(new User("ciena@wat.com", LocalDate.of(2019, 7, 12), "Orange"));
                users.add(new User("toha@tyt.com", LocalDate.of(2019, 7, 27), "Yellow"));
                users.add(new User("sckala@bydy.com", LocalDate.of(2019, 7, 13), "Orange"));
                users.add(new User("bikini@bottom.com", LocalDate.of(2019, 7, 14), "Green"));
                users.add(new User("kerha@yak.com",  LocalDate.of(2019, 7, 16), "Yellow"));
                users.add(new User("under@noth.com", LocalDate.of(2019, 7, 15), "Orange"));

                return users;
            }
        }

