package PetsManagement;

public class pets {

	String pet_name;
	String pet_cat;
	int owner_id ;
	
	public pets(String pet_name, String pet_cat, int owner_id) {
		
		this.pet_name = pet_name;
		this.pet_cat = pet_cat;
		this.owner_id = owner_id;
	}
	
	public String getPet_name() {
		return pet_name;
	}
	public void setPet_name(String pet_name) {
		this.pet_name = pet_name;
	}
	public String getPet_cat() {
		return pet_cat;
	}
	public void setPet_cat(String pet_cat) {
		this.pet_cat = pet_cat;
	}
	public int getOwner_id() {
		return owner_id;
	}
	public void setOwner_id(int owner_id) {
		this.owner_id = owner_id;
	}
	
}
