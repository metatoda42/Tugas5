import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Main implements ActionListener {
	
	private static JLabel judul;
	private static JPanel panel;
	private static JTextField panjang;
	private static JTextField lebar;
	private static JTextField tinggi;
	private static JLabel labelpanjang;
	private static JLabel labellebar;
	private static JLabel labeltinggi;
	private static JLabel hasil;
	private static JLabel hluas1;
	private static JLabel hluas2;
	private static JLabel halas;
	private static JLabel volume;
	private static JLabel luaspermukaan;
	private static JButton hitung;
	private static JButton reset;
	private static JLabel hkel1;
	private static JLabel hkel2;
	private static JLabel hkelal;
	
	public static void main(String[] args) {
		
		//Komponen
		JFrame frame = new JFrame();
		judul = new JLabel("KALKULATOR BALOK \n\r");	
		panel = new JPanel();
		hasil = new JLabel("Hasil: ");
		panjang = new JTextField(20);
		lebar = new JTextField(20);
		tinggi = new JTextField(20);
		labelpanjang = new JLabel("Panjang: ");
		labellebar = new JLabel("Lebar: ");
		labeltinggi = new JLabel("Tinggi: ");
		hitung = new JButton("Hitung");
		hasil = new JLabel("Hasil: ");
		halas = new JLabel("Luas Alas: ");
		hluas1 = new JLabel("Persegi 1: ");
		hluas2 = new JLabel("Persegi 2: ");
		volume = new JLabel("Volume: ");
		luaspermukaan = new JLabel("Luas Permukaan: ");
		reset = new JButton("Reset");
		hkel1 = new JLabel("Kel. Persegi 1: ");
		hkel2 = new JLabel("Kel. Persegi 2: ");
		hkelal = new JLabel("Kel. Alas: ");
		
		//LAYOUT
		frame.setSize(350, 400);
		judul.setBounds(100, 0, 300, 60);
		labelpanjang.setBounds(10, 50, 80, 25);
		panjang.setBounds(80, 50, 200, 25);
		labeltinggi.setBounds(10, 75, 80, 25);
		tinggi.setBounds(80, 75, 200, 25);
		labellebar.setBounds(10, 100, 80, 25);
		lebar.setBounds(80, 100, 200, 25);
		hitung.setBounds(80, 125, 100, 25);
		hitung.addActionListener(new Main());
		reset.setBounds(180,125,100,25);
		reset.addActionListener(new Main());
		panel.setLayout(null);
		
		//MASUKAN KODE
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setTitle("AAAAAAAAA");
		frame.add(panel);
		panel.add(judul);
		panel.add(labeltinggi);
		panel.add(tinggi);
		panel.add(labellebar);
		panel.add(lebar);
		panel.add(labeltinggi);
		panel.add(tinggi);
		panel.add(labelpanjang);
		panel.add(panjang);
		panel.add(hitung);
		panel.add(reset);
		panel.add(hasil);
		panel.add(hluas1);
		panel.add(hluas2);
		panel.add(hkel1);
		panel.add(hkel2);
		panel.add(hkelal);
		panel.add(volume);
		panel.add(luaspermukaan);
	}
	public static void infoBox(String error, String judul){
        JOptionPane.showMessageDialog(null, error, "InfoBox: " + judul, JOptionPane.INFORMATION_MESSAGE);
    }
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == hitung) {
			try {
				Double.parseDouble(panjang.getText());
			}
			catch(Exception n1) {
				infoBox("Field Panjang Salah" + n1, "Terjadi Kesalahan");
			}
			
			try {
				Double.parseDouble(lebar.getText());
			}
			catch(Exception n2) {
				infoBox("Field Lebar Salah" + n2, "Terjadi Kesalahan");
			}
			
			try {
				Double.parseDouble(tinggi.getText());
			}
			catch(Exception n3) {
				infoBox("Field Tinggi Salah" + n3, "Terjadi Kesalahan");
			}
			
			double p = Double.parseDouble(panjang.getText());
			double l = Double.parseDouble(lebar.getText());
			double t = Double.parseDouble(tinggi.getText());
			Balok baru = new Balok();
			baru.setPanjang(p);
			baru.setLebar(l);
			baru.setTinggi(t);
			baru.setsemua();
			
			hasil.setText("Hasil: ");
			halas.setText("Luas Alas: " + baru.alas);
			hluas1.setText("Luas P.Panjang 1: " + baru.sisi1);
			hluas2.setText("Luas P.Panjang 2: "+ baru.sisi2);
			volume.setText("Volume: " + baru.volum);
			luaspermukaan.setText("Luas Permukaan: " + baru.luastotal);
			hkel1.setText("Kel. Persegi 1: " + baru.kel1);
			hkel2.setText("Kel. Persegi 2: " + baru.kel2);
			hkelal.setText("Kel. Alas: " + baru.kelal);
			
			hasil.setBounds(10, 150, 200, 25);
			halas.setBounds(10, 150, 200, 25);
			hluas1.setBounds(10, 175, 200, 25);
			hluas2.setBounds(10, 200, 200, 25);
			volume.setBounds(10, 225, 200, 25);
			luaspermukaan.setBounds(10, 250, 200, 25);
			hkel1.setBounds(10, 275, 200, 25);
			hkel2.setBounds(10, 300, 200, 25);
			hkelal.setBounds(10, 325, 200, 25);
		}
		else {
			hasil.setText("");
			halas.setText("");
			hluas1.setText("");
			hluas2.setText("");
			volume.setText("");
			luaspermukaan.setText("");
			hkel1.setText("");
			hkel2.setText("");
			hkelal.setText("");
			
		}
	}
	//Oh yeah, it's all coming together...
}

