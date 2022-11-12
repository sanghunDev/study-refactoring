package me.whiteship.refactoring._11_primitive_obsession._30_repliace_primitive_with_object;

public class Priority {

    private String value;

    public Priority(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }
}
