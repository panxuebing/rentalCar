package car;

import java.util.Calendar;
	
public class RentalCar {
	
	public void getCost(Cars cars,double distance) {
	// ��ȡСʱ��
	Calendar rightNow = Calendar.getInstance();
	int hour = rightNow.get(Calendar.HOUR_OF_DAY);
	// ��ȡ����
	int disLong = (int) Math.ceil(distance);
	// ��������㷨
	double costOne = cars.getDayOneCost();//14
	double costTwo = cars.getDaytwoCost() * (cars.getSecondDistance() - cars.getFirdtDistance());
	double costTwoNext = cars.getDaytwoCost() * (disLong - cars.getFirdtDistance());
	System.out.println(costTwoNext);
	double costThree = (disLong - cars.getSecondDistance()) * cars.getDayThrCost();
	// ҹ������㷨
	double costOneNight = cars.getNightOneCost();
	double costTwonNight = cars.getNightTwoCost() * (cars.getSecondDistance() - cars.getFirdtDistance());
	double costTwonNightNext = cars.getNightTwoCost() * (disLong - cars.getFirdtDistance());
	double costThreenNight = (disLong - cars.getSecondDistance()) * cars.getNightThrCost();
	double costDay = 0;
	double costNight = 0;
	
	System.out.println(disLong);
		// ��ȡ����
		if(cars.getBoardingDayTime()<hour&&hour<cars.getBoardingNightTime())
		{
			if (disLong > cars.getSecondDistance()) {
				costDay = costOne + costTwo + costThree;
				System.out.println("����10����" + costDay);

			} else if (disLong > cars.firdtDistance) {
				System.out.println(costOne+"hdhfdh"+costTwoNext);
				costDay = costOne + costTwoNext;
				System.out.println("����3����" + costDay);
			} else {
				costDay = cars.dayOneCost;
				System.out.println("û�г���3����" + costDay);
			}
		}else
		{
			if (disLong > cars.getSecondDistance()) {
				costNight = costOneNight + costTwonNight + costThreenNight;
				System.out.println("����10����" + costNight);

			} else if (disLong > cars.firdtDistance) {
				costNight = costOneNight + costTwonNightNext;
				System.out.println("����3����" + costNight);
			} else {
				costNight =costOneNight;
				System.out.println("û�г���3����" + costNight);
			}
		}
	}

	
}
