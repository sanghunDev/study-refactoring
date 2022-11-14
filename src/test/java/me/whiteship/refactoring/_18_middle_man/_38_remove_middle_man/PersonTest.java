package me.whiteship.refactoring._18_middle_man._38_remove_middle_man;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void getManager() {
        Person nick = new Person("nick", null);
        Person keesun = new Person("keesun", new Department(nick));
        //assertEquals(nick, keesun.getManager());
        //department에서 바로 접근 가능 (꼭 이게 정답이 아닌 캡슐화 스코프는 선택)
        assertEquals(nick, keesun.getDepartment().getManager());
    }

}