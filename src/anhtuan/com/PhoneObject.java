package anhtuan.com;

public class PhoneObject {
	private int id;
	private String ten;
	private String trangThai;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getTrangThai() {
		return trangThai;
	}

	public void setTrangThai(String trangThai) {
		this.trangThai = trangThai;
	}
	
	
public PhoneObject(int id, String trangThai) {
		this.id = id;
		this.trangThai = trangThai;
	}

public void notifyCustom(String notif){
	System.out.println(getTen()+ " : " +  getId()+  "  co thong bao moi : "+ notif );
}
	public PhoneObject(int id, String ten, String trangThai) {

		this.id = id;
		this.ten = ten;
		this.trangThai = trangThai;
	}

	public PhoneObject() {

	}
	

}
