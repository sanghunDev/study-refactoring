package me.whiteship.refactoring._11_primitive_obsession._30_repliace_primitive_with_object;

import java.util.List;

public class Priority {

    private String value;

    private List<String> legalVAlues = List.of("low", "normal", "high", "rush");

    public Priority(String value) {
        if (legalVAlues.contains(value)) {
            this.value = value;
        } else {
            throw new IllegalArgumentException("잘못된 파라미터 값")
        }


    }

    @Override
    public String toString() {
        return this.value;
    }
}
