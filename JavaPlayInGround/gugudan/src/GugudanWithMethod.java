import java.awt.*;

public class GugudanWithMethod {
    // 내가 작성한 메소드
    public static void myGugudan(int num) {
        for(int i=1; i<10; i++) {
            System.out.println(num*i);
        }
    }

    // javajigi의 메소드
    public static int[] jigiGugudan(int num) {
        int[] result = new int[9];
        for(int i=0; i<result.length; i++) {
            result[i] = num*(i+1);
        }
        return result;
    }

    public static void gugudanPrint(int[] result) {
        for(int i=0; i<result.length; i++) {
            System.out.println(result[i]);
        }
    }

    public static void main(String[] args) {
        // 내가 쓴 메소드 실행
        for(int i=2; i<10; i++) {
            myGugudan(i);
        }

        //javajigi가 쓴 메소드 실행
        for(int i=2; i<10; i++) {
            int[] result = jigiGugudan(i);
            gugudanPrint(result);
        }

    }
}
