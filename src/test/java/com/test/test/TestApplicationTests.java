package com.test.test;

//import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;;


@SpringBootTest
class TestApplicationTests {

	@Test
	void contextLoads() {
	}

	// Lớp đánh giá điểm thi
	public static boolean danhGiaDiem(int diemToan, int diemLy) {
		return (diemToan >= 70 && diemLy >= 70) || ((diemToan + diemLy) / 2 >= 80);
	}

	@Test
	public void testDanhGiaDiem_DuoiDiemToanVaLyYeuCau() {
		assertFalse(danhGiaDiem(65, 60));
	}

	@Test
	public void testDanhGiaDiem_TrenDiemToanVaLyYeuCau() {
		assertTrue(danhGiaDiem(75, 80));
	}

	@Test
	public void testDanhGiaDiem_TrenDiemTrungBinhYeuCau() {
		assertTrue(danhGiaDiem(85, 75));
	}

}
