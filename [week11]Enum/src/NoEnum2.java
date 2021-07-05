
public class NoEnum2 {
	/*농구선수에 관한 상수*/
	public static final int Basketball_KangBaekHo = 10;
	public static final int Basketball_ChaeChiSu = 4;
	public static final int Basketball_SeoTaeUng = 11;
	
	/*야구선수에 관한 상수*/
	public static final int Baseball_KangBaekHo = 10;
	public static final int Baseball_LeeDaeHo = 2;
	public static final int Baseball_CooSinSoo = 3;

	public static void main(String[] args) {
		if (Basketball_KangBaekHo==Baseball_KangBaekHo) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}

	}

}
