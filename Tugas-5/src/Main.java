import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner myObj = new  Scanner(System.in);
		System.out.println("Pandu Dhaulagiri - 124190044");
		Balok baru = new Balok();
		System.out.println("Masukan lebar: ");
		baru.setPanjang(myObj.nextDouble());
		baru.setLebar(myObj.nextDouble());
		baru.setTinggi(myObj.nextDouble());
		baru.setsemua();
		System.out.println(baru.alas);
		System.out.println(baru.sisi1);
		System.out.println(baru.sisi2);
		System.out.println(baru.volum);
		System.out.println(baru.luastotal);
		
		//Oh yeah, it's all coming together...
		
		
	}
}
