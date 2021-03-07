package Lesson_branch_8;

import Lesson_branch_8.Person;

public class User extends Person {

    private String role;

    public User(String firstName, String secondName, int age, String email, String password) {
        super(firstName, secondName, age, email, password);
        this.role = "USER";
    }
}