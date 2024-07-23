package org.add;

public class AlRightTech {
	public void alRightOmr(String name) {
		System.out.println("Branch Name:"+name);
	}
	public void alRightOmr(int id,long phno) {
		System.out.println("Branch Id:"+id +","+"Phone number:"+phno);
	}
	public void alRightOmr(long phno1,int id) {
		System.out.println("alternate phonenumber:"+phno1+","+"Client id:"+id);
	}

	public static void main(String[] args) {
		AlRightTech art = new AlRightTech();
		art.alRightOmr("Supereme Branch");
		art.alRightOmr(25, 9846362525262l);
		art.alRightOmr(6464646311L, 25);
			}
}
//string name Main branch
//int branch id long phno
//long branch phonum int branchid
//