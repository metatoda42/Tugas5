public class Luas extends Data {
	private static double hitung(double x) {
		if(x==0) {
			return Data.getLebar()*Data.getPanjang();
		}
		else if(x==1) {
			return Data.getLebar()*Data.getTinggi();
		}
		else if(x==2) {
			return Data.getTinggi()*Data.getPanjang();
		}
		return 0;
	}
	public static  double alas(){
		return hitung(0);
	}
	public  static double sisi1() {
		return hitung(1);
	}
	public  static double sisi2() {
		return hitung(2);
	}
	public static  double luastotal() {
		return Data.getLebar()*2+Data.getPanjang()*2+Data.getTinggi()*2;
	}
}
