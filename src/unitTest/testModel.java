package unitTest;

import org.junit.Test;

import entity.PentolEntity;
import entity.TransaksiEntity;

public class testModel
{
    @Test
    public void testCreateModel(){
        TransaksiEntity t = new TransaksiEntity(1);
        t.tambahProdukBeli(new PentolEntity("Pentol Halus", 1000));
        models.TransaksiModel.create(t);
        System.out.println(models.TransaksiModel.getListTransaksi().get(0));
    }
}
