package Interview_Program;

public class ChildAircraft extends ParentAircraft{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChildAircraft ct=new ChildAircraft();
		ct.bodycoulour();
		ct.logo();

	}

	@Override
	public void bodycoulour() {
		// TODO Auto-generated method stub
		System.out.println("Red");
	}

}
