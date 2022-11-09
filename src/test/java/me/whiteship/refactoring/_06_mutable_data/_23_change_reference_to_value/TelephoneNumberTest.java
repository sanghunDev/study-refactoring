package me.whiteship.refactoring._06_mutable_data._23_change_reference_to_value;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TelephoneNumberTest {

    @Test
    void testEquals() {
        TelephoneNumber number1 = new TelephoneNumber("123", "1234");
        TelephoneNumber number2 = new TelephoneNumber("123", "1234");
        //equals 구현을 했기 때문에 아래 테스트가 성공한다 (구현하지 않는다면 기본은 ==)
        assertEquals(number1,number2);
    }
}