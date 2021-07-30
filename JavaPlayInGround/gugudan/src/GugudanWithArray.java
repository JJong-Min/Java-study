public class GugudanWithArray {

    public static void main(String[] args) {
        int[] result = new int[9];
        // 배열에 구구단 중 2단 담기
        for(int i=0; i<result.length; i++) {
            result[i] = (i+1)*2;
        }
        // 배열에 담긴 2단 결과 출력
        for(int i=0; i<result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
