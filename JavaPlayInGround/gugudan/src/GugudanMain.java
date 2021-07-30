public class GugudanMain {

    // gugudan을 계산하는 역할을 하는 class(GugudanWithMethod)와 직접 실행하는 메소드를 가지는 클래스 나누기기
   public static void main(String[] args) {
        // 내가 쓴 메소드 실행
        for(int i=2; i<10; i++) {
            GugudanWithMethod.myGugudan(i);
        }

        //javajigi가 쓴 메소드 실행
        for(int i=2; i<10; i++) {
            int[] result = GugudanWithMethod.jigiGugudan(i);
            GugudanWithMethod.gugudanPrint(result);
        }

    }
}
