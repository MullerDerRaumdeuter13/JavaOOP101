package JavaOOP101;

public class TestAuthor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Author Poe = new Author("Edgar Allan Poe", "ThisISPOExdxd@gmail.com", 'm');
		System.out.println(Poe);
		Poe.setEmail("dirtypoexxx@hotmail.com");
		System.out.println("name: " + Poe.getName());
		System.out.println("email: " + Poe.getEmail());
		System.out.println("gender: " + Poe.getGender());

	}

}
