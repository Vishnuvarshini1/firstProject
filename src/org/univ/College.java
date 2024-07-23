package org.univ;

public class College extends University {
@Override
public void ug() {
	System.out.println("Under Graduation");
}
@Override
public void pg() {
	System.out.println("Post Graduation");
}
public static void main(String[] args) {
	University u = new College();
	u.ug();
	u.pg();
}
}
