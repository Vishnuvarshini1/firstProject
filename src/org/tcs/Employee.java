package org.tcs;

public class Employee {
public void manager() {
	System.out.println("Employee work on task1");
}
public void manager(int taskid) {
	System.out.println("Employee taskid:"+taskid);
}
public void manager(String taskname) {
	System.out.println("Employee assigned task Name"+taskname);
}
public void manager(String task,int clientid) {
	System.out.println("Employee assigned to task:"+ task+""+clientid);
}
public void manager(int clientid,String task){
	System.out.println("Employee clientid and task1"+ clientid+" ,"+task);
}
public static void main(String[] args) {
	Employee e = new Employee();
	e.manager("TASK1");
	e.manager("Task2",459);
	e.manager(1233,"TASk5");
	e.manager("TASK4",3465);
}
}

