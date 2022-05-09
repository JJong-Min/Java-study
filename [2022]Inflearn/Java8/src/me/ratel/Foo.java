package me.ratel;

import java.util.function.Function;

public class Foo {

  public static void main(String[] args) {
    RunsomethingOne runsomethingOne = () -> System.out.println("ratel");
    RunSomethingTwo runSomethingTwo = number -> number + 1;

    Plus10 plus10 = new Plus10();
    System.out.println(plus10.apply(10));

    Function<Integer, Integer> multiply10 = (number) -> number * 10;
    System.out.println(multiply10.apply(10));
  }
}
