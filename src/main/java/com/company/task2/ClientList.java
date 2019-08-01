package com.company.task2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class ClientList {

    private static final LocalDate PRESENTDATE = LocalDate.of(2019, 7, 20);

        public static void filterListByUsers () {
            System.out.println("\nTask 2 : \n");
            List<Client> clients = createAndGetUsers();
            Map<String, List<String>> groupByTeam = clients.stream()
                            .filter(d -> d.getLoginDate()
                            .isAfter(PRESENTDATE))
                            .collect(Collectors.groupingBy(Client::getTeam, Collectors.mapping(Client::getEmail, Collectors.toList())));

            System.out.println("\n" + clients + "\n");
            System.out.println("\n" + groupByTeam + "\n");
        }
            public static List<Client> createAndGetUsers() {
                List<Client> clients = new ArrayList<>();
                clients.add(new Client("alf@hi.com", LocalDate.of(2019, 7, 22), "Green"));
                clients.add(new Client("kris@lava.com", LocalDate.of(2019, 7, 23), "Yellow"));
                clients.add(new Client("misterio@hak.com", LocalDate.of(2019, 7, 21), "Orange"));
                clients.add(new Client("min@fyb.com", LocalDate.of(2019, 7, 24), "Green"));
                clients.add(new Client("ciena@wat.com", LocalDate.of(2019, 7, 12), "Orange"));
                clients.add(new Client("toha@tyt.com", LocalDate.of(2019, 7, 27), "Yellow"));
                clients.add(new Client("sckala@bydy.com", LocalDate.of(2019, 7, 13), "Orange"));
                clients.add(new Client("bikini@bottom.com", LocalDate.of(2019, 7, 14), "Green"));
                clients.add(new Client("kerha@yak.com",  LocalDate.of(2019, 7, 16), "Yellow"));
                clients.add(new Client("under@noth.com", LocalDate.of(2019, 7, 15), "Orange"));
                return clients;
            }
        }

