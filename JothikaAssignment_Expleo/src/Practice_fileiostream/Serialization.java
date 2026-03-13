package Practice_fileiostream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

class Employee implements java.io.Serializable{
	public int id;
	public String Name;
	
	public Employee(int id,String Name) {
		this.id=id;
		this.Name=Name;
	}
	
}

public class Serialization {

	public static void main(String[] args) {
		Employee obj=new Employee(1,"Ram");
		String filename="file.ser";
try {
	FileOutputStream f=new FileOutputStream(filename);
	ObjectOutputStream op=new ObjectOutputStream(f);
	op.writeObject(obj);
	op.close();
	f.close();
	System.out.println("Object has been serialized");

	}
catch (IOException e) {
	System.out.println("IOException is caught");
}
Employee obj1=null;
try {
	FileInputStream f=new FileInputStream(filename);
	ObjectInputStream in= new ObjectInputStream(f);
	obj1=(Employee)in.readObject();
	in.close();
	f.close();
	System.out.println("Object is deseroialized");
	System.out.println("Employee ID=" +obj1.id + " \nEmployee Name=" +obj1.Name);
	
}
catch (IOException e) {
	System.out.println("IOException is caught");
}
catch (ClassNotFoundException e) {
	System.out.println("ClassNotFoundException");
}
	
		
		
	}

}
