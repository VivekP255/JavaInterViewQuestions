package shallowCopy;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {

		Student st1 = new Student();
		st1.rollNO = 10;
		Address ad = new Address();
		ad.houseNo = 622;
		st1.address = ad;
		
		
		//shallow copy
		Student st2 = (Student) st1.clone();
		st2.rollNO = 21;
		st2.address.houseNo=822;
		System.out.println(st1.rollNO + "---- " + st1.address.houseNo);
		System.out.println(st2.rollNO + "---- " + st2.address.houseNo);

		System.out.println(st1.address.hashCode() + "---------"+ st2.address.hashCode());
		
	}

}
