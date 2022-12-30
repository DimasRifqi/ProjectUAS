package entity;

public class TahuEntity extends ProdukEntity
{
    private int total;

    public TahuEntity(String nama, int harga)
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
