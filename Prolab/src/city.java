
public class city {

	int plaka;
	String city_name;
	int neigcitynumber;
	String[] neigs;
	
	city prev;
	city next;

	public city (int plaka , String city_name , int neigcitynumber , String[] neigs) {
		this.plaka = plaka ;
		this.city_name = city_name ;
		this.neigcitynumber = neigcitynumber ;
		this.neigs = neigs;
		this.next = null;
	}
}
