package PetsManagement;

public class Pets_owner {
	
	int id;
	String owner_name;
	
	public Pets_owner(int id, String owner_name) {
		
		this.id = id;
		this.owner_name = owner_name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOwner_name() {
		return owner_name;
	}

	public void setOwner_name(String owner_name) {
		this.owner_name = owner_name;
	}

	
	
	

}
