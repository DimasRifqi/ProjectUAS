package entity;

public class GorenganEntity extends ProdukEntity
{
    private int total;

    public GorenganEntity(String nama, int harga)
    {
        super.setNama(nama);
        super.setHarga(harga);
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    // public void cetak()
    // {
    //     utils.Struk.cetakStruk(getNama(), jumlah, getHarga(), total);
    // }
}
