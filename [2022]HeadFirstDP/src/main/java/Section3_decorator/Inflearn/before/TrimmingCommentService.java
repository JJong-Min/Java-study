package Section3_decorator.Inflearn.before;

/*
* 상속을 사용하게 되면 유연하지 않음.
* 컴파일타임 때에 고정적으로 서비스가 의존하게 됨.
* 상속은 단일상속만 가능하고 2개의 기능을 하는 서비스를 client에 주입하고 싶으면 새로운 클래스를 만들어야함.
* 즉, 상속만으로는 확장하기가 쉽지않음.*/
public class TrimmingCommentService extends CommentService {

  @Override
  public void addComment(String comment) {
    super.addComment(trim(comment));
  }

  private String trim(String comment) {
    return comment.replace("...", "");
  }
}
