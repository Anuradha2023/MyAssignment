package Week1.day2.Assinments;
public class TwoWheeler {
	int noOfheels = 2;
	short noOfMirrors = 2;
	long chassisNumber = 5647388378L;
	boolean isPunctured = false;
	String bikeName ="RX100";
	double runningKM =2556;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoWheeler obj = new TwoWheeler();
		System.out.println("NoOfheels:"+obj.noOfheels);
		System.out.println("NoOfMirrors:"+obj.noOfMirrors);
		System.out.println("chassisNumber:"+obj.chassisNumber);
		System.out.println("Puncture status:"+obj.isPunctured);
		System.out.println("Bike Name:"+obj.bikeName);
		System.out.println("RunningKM:"+obj.runningKM);
	}

}
