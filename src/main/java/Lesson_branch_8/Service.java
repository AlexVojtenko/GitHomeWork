package Lesson_branch_8;

import Lesson_branch_8.Person;

public interface Service {

    public boolean checkUser(Person person) throws Exception;

    public void writeData(Person person) throws Exception;

}
