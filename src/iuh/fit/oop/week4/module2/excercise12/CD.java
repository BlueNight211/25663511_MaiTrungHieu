package iuh.fit.oop.week4.module2.excercise12;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class CD {
	private int code;
	private String title;
	private int songNum;
	private double price;
	
	public CD() {
		this (999999,"undentified",0,0.0);
	}
	
	public CD(int code, String title, int songNum, double price) {
		if (code < 0) {
			this.code = 999999;
		}
		this.code = code;
		this.title = title;
		this.songNum = songNum;
		this.price = price;
	}

	public double getCode() {
		return code;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		if (title == null || title.isEmpty()) {
			this.title = "undentified";
		}
		this.title = title;
	}

	public int getSongNum() {
		return songNum;
	}

	public void setSongNum(int songNum) {
		if (songNum < 0) {
			this.songNum  = 0;
		}
		this.songNum = songNum;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if (price < 0) {
			this.price = 0;
		}
		this.price = price;
	}
	
	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#,##0 VND");
		Locale region = Locale.forLanguageTag("vi");
		NumberFormat nf = NumberFormat.getCurrencyInstance(region);
		return String.format("%s | %s | %s | %s"
				,code
				,title
				,songNum
				,nf.format(price));
	}
}
