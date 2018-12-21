class Test{

	public static void main(String args[]){
		Customer c= new Customer();
		c.recharge();
	}

}
class Customer{
	

	public void recharge(){
		Mobileshop m= new Mobileshop();
		m.dorecharge(120,"9177089503");
	}
}

class Mobileshop{

	public void dorecharge(int a, String b){
		System.out.println(b+" is recharged by Rs."+a);
	}

}

