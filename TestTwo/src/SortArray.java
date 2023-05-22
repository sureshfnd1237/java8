package src;

import java.util.*;
import java.util.stream.Collectors;

public class SortArray {
    public static void main(String[] args) {
        sort();
    }

    public static void sort(){
        List<Integer> list = Arrays.asList(4,5,2,6,7,1,8);

        List<Integer> sortedListAscending = list.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(sortedListAscending);

        List<Integer> sortedListDescending = list.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(sortedListDescending);

        List<User> users = new ArrayList<>();
        users.add(new User(10, "Suresh"));
        users.add(new User(20, "Ramesh"));

//        List<User> sortedUsers  = users.stream()
//                .sorted((u1, u2)-> u1.name.compareTo(u2.name))
//                .collect(Collectors.toList());

        List<User> sortedUsers  = users.stream()
                .sorted(Comparator.comparing(User::getName).reversed())
                .collect(Collectors.toList());

        sortedUsers.forEach(System.out::println);

    }

    static class User{
        int age;
        String name;
        public User(int age, String name){
            this.age = age;
            this.name = name;
        }

        public int getAge(){
            return age;
        }

        public String getName(){
            return name;
        }

        @Override
        public String toString() {
            return "User{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
}


