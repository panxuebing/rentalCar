package car;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class test {
	
	public static void main(String[] args) throws IOException {
		
	
	System.out.println("�����복�ͣ�");
	 //RentalCar rentalCar=new RentalCar();
	 //ReadFile readFile=new ReadFile();
	// �������
	
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
		 System.out.println("���������");
		 Scanner dou= new Scanner(System.in);
		double distance=dou.nextDouble();
		 rentalCar.getCost(car,distance);
	 }else {
		 System.out.println("���ʹ���");
	 }
	
	
	 
	}
	 
	

}
