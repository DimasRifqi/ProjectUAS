package utils;

public class Struk
{
    public static void cetakStruk(String nama, int jumlah, int harga, int total)
    {
        System.out.print(jumlah);

        if(jumlah > 9)
        {
            System.out.print(" ");
        }
        else
        {
            System.out.print("  ");
        }

        int panjang = nama.length();

        System.out.print(nama);

        for(int i=panjang; i<=16; i++)
        {
            System.out.print(" ");
        }

        System.out.println(harga+"   "+total);
    }
}
