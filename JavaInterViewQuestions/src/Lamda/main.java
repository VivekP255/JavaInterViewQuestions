package Lamda;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("My System starts");
		MyInter inter = (x, y) -> x + y;
		System.out.println(inter.sayHello(5, 4));
		Runnable thread = () -> System.out.println("Creating thread by Lamba expression");
		Thread th = new Thread(thread);
		th.setDaemon(true);
		th.start();
		System.out.println(th.currentThread().getName());
		th.currentThread().setName("VivekThread");
		System.out.println(th.currentThread().getName());
		System.out.println(th.currentThread().isDaemon());
		th.stop();
		th.currentThread().setPriority(10);
		System.out.println(th.currentThread().getPriority());
		System.out.println(th.currentThread().getId());

	}

}
