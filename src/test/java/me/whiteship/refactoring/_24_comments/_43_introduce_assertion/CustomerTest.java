package me.whiteship.refactoring._24_comments._43_introduce_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    @Test
    void setDiscountRate() {
        // 테스트 코드 실행시 assert 검증을 해주는 이유는 jvm 옵션에 -ea 가 들어가 있기 때문, 해당 옵션을 삭제하면 그냥 실행됨
        Customer customer = new Customer();
        customer.setDiscountRate(10d);
    }
}