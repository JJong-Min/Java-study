import java.lang.annotation.Repeatable;

@Repeatable(ToDos.class) // @ToDo 애노테이션을 여러 번 반복해서 쓸 수 있게합니다.
@interface Todo {
	String value();
}

//@Todo 애노테이션의 @Repeatable 애노테이션을 위한 ToDos 애노테이션 
@interface ToDos {
	Todo[] value();
}