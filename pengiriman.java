package tugasKu;
import javax.swing.JOptionPane;

/**
*
* @author iNu
*/
public class pengiriman extends paket {
public pengiriman(){
}

public static void main(String args[]){
pengiriman inu = new pengiriman();

String nmPengirim=JOptionPane.showInputDialog(“Biaya Pengiriman Paket” +
“\n Inputkan Nama Pengirim “);
inu.setNmPengirim(nmPengirim);
String tujuanPaket=JOptionPane.showInputDialog(“Biaya Pengiriman Paket” +
“\n Inputkan Tujuan paket : Balikpapan | Surabaya | Jakarta | Bandung”);
inu.setTujuanPaket(tujuanPaket);
String br=JOptionPane.showInputDialog(“Biaya Pengiriman Paket” +
“\n Inputkan Barat paket :”);
int beratPaket=Integer.parseInt(br);
inu.setBeratPaket(beratPaket);
inu.biayaPerKg();
inu.Bayar();

JOptionPane.showMessageDialog(null,”Biaya Pengiriman Paket Adalah” +
“\n Nama Pengirirm : “+inu.getNmPengirim()+
“\n Tujuan paket : “+inu.getTujuanPaket()+
“\n Berat paket : “+inu.getBeratPaket()+” Kg”+
“\n Biaya Per Kg : “+inu.biayaPerKg()+
“\n Total Bayar : “+inu.Bayar()+
“\n Terima Kasih….. ^_^ “);

}
}
