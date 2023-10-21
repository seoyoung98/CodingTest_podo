package lv2;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*
 * 숫자랑 문자 분리하는 연습을 해보고 싶었다.
 * 그래서 임의로 아주아주 긴 문자열을 만들어주고 나눠주었다.
 */
public class StringPractice {

    public static void main(String[] args) {
        String text = "Hello1234my45name567is234SeoYoung56";
        List<String> letters = new ArrayList<>(); // 문자 저장
        List<String> numbers = new ArrayList<>(); // 숫자 저장

        // 숫자와 문자를 분리하기 위한 정규 표현식
        // Pattern 클래스 사용, 정규 표현식 생성 (|를 필수로 넣어야 한다!!)
        Pattern pattern = Pattern.compile("[0-9]+|[a-zA-Z]+");
        // matcher를 이용하여 일치하는 부분 찾기
        Matcher matcher = pattern.matcher(text);
        
        // 정규 표현식과 일치하는 부분을 찾는다.
        while (matcher.find()) {
        	// matcher.group()을 이용하여 현재 일치하는 부분(그룹)을 가져온다.
            String match = matcher.group();
            // 현재 일치하는 부분의 첫 문자가 숫자면 numbers에 추가
            if (Character.isDigit(match.charAt(0))) {
                numbers.add(match);
            } 
            // 현재 일치하는 부분의 첫 문자가 문자면 letters에 추가
            else {
                letters.add(match);
            }
        }
        
        System.out.println(letters);
        System.out.println(numbers);
        
        // 결과 출력
        //System.out.println("문자: " + String.join(", ", letters));
        //System.out.println("숫자: " + String.join(", ", numbers));
    }
}
