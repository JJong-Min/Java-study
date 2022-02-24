import java.util.Arrays;
import java.util.List;

public class stringSplit {

  public static void main(String[] args) {
    String str = "# [1.0.0-next-v1.93](https://github.com/channel-io/bezier-react/compare/v1.0.0-next-v1.92...v1.0.0-next-v1.93) (2022-02-14)\n"
        + "\n"
        + "### Bug Fixes\n"
        + "\n"
        + "* snap shot conflict 수정 ([06fc7db](https://github.com/channel-io/bezier-react/commit/06fc7db8ff2451d2dca58d4f49f9eb4420eb7a8f))\n"
        + "\n"
        + "* 리뷰 반영 및 focus 되었을 때 스타일 변경 ([fe405d6](https://github.com/channel-io/bezier-react/commit/fe405d6aecaed0e18a6091151eda589ffc5c58fb))\n"
        + "\n"
        + "* 리뷰 수정 ([8d74dde](https://github.com/channel-io/bezier-react/commit/8d74dded23543dace269446ca15f41f21e866728))\n"
        + "\n"
        + "* 접근성 향상을 위하여 페이지를 이동시키는 navitem은 a태그로 변경 ([c90a635](https://github.com/channel-io/bezier-react/commit/c90a635b829ff34ba911d91f7929a945c419e02f))\n"
        + "\n"
        + "* 컴포넌트 semantic하게 변경 ([779b23b](https://github.com/channel-io/bezier-react/commit/779b23b1d525ce3173a863ad3a007d9372ac93a4))\n"
        + "\n"
        + "* **navitem:** navitem 스펙에 맞추어 수정 & useDepthContext 제거 ([35fac51](https://github.com/channel-io/bezier-react/commit/35fac511e4dc9e7a5c9cebd2840ba19783e2493d))\n"
        + "\n"
        + "* **navitem:** navitem을 item만으로만 사용하기 위해 디렉토리 이동 ([804afc1](https://github.com/channel-io/bezier-react/commit/804afc129647527bb6c4cbb13b38c0f7db15eaca))\n"
        + "\n"
        + "* ** navitem:** pr comment 수정 ([e10de02](https://github.com/channel-io/bezier-react/commit/e10de02c1fe63dc5522a76d921fe0489ec767d41))\n"
        + "\n"
        + "### Features\n"
        + "\n"
        + "* **hooks:** depth를 관리하는 useDepthContext 추가 ([590a7a8](https://github.com/channel-io/bezier-react/commit/590a7a8b9be7e1a74a6798f7557718c817979802))\n"
        + "\n"
        + "* **navgroup:** navitem을 감싸는 navgroup 추가 ([2b5ae96](https://github.com/channel-io/bezier-react/commit/2b5ae96abc3125fd0b235f921bb0eb66b11e6a66))\n"
        + "\n"
        + "* **navitem:** navitem 구현 ([7c029ce](https://github.com/channel-io/bezier-react/commit/7c029cedafcdc594678eb7ac1912ae31c29e5e18))";
    List<String> strList = List.of(str.split("\n"));
    strList.forEach(s -> System.out.println(s));
  }

}
