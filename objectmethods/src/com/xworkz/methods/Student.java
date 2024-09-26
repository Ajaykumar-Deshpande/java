package com.xworkz.methods;

public class Student {

private String name;
private int usn;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getUsn() {
	return usn;
}
public void setUsn(int usn) {
	this.usn = usn;
}



@Override
public String toString() {
	return "[name=="+name+"usn=="+usn+"]";
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	
	Student other = (Student) obj;
	
	return this.name.equals(other.name)&&this.usn==other.usn;
	
}


@Override
public int hashCode() {

final int prim=20;

int result=1;

result=result*prim+((name==null)?0:name.hashCode());
result=result*prim+usn;
return result;
}

}