package models;

import java.util.ArrayList;
import entity.TransaksiEntity;

public class TransaksiModel
{
    private static ArrayList<TransaksiEntity> dataTransaksi = new ArrayList<>();

    public static ArrayList<TransaksiEntity> getListTransaksi() {
        return dataTransaksi;
    }

    public static void create(TransaksiEntity transaksi)
    {
        dataTransaksi.add(transaksi);
    }

    public static void update(TransaksiEntity transaksi, int index)
    {
        dataTransaksi.set(index, transaksi);
    }
    
    public static void delete(int index)
    {
        dataTransaksi.remove(index);
    }

    public static void cetakTransaksi()
    {
        for(TransaksiEntity transaksi : dataTransaksi)
        {
            transaksi.cetakTransaksi();
        }
    }
}
