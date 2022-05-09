package me.ratel;

@FunctionalInterface
public interface RunSomethingTwo {
  // 이러한 functional interface는 사실 상 필요없음.
  // 이미 java단에서 Function이라는 interface를 제공 중,
  int doIt(int number);
}
