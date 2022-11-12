package me.whiteship.refactoring._15_speculative_generality._35_remove_dead_code;

import java.time.LocalDateTime;

/**
 * 사용하지 않는 코드가 애플리케이션 성능이나 기능에 영향을 끼치지는 않는다
 * 하지만 해당 소프트웨어가 어떻게 동작하는지 이해하려는 사람들에게는 꽤 고통을 줄 수 있다
 * 실제로 나중에 필요해질 코드라 하더라도 지금 쓰이지 않는 코드라면 주석으로 감싸는게 아니라 삭제해야 한다
 * 나중에 정말로 필요해지면 git 등 vcs 을 사용해 복원이 가능하다
 */
public class Reservation {

    private String title;

    private LocalDateTime from;

    private LocalDateTime to;

    private LocalDateTime alarm;

    //테스트 코드에서만 사용하기 때문에 삭제 가능
    public Reservation(String title, LocalDateTime from, LocalDateTime to) {
        this.title = title;
        this.from = from;
        this.to = to;
    }

    public void setAlarmBefore(int minutes) {
        this.alarm = this.from.minusMinutes(minutes);
    }

    public LocalDateTime getAlarm() {
        return alarm;
    }
}
