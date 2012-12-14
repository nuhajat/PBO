public class Orang {
  public String nama;
	public String alamat;

	//Constructor...
	public Orang(){
		}

    public Orang(String nama) {
    	this.nama = nama;
    }
    public Orang(String nama,String alamat){
    	this.nama=nama;
    	this.alamat=alamat;
    }
    //accessor method mengembalikan nilai
    public String getName(){
    	return nama;
    	}
    //mutator methode untuk mengubah nilai dari instance.
   public void setName(String nama){
   		this.nama = nama;
   	}
}
