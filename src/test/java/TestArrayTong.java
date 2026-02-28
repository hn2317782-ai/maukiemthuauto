
import org.example.Tinhtong.tongArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestArrayTong {
    @Test
    void sumArrayBt() {
        assertEquals(500500, tongArray.tinhTong());
    }
    @Test
    void sumArrayBien() {
       long expected=1000*(1000+1)/2;
       assertEquals(expected,tongArray.tinhTong());
    }
    // kiểm tra tính đúng đắn của hàm tính tổng
    @Test
    void sumArrayct() {
        int n=1000;
        long expected=(long)n*(n+1)/2;
        assertEquals(expected,tongArray.tinhTong());
    }
    // só sánh 2 két quả kiemr tra tính ổn định
    @Test
    void sumArrayod() {
        long result1=tongArray.tinhTong();
        long result2=tongArray.tinhTong();
        assertEquals(result1,result2);
    }
    // test xem tổng co bị tràn k
    @Test
    void testtongtran(){
        long result=tongArray.tinhTong();
        assertTrue(result<Long.MAX_VALUE,"Tổng vượtquasas phạm vi của kiểu Long");
    }
}
