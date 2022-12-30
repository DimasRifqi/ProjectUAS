package controllers;
import view.viewHome;

public class HomeController
{
    public void toView()
    {
        viewHome objekHome = new viewHome();
        objekHome.cetakHome();
    }

    public void switchMenu(int menu)
    {
        switch(menu)
        {
            case 1:
                BuatTransaksiController buatTransaksiC = new BuatTransaksiController();
                buatTransaksiC.toView();
                break;
            case 2:
                RiwayatTransaksiController riwayatTransaksiC = new RiwayatTransaksiController();
                riwayatTransaksiC.toView();
                break;
        }
    }
}
