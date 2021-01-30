package beans;



public class BookBean {
	private int bookid;
	private String bookname;
	private float price;
	private String bookpic_loc;
	private String bookotherinfo;
	private int amount;
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getBookpic_loc() {
		return bookpic_loc;
	}
	public void setBookpic_loc(String bookpic_loc) {
		this.bookpic_loc = bookpic_loc;
	}
	public String getBookotherinfo() {
		return bookotherinfo;
	}
	public void setBookotherinfo(String bookotherinfo) {
		this.bookotherinfo = bookotherinfo;
	}

}
