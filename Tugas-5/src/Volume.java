public class Volume extends Luas {
	private static double hitungvolum() {
		return(Luas.alas()*Data.getTinggi());
	}
	public static double volume() {
		return hitungvolum();
	}
}
