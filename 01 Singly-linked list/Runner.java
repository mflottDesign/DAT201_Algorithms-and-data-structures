
public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleLink sl = new SingleLink();
		Person p = new Person();
		p.setName("Ola");
		sl.addLast(p);
		p = new Person();
		p.setName("Hans");
		sl.addLast(p);
	}

}
