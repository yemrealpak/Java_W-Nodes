
public class LL {

	city head;
	city tail;
	
	public LL() {
		head = null;
		tail = null;
	}
	
	public void addHead (int plaka , String city_name , int neigcitynumber , String[] neigs) {
		city newCity = new city( plaka , city_name , neigcitynumber , neigs );
		if( empty() ) {
			newCity.next = head;
			head = newCity;
		}
		else {
			head = newCity;
			tail = newCity;
		}
		
	}
	
	public void addTail (int plaka , String city_name , int neigcitynumber , String[] neigs) {
		city newCity = new city( plaka , city_name , neigcitynumber , neigs );
		if( empty() ) {
			tail.next = newCity;
			tail = newCity;
		}
		else {
			head = newCity;
			tail = newCity;
		}
	}
	
	public void printList () {
		city pointer = head;
		int ccityNumber = 0;
		while( pointer != null ) {
			System.out.println(pointer.city_name );
			int i=0;
			for(i=0;i<pointer.neigcitynumber;i++) {
				System.out.println( (i+1) + ".komsu:" + pointer.neigs[i] );
			}
			
			pointer = pointer.next;
			ccityNumber++;
			
		}
		System.out.println("Eleman Sayýsý=" + ccityNumber );
	}
	
	public boolean empty() {
		if( head != null) {
			return true;
		}
		else {
			return false;
		}
	}
	
}
