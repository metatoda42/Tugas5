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
		else if(x==3) {
			return Data.getTinggi()*2 + Data.getLebar()*2;
		}
		else if(x==4) {
			return Data.getTinggi()*2 + Data.getPanjang()*2;
		}
		else if(x==5) {
			return Data.getPanjang()*2 + Data.getLebar()*2;
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
	public static double keliling1() {
		return hitung(3);
	}
	public static double keliling2() {
		return hitung(4);
	}
	public static double kelalas() {
		return hitung(5);
	}
	
	public static  double luastotal() {
		return Data.getLebar()*2+Data.getPanjang()*2+Data.getTinggi()*2;
	}
}
