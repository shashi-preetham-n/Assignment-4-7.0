public class BugFix{
 private int Bid;
  private String Bname;
  
  public int getBid() {
    return Bid;
}

public void setBid(int bid) {
    Bid = bid;
}

public String getBname() {
    return Bname;
}

public void setBname(String bname) {
    Bname = bname;
}

public BugFix(int bid, String bname) {
    this.Bid = bid;
    this.Bname = bname;
}

public static void main(String[]args){
 BugFix b=new BugFix(int "bid",String "bname");
 String change=" bid,bname"; 
  b.setBid(1);
  b.setBname("shashi");
  System.out.println(b.getBid());
  System.out.println(b.getBname());
  }}
