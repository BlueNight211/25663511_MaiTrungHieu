package iuh.fit.oop.week4.module2.excercise12;

public class CDList {
	private CD[] list;
	
	public CDList() {
		this(20);
	}
	
	public CDList(int capacity) {
		if (capacity <= 0) {
			capacity = 20;
		}
		this.list = new CD[capacity];
	}
	
	public int size() {
		for (int i = 0; i < list.length; i++) {
			if (list[i] == null) {
				return i;
		    }
		}
		return list.length;
	}
	
	public boolean isEmpty() {
		return size() == 0;
	}
	
	public boolean isFull() {
		return size() == list.length;
	}
	
	@Override
	public String toString() {
		String s = "";
		for (int i = 0; i < size(); i++) {
			s += list[i].toString() + "\n";
		}
		return s;
	}
	
	public CD[] getList() {
		if (size() == 0) {
			return null;
		}
		CD[] tmp = new CD[size()];
		for (int i = 0; i < tmp.length; i++) {
			tmp[i] = list[i];
		}
		return tmp;
	}
	
	public boolean addCD(CD cd) {
		if (cd == null) {
			return false;
		}
		
		for (int i = 0; i < size(); i++) {
			if (list[i].getCode() == cd.getCode()) {
				return false;
			}
		}
		if (size() == list.length) {
			int newSize = (int)(1.5 * size());
			CD[] tmp = new CD[newSize];
			for (int i = 0; i < tmp.length; i++) {
				tmp[i] = list[i];
			}
			this.list = tmp;
		}
		return true;
	}
	
	public boolean removeCD(int code) {
		if (code < 0) {
			return false;
		}
		
		for (int i = 0; i < size(); i++) {
			if (list[i].getCode() == code) {
				for (int j = i;j< size() - 1;j++) {
					list[j] = list[j + 1];
				}
				this.list[size()-1] = null;
				return true;
			}
		}
		return false;
	}
	public CD findTitle(String key) {
		if (key == null || key.isEmpty()) {
			return null;
		}
		CD[] tmp = new CD[size()];
		int c = 0;
		for (int i =0 ;i<size();i++) {
			if (list[i].getTitle().toUpperCase()
					.contains(key.toUpperCase())) {
				tmp[c++] = list[i];
			}
		}
		return null;
	}
	
	public double avgTB() {
		double sum = 0;
		int c = 0;
		for (int i = 0; i < size(); i++) {
			sum += list[i].getPrice();
			c++;
		}
		return c == 0 ? 0 : sum/c;
	}
	
	public CD[] getCDListMaxNumSongs() {
		if (size() == 0) {
			return null;
		}
		int maxValue = list[0].getSongNum();
		for (int i = 0; i < list.length; i++) {
			if(list[i].getSongNum() > maxValue) {
				maxValue = list[i].getSongNum();
			}
		}
		CD[] tmp = new CD[size()];
		int c = 0;
		for (int i = 0; i < tmp.length; i++) {
			if(list[i].getSongNum() == maxValue) {
				tmp[c++] = list[i];
			}
		}
		CD[] r = new CD[size()];
		for (int i = 0; i < r.length; i++) {
			r[i] = tmp[i];
		}
		return r;
	}
}
