package entity;
import java.util.ArrayList;


public class TransaksiEntity
{
    private int id;
    private int totalBayar = 0;
    private int bayar; 
    private int kembali = 0;

    private ArrayList<ProdukEntity> produkBeli = new ArrayList<>();
    private int[] jumlah = new int[15];

    public TransaksiEntity(int id)
    {
        this.id = id;
    }

    public void setBayar(int bayar) {
        this.bayar = bayar;
    }

    public void setJumlah(int index, int jumlah) {
        this.jumlah[index] = jumlah;
    }

    public int getJumlah(int index) {
        return jumlah[index];
    }

    public void tambahProdukBeli(ProdukEntity produk)
    {
        produkBeli.add(produk);
    }

    public void cetakTransaksi()
    {
        totalBayar = 0;
        System.out.println("==============================");

        for(int i=0; i<produkBeli.size(); i++)
        {
            ProdukEntity produk = produkBeli.get(i);
            if((jumlah[i] != 0) && (produk != null))
            {
                int total = 0;

                if(produk instanceof PentolEntity)
                {
                    PentolEntity pentol = (PentolEntity) produk;
                    total = pentol.getHarga() * jumlah[i];
                    totalBayar += total;
                }
                else if(produk instanceof TahuEntity)
                {
                    TahuEntity tahu = (TahuEntity) produk;
                    total = tahu.getHarga() * jumlah[i];
                    totalBayar += total;
                }
                if(produk instanceof SiomayEntity)
                {
                    SiomayEntity siomay = (SiomayEntity) produk;
                    total = siomay.getHarga() * jumlah[i];
                    totalBayar += total;
                }
                if(produk instanceof GorenganEntity)
                {
                    GorenganEntity gorengan = (GorenganEntity) produk;
                    total = gorengan.getHarga() * jumlah[i];
                    totalBayar += total;
                }
                if(produk instanceof MinumanEntity)
                {
                    MinumanEntity minuman = (MinumanEntity) produk;
                    total = minuman.getHarga() * jumlah[i];
                    totalBayar += total;
                }

                utils.Struk.cetakStruk(produk.getNama(), jumlah[i], produk.getHarga(), total);
            }
        }
        System.out.println("------------------------------");
        System.out.println("Total Bayar : "+totalBayar);
    }

    public void cetakTransaksi2()
    {
        kembali = bayar - totalBayar;
        System.out.println("Uang Bayar  : "+bayar);
        System.out.println("Kembali     : "+kembali);
    }
}
