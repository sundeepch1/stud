package autowise.byname;

public class Employee {
	
	private Integer id;
	private String name;
	private String email;
	private PanCard card;
	
	public Employee(Integer id, String name, String email, PanCard card) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.card = card;
	}
	public PanCard getCard() {
		return card;
	}
	public void setCard(PanCard card) {
		this.card = card;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
