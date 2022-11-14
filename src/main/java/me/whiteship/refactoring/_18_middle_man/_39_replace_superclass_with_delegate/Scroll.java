package me.whiteship.refactoring._18_middle_man._39_replace_superclass_with_delegate;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

public class Scroll {

    private LocalDate dateLastCleaned;

    /**
     *  Scroll은 특정한 아이템이지 카테고리가 아니기 때문에 상속 대신 위임으로 변경
     *  상위 타입을 필드로 선언 후 생성자에서 생성
      */
    private CategoryItem categoryItem;

    public Scroll(Integer id, String title, List<String> tags, LocalDate dateLastCleaned) {
        this.dateLastCleaned = dateLastCleaned;
        this.categoryItem = new CategoryItem(id, title, tags);
    }

    public long daysSinceLastCleaning(LocalDate targetDate) {
        return this.dateLastCleaned.until(targetDate, ChronoUnit.DAYS);
    }
}
