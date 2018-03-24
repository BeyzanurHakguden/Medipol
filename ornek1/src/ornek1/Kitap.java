package ornek1;

public class Kitap {
	private String kitapAdi;
	private String yazar;
	
public Kitap(String kitapAdi, String yazar) {
	super();
	this.kitapAdi = kitapAdi;
	this.yazar = yazar;
}
private void kitapOku() {
	System.out.println("Kitap okuyorum" + kitapAdi + " - " + yazar);
}
	
public static void main (String [] args) {
		Kitap kitap = new Kitap("Kitap 1", "Yazar 1");
		kitap.kitapOku();
	}
	

}
