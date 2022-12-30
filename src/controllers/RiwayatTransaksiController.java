package controllers;

import view.viewRiwayatTransaksi;

public class RiwayatTransaksiController
{
    public void toView()
    {
        viewRiwayatTransaksi objekRiwayat = new viewRiwayatTransaksi();
        objekRiwayat.cetakRiwayat();
    }

    public void cetak()
    {
        models.TransaksiModel.cetakTransaksi();
    }
}
