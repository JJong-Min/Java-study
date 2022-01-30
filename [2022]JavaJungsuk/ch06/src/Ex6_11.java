public class Ex6_11 {
    public static void main(String[] args) {
        Data_1 d1 = new Data_1();
//        Data_2 d2 = new Data_2(); // complie error
        Data_2 d2 = new Data_2(2);
        System.out.println(Data_2.y);
    }
}

class Data_1 {
    int value;
}

class Data_2 {
    int value;
    static int y;

    Data_2(int x) {
        y = x;
    }
}

