package me.whiteship.refactoring._18_middle_man._40_replace_subclass_with_delegate;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class Booking {

    protected Show show;

    protected LocalDateTime time;

    protected PremiumDelegate premiumDelegate;
    
    public Booking(Show show, LocalDateTime time) {
        this.show = show;
        this.time = time;
    }

    //정적 팩토리 메서드로 객체 생성의 유연성 확보(하위 클래스 반환가능, 메서드명 명시적으로 작성 가능)
    public static Booking createBooking(Show show, LocalDateTime time) {
        return new Booking(show, time);
    }

    //PremiumDelegate 클래스를 사용해서 상속에 있던 클래스들을 이동, 상속 관계를 끊고 위임으로 변경
    public static Booking createPremiumBooking(Show show, LocalDateTime time, PremiumExtra extra) {
        Booking booking = createBooking(show, time);
        booking.premiumDelegate = new PremiumDelegate(booking, extra);
        return booking;
    }

    public boolean hasTalkback() {
        return (this.premiumDelegate != null) ? this.premiumDelegate.hasTalkback() :
                this.show.hasOwnProperty("talkback") && !this.isPeakDay();
    }

    protected boolean isPeakDay() {
        DayOfWeek dayOfWeek = this.time.getDayOfWeek();
        return dayOfWeek == DayOfWeek.SATURDAY || dayOfWeek == DayOfWeek.SUNDAY;
    }

    public double basePrice() {
        double result = this.show.getPrice();
        if (this.isPeakDay()) result += Math.round(result * 0.15);
        return (this.premiumDelegate != null) ? this.premiumDelegate.extendBasePrice(result) : result;
    }

    public boolean hasDinner() {
        return this.premiumDelegate != null && this.premiumDelegate.hasDinner();
    }
}
