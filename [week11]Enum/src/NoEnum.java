
public class NoEnum {
	public static final int KangBaekHo = 10;
	public static final int ChaeChiSu = 4;
	public static final int SeoTaeUng = 11;

	public static void main(String[] args) {
		int player = KangBaekHo;
		switch (player) {
			case KangBaekHo:
				System.out.println("북산고 강백호입니다.");
				break;
			case ChaeChiSu:
				System.out.println("북산고 채치수입니다.");
				break;
			case SeoTaeUng:
				System.out.println("북산고 서태웅입니다.");
				break;
		}

	}

}
