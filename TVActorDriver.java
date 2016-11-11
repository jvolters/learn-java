public class TVActorDriver{
	public static void main(String[] args){
		TVActor a = new TVActor();
		a.name="Thomas Middleditch";
		a.role="Richard Hendricks";
		a.salary=1500000;
		
		TVActor b = new TVActor();
		b.name="Martin Starr";
		b.role="Bertram Gilfoyle";
		b.salary=1250000;
		
		TVActor c = new TVActor();
		c.name="Kumail Nanjiani";
		c.role="Dinesh Chugtai";
		c.salary=2750000;
		
		System.out.println(a.name + " played " + a.role + " and earned $"+a.salary);// added  + " and earned $"+a.salary as study drill
		System.out.println(b.name + " played " + b.role + " and earned $"+b.salary);
		System.out.println(c.name + " played " + c.role + " and earned $"+c.salary);
	}
}
/*
And so the instance named a has a copy of the name variable and a copy of the role variable. 
We can put values into a’s copies of these variables as shown on lines 4 and 5, though we’ll 
see later in the book that this is considered bad style.
Line 7 creates another instance as does line 11.
*/