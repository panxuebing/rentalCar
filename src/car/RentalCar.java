package car;

import java.util.Calendar;
	
public class RentalCar {
	
	public void getCost(Cars cars,double distance) {
	// 获取小时数
	Calendar rightNow = Calendar.getInstance();
	int hour = rightNow.get(Calendar.HOUR_OF_DAY);
	// 获取距离
	int disLong = (int) Math.ceil(distance);
	// 白天费用算法
	double costOne = cars.getDayOneCost();//14
	double costTwo = cars.getDaytwoCost() * (cars.getSecondDistance() - cars.getFirdtDistance());
	double costTwoNext = cars.getDaytwoCost() * (disLong - cars.getFirdtDistance());
	System.out.println(costTwoNext);
	double costThree = (disLong - cars.getSecondDistance()) * cars.getDayThrCost();
	// 夜里费用算法
	double costOneNight = cars.getNightOneCost();
	double costTwonNight = cars.getNightTwoCost() * (cars.getSecondDistance() - cars.getFirdtDistance());
	double costTwonNightNext = cars.getNightTwoCost() * (disLong - cars.getFirdtDistance());
	double costThreenNight = (disLong - cars.getSecondDistance()) * cars.getNightThrCost();
	double costDay = 0;
	double costNight = 0;
	
	System.out.println(disLong);
		// 获取费用
		if(cars.getBoardingDayTime()<hour&&hour<cars.getBoardingNightTime())
		{
			if (disLong > cars.getSecondDistance()) {
				costDay = costOne + costTwo + costThree;
				System.out.println("超过10公里" + costDay);

			} else if (disLong > cars.firdtDistance) {
				System.out.println(costOne+"hdhfdh"+costTwoNext);
				costDay = costOne + costTwoNext;
				System.out.println("超过3公里" + costDay);
			} else {
				costDay = cars.dayOneCost;
				System.out.println("没有超过3公里" + costDay);
			}
		}else
		{
			if (disLong > cars.getSecondDistance()) {
				costNight = costOneNight + costTwonNight + costThreenNight;
				System.out.println("超过10公里" + costNight);

			} else if (disLong > cars.firdtDistance) {
				costNight = costOneNight + costTwonNightNext;
				System.out.println("超过3公里" + costNight);
			} else {
				costNight =costOneNight;
				System.out.println("没有超过3公里" + costNight);
			}
		}
	}

	
}
