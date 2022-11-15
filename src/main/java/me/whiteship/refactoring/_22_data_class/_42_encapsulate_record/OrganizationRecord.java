package me.whiteship.refactoring._22_data_class._42_encapsulate_record;

// 변경되지 않는 불변 객체를 만들때는 Record 를 사용하자
public record OrganizationRecord(String name, String country) {
}
