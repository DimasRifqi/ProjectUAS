package view;
import java.util.Scanner;
import controllers.BuatTransaksiController;

public class viewTransaksi 
{
    private Scanner input = new Scanner(System.in);
    private BuatTransaksiController objTransaksi = new BuatTransaksiController();
    int index = 0;
    public void cetakTransaksi()
    {
        int menu, jumlah, bayar;
        char lagi;
        
        do
        {
            System.out.println("==============================");
            System.out.println("       T R A N S A K S I      ");
            System.out.println("==============================");
            System.out.println("""
                    ------ M A K A N A N ------
                    [1]  PENTOL HALUS   RP 1500
                    [2]  PENTOL KASAR   RP 1500
                    [3]  PENTOL MERCON  RP 1500
                    [4]  PENTOL KEJU    RP 1500
                    [5]  PENTOL PUYUH   RP 1500
                    [6]  TAHU GORENG    RP 1000
                    [7]  SIOMAY         RP 1000
                    [8]  GORENGAN       RP 1000
                    ------ M I N U M A N ------
                    [9]  ES TEH         RP 2500
                    [10] ES JERUK       RP 2500
                    [11] TEH HANGAT     RP 2500
                    [12] JERUK HANGAT   RP 2500""");
            System.out.println("------------------------------");
            System.out.print("MASUKKAN PILIHAN SESUAI NOMER : ");
            menu = input.nextInt();
            input.nextLine();
            System.out.print("JUMLAH : ");
            jumlah = input.nextInt();
            input.nextLine();
            objTransaksi.switchMenu(menu, jumlah, index);
            System.out.println("------------------------------");
            objTransaksi.transaksi.cetakTransaksi();
            System.out.println("------------------------------");
            System.out.print("APAKAH ANDA INGIN PESAN LAGI (Y/T) : ");
            lagi = input.next().charAt(0);
            index++;
        }while(lagi == 'y' || lagi == 'Y');

        System.out.println("------------------------------");
        System.out.print("UANG BAYAR : ");
        bayar = input.nextInt();
        input.nextLine();
        objTransaksi.bayar(bayar);
    }
}
