package view;

import controllers.RiwayatTransaksiController;

public class viewRiwayatTransaksi implements InterfaceMenu
{
    private RiwayatTransaksiController Riwayat = new RiwayatTransaksiController();

    public void cetakRiwayat()
    {
        System.out.println("===================================");
        System.out.println(" R I W A Y A T   T R A N S A K S I ");
        System.out.println("===================================");
        Riwayat.cetak();
        
    }
}
