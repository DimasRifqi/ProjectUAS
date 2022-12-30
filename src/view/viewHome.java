package view;

import java.util.Scanner;
import controllers.HomeController;

public class viewHome 
{
    private Scanner input = new Scanner(System.in);
    private HomeController objhome = new HomeController();

    public void cetakHome()
    {
        int menu;

        do
        {
            System.out.println("==============================");
            System.out.println("   B A K S O   S A R J A N A  ");
            System.out.println("==============================");
            System.out.println("""
                    [1] TRANSAKSI
                    [2] RIWAYAT TRANSAKSI
                    [0] KELUAR""");
            System.out.println("------------------------------");
            System.out.print("PILIH MENU : ");
            menu = input.nextInt();
            input.nextLine();
            objhome.switchMenu(menu);
        }while(menu != 0);
    }
}
