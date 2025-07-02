package Interview_Program;

public class IndianTraffic implements CentralTraffic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IndianTraffic traffic=new IndianTraffic();
		traffic.greenGo();
		traffic.flashYellow();
		traffic.redStop();
	}

	@Override
	public void greenGo() {
		// TODO Auto-generated method stub
		System.out.println("Green means Go");
	}

	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		System.out.println("Red means stop");	
	}

	@Override
	public void flashYellow() {
		// TODO Auto-generated method stub
		System.out.println("yellow means start to wakeup");
	}

}
