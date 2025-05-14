class Student {
	int id;
	String name;
	public Student(int x,String y){
	this.id=x;
	this.name=y;
	}
}
class Class2{
	public static void main(String args[]){
		Student ob= new Student(101,"Sasvinitha");
		System.out.println(ob.id+" " +ob.name);
}
}
	