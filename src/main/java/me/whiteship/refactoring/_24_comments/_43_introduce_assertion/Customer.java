package me.whiteship.refactoring._24_comments._43_introduce_assertion;

public class Customer {

    private Double discountRate;

    public double applyDiscount(double amount) {
        return (this.discountRate != null) ? amount - (this.discountRate * amount) : amount;
    }

    public Double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(Double discountRate) {
        /**
         * 하지만 아래 코드는 프로그램적으로 실수를 한 것이기 때문에 아래와 같이 오류를 발생 시키는게 더 정확하다
         * assert 키워드를 사용해서 검증 하는것은 jvm 옵션에 따라 무시될 수도 있다
         * 어딘가에서 해당 상황을 검증을 이미 하고 있으며 그 상황이 항상 정확하다고 가정하고 있다는 걸 나타낼 때에는 주석 보다는 assert 키워드를 사용하자
         */

        //assert discountRate != null && discountRate > 0;

        if (discountRate != null && discountRate > 0) {
            throw new IllegalArgumentException(discountRate + "can't be minus.");
        }
        this.discountRate = discountRate;
    }
}
