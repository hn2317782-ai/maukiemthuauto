import org.example.entity.SinhVien;
import org.example.entity.SinhVienService;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestSV {
    protected static SinhVien sv;
    protected static SinhVienService sinhVienService ;
    @BeforeAll
    public static void setUpClass() {
        sinhVienService = new SinhVienService();
    }
    @Test
    void testSVbt() {
         sv=new SinhVien(
                 "sv1",
                 "Nguyen Van A",
                 19,
                 7.5F,
                 3,
                 "CNTT");
         sinhVienService.updatesv(sv);
         assertEquals(7.5F,sinhVienService.getSinhVien().getDiem());
    }
    @Test
    void testdbienduoi(){
        sv=new SinhVien(
                "sv1",
                "Nguyen Van A",
                19,
                -1F,
                3,
                "CNTT");
        Exception exception=assertThrows(IllegalArgumentException.class, ()->{sinhVienService.updatesv(sv);});
        assertEquals("diem sv phải tư 0 đến 10",exception.getMessage());
    }
    @Test
    void testdbientren(){
        sv=new SinhVien(
                "sv1",
                "Nguyen Van A",
                19,
                11F,
                3,
                "CNTT"
        );
        Exception exception=assertThrows(IllegalArgumentException.class, ()->{sinhVienService.updatesv(sv);});
        assertEquals("diem sv phải tư 0 đến 10",exception.getMessage());
    }
    @Test
    void testdtaibien(){
        sv=new SinhVien(
                "sv1",
                "Nguyen Van A",
                19,
                0F,
                3,
                "CNTT"
        );
        sinhVienService.updatesv(sv);
        assertEquals(0F,sinhVienService.getSinhVien().getDiem());
    }
    @Test
    void testdtaibient(){
        sv=new SinhVien(
                "sv1",
                "Nguyen Van A",
                19,
                10F,
                3,
                "CNTT"
        );
        sinhVienService.updatesv(sv);
        assertEquals(10F,sinhVienService.getSinhVien().getDiem());
    }

}
