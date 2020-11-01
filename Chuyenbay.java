package lab5;

import java.io.Serializable;

public class Chuyenbay implements Serializable {
	private static final long serialVersionUID = 1L;
	String soHieu;
	String ngayBay;
	String noiDi;
	String noiDen;
	String thoiGian;
	int ghe;
	int gheDaBan;
	int gheTrong;

	public String getSoHieu() {
		return soHieu;
	}

	public void setSoHieu(String soHieu) {
		this.soHieu = soHieu;
	}

	public String getNgayBay() {
		return ngayBay;
	}

	public void setNgayBay(String ngayBay) {
		this.ngayBay = ngayBay;
	}

	public String getNoiDi() {
		return noiDi;
	}

	public void setNoiDi(String noiDi) {
		this.noiDi = noiDi;
	}

	public String getNoiDen() {
		return noiDen;
	}

	public void setNoiDen(String noiDen) {
		this.noiDen = noiDen;
	}

	public String getThoiGian() {
		return thoiGian;
	}

	public void setThoiGian(String thoiGian) {
		this.thoiGian = thoiGian;
	}

	public int getGhe() {
		return ghe;
	}

	public void setGhe(int ghe) {
		this.ghe = ghe;
	}

	public int getGheDaBan() {
		return gheDaBan;
	}

	public void setGheDaBan(int gheDaBan) {
		this.gheDaBan = gheDaBan;
	}

	public int getGheTrong() {
		return gheTrong;
	}

	public void setGheTrong(int gheTrong) {
		this.gheTrong = gheTrong;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Chuyenbay(String soHieu, String ngayBay, String noiDi, String noiDen, String thoiGian, int ghe, int gheDaBan,
			int gheTrong) {
		super();
		this.soHieu = soHieu;
		this.ngayBay = ngayBay;
		this.noiDi = noiDi;
		this.noiDen = noiDen;
		this.thoiGian = thoiGian;
		this.ghe = ghe;
		this.gheDaBan = gheDaBan;
		this.gheTrong = gheTrong;
	}

	public Chuyenbay() {
		super();
	}

	@Override
	public String toString() {
		return "Chuyenbay [soHieu=" + soHieu + ", ngayBay=" + ngayBay + ", noiDi=" + noiDi + ", noiDen=" + noiDen
				+ ", thoiGian=" + thoiGian + ", ghe=" + ghe + ", gheDaBan=" + gheDaBan + ", gheTrong=" + gheTrong + "]";
	}

}
