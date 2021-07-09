import java.io.ObjectOutputStream;

public class WriteData {
public static void main(String[]args) throws IOException{
	Employee e= new Employee();
	e.id =007;
	e.name = "Ankur";
	e.profile = "SDET";
	e.salary = 7000;
	e.dept = "Testing";
	e.phone = 123456789;
	FileOutputStream fos = new FileOutputStream("alia.txt");
	ObjectOutputStream oos = new ObjectOutputStream(fos);
	oos.writeObject(e);
	fos.close();
	oos.close();
	System.out.println("App End");
}














}
