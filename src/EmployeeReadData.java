import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
public class EmployeeReadData {
	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("alia.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Object o = ois.readObject();
		if (o instanceof Employee) {
			Employee e= (Employee) o;
			System.out.println(e.name+_" "+ e.id+);
		}
	}

}
