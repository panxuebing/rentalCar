package car;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class test {
	
	public static void main(String[] args) throws IOException {
		
	
	System.out.println("请输入车型：");
	 //RentalCar rentalCar=new RentalCar();
	 //ReadFile readFile=new ReadFile();
	// 输入距离
	
	Cars car=new Cars();
	Scanner str= new Scanner(System.in);
	 String carName=str.next();
	 if(carName.equals("jia")||carName.equals("yi")) {
		 car.setName(carName);
		 System.out.println(car.getName());
		  ReadFile.getCar(car);
		 //readFile.getCar(car);
		 System.out.println(car.getName());
		 RentalCar rentalCar=new RentalCar();
		 System.out.println("请输入距离");
		 Scanner dou= new Scanner(System.in);
		double distance=dou.nextDouble();
		 rentalCar.getCost(car,distance);
	 }else {
		 System.out.println("车型错误");
	 }
	
	
	 
	}
	 
	

}
