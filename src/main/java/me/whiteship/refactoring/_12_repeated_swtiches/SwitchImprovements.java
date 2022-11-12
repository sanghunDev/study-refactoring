package me.whiteship.refactoring._12_repeated_swtiches;

public class SwitchImprovements {

    //기존의 switch 문법
    public int vacationHours(String type) {
        int result;
        switch (type) {
            case "full-time": result = 120; break;
            case "part-time": result = 80; break;
            case "temporal": result = 32; break;
            default: result = 0;
        }
        return result;
    }

    //변경된 switch 표현식
    public int switchExpression(String type) {
        // switch 문과는 다르며 결과를 담을 수 있다 (기존 코드의 break 부분도 제거 가능)
        int result = switch (type) {
            case "full-time" -> 120;
            case "part-time" -> 80;
            case "temporal" -> 32;
            default -> 0;
        };
        return result;
    }
}
