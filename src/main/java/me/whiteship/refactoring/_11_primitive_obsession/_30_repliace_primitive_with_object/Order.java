package me.whiteship.refactoring._11_primitive_obsession._30_repliace_primitive_with_object;

public class Order {

    private Priority priority;

    //기존에 생성자로 문자열 주입받던 부분 변경을 하지 않기 위해 처리
    public Order(String priorityValue) {
        this(new Priority(priorityValue));
    }

    public Order(Priority priority) {
        this.priority = priority;
    }

    public Priority getPriority() {
        return priority;
    }

}
