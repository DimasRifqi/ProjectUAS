package entity;

public class PentolEntity extends ProdukEntity
{
    private int total;

    public PentolEntity(String nama, int harga)
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
    //     Struk.cetakStruk(getNama(), getHarga(), total);
    // }
}
