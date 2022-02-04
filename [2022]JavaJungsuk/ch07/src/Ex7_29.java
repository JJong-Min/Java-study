// 다형성의 장점
// 1. 다형적 매개변수
// 2. 하나의 배열에 여러 종류 객체 저장

Product p1 = new Tv();
Product p2 = new Computer();
Product p3 = new Audio();

Product p[] = new Product[3];
p[0] = new Tv();
p[1] = new Computer();
p[2] = new Audio();

// 배열의 type이 object이면 모든 종류의 객체 저장 가능