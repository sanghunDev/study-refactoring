package me.whiteship.refactoring._18_middle_man._38_remove_middle_man;

public class Person {

    private Department department;

    private String name;

    public Person(String name, Department department) {
        this.name = name;
        this.department = department;
    }

    //department에 대한 중재자
    /*public Person getManager() {
        return this.department.getManager();
    }*/

    public Department getDepartment() {
        return department;
    }
}
