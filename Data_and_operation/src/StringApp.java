public class StringApp {
    public static void main(String[] args) {

        // Character VS String
        System.out.println("Hello World"); // String: 문자열 -> 작은 따옴표 사용 불가
        System.out.println('H'); // Character: 문자 1개 -> 작은 따옴표 사용
        System.out.println("H");

        // 줄바꿈 X -> just Add
        System.out.println("Hello "
                + "World");

        // new line: \n
        System.out.println("Hello \nWorld");

        // escape: 일반적인 문자열로 사용
        System.out.println("Hello \"World\"");// Hello "World"
    }
}
