package controllers;
import entity.GorenganEntity;
import entity.MinumanEntity;
import entity.PentolEntity;
import entity.SiomayEntity;
import entity.TahuEntity;
import entity.TransaksiEntity;
import view.viewTransaksi;

public class BuatTransaksiController
{
    private int id = models.TransaksiModel.getListTransaksi().size() + 1;
    public TransaksiEntity transaksi = new TransaksiEntity(id);

    public void toView()
    {
        viewTransaksi objekTransaksi = new viewTransaksi();
        objekTransaksi.cetakTransaksi();
    }

    public void switchMenu(int menu, int jumlah, int index)
    {
        switch(menu)
        {
            case 1:
                PentolEntity pentolHalus = new PentolEntity("Pentol Halus", 1500);
                pentolHalus.setTotal(pentolHalus.getHarga()*jumlah);
                transaksi.setJumlah(index, jumlah);
                transaksi.tambahProdukBeli(pentolHalus);
                break;
            case 2:
                PentolEntity pentolKasar = new PentolEntity("Pentol Kasar", 1500);
                pentolKasar.setTotal(pentolKasar.getHarga()*jumlah);
                transaksi.setJumlah(index, jumlah);
                transaksi.tambahProdukBeli(pentolKasar);
                break;
            case 3:
                PentolEntity pentolMercon = new PentolEntity("Pentol Mercon", 1500);
                pentolMercon.setTotal(pentolMercon.getHarga()*jumlah);
                transaksi.setJumlah(index, jumlah);
                transaksi.tambahProdukBeli(pentolMercon);
                break;
            case 4:
                PentolEntity pentolKeju = new PentolEntity("Pentol Keju", 1500);
                pentolKeju.setTotal(pentolKeju.getHarga()*jumlah);
                transaksi.setJumlah(index, jumlah);
                transaksi.tambahProdukBeli(pentolKeju);
                break;
            case 5:
                PentolEntity pentolPuyuh = new PentolEntity("Pentol Puyuh", 1500);
                pentolPuyuh.setTotal(pentolPuyuh.getHarga()*jumlah);
                transaksi.setJumlah(index, jumlah);
                transaksi.tambahProdukBeli(pentolPuyuh);
                break;
            case 6:
                TahuEntity tahu = new TahuEntity("Tahu Goreng", 1000);
                tahu.setTotal(tahu.getHarga()*jumlah);
                transaksi.setJumlah(index, jumlah);
                transaksi.tambahProdukBeli(tahu);
                break;
            case 7:
                SiomayEntity siomay = new SiomayEntity("Siomay", 1000);
                siomay.setTotal(siomay.getHarga()*jumlah);
                transaksi.setJumlah(index, jumlah);
                transaksi.tambahProdukBeli(siomay);
                break;
            case 8:
                GorenganEntity gorengan = new GorenganEntity("Gorengan", 1000);
                gorengan.setTotal(gorengan.getHarga()*jumlah);
                transaksi.setJumlah(index, jumlah);
                transaksi.tambahProdukBeli(gorengan);
                break;
            case 9:
                MinumanEntity esTeh = new MinumanEntity("Es Teh", 2500);
                esTeh.setTotal(esTeh.getHarga()*jumlah);
                transaksi.setJumlah(index, jumlah);
                transaksi.tambahProdukBeli(esTeh);
                break;
            case 10:
                MinumanEntity esJeruk = new MinumanEntity("Es Jeruk", 2500);
                esJeruk.setTotal(esJeruk.getHarga()*jumlah);
                transaksi.setJumlah(index, jumlah);
                transaksi.tambahProdukBeli(esJeruk);
                break;
            case 11:
                MinumanEntity tehHangat = new MinumanEntity("Teh Hangat", 2500);
                tehHangat.setTotal(tehHangat.getHarga()*jumlah);
                transaksi.setJumlah(index, jumlah);
                transaksi.tambahProdukBeli(tehHangat);
                break;
            case 12:
                MinumanEntity jerukHangat = new MinumanEntity("Jeruk Hangat", 2500);
                jerukHangat.setTotal(jerukHangat.getHarga()*jumlah);
                transaksi.setJumlah(index, jumlah);
                transaksi.tambahProdukBeli(jerukHangat);
                break;
        }
    }

    public void bayar(int nominal)
    {
        transaksi.setBayar(nominal);
        models.TransaksiModel.getListTransaksi().add(transaksi);
        transaksi.cetakTransaksi();
        transaksi.cetakTransaksi2();
    }
}
