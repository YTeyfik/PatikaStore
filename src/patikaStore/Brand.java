package patikaStore;

public class Brand implements Comparable<Brand>{
	private int id;
	private String name;
	@Override
	public int compareTo(Brand o) {
		return this.getName().compareTo(o.getName());
	}
	public Brand(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
