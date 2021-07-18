
public class ProductExample {
    public static void main(String[] args) {
        // 자바 7부터 추가된 다이아몬드 연산자 이용
        MulltiTypeParameterProduct<Tv, String> product = new MulltiTypeParameterProduct<>();
        product.setModel("Samsung");
        Tv tv = product.getKind();
        String tvmodel = product.getModel();

    }
}
