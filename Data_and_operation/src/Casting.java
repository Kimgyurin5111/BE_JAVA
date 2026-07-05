public class Casting {
    public static void main(String[] args) {

        double a = 1.1;

        //자동
        double b = 1;
        System.out.println(b); // 1.0
        // 명시적
        double b2 = (double) 1;

        // int c = 1.1; 손실 발생
        double d = 1.1;
        int e = (int) 1.1; // 강제로 정수 변환
        System.out.println(e); // 1 (손실 발생)

        // 1 to String
        String f = Integer.toString(1);
        // .getClass(): 어떤 타입인지 출력
        System.out.println(f.getClass());
    }
}
