package car;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFile {
	
	public static void getCar(Cars car) throws IOException {
	File file = new File("src/Readme.txt");
	FileInputStream fis = new FileInputStream(file); // 创建文件输入流
	byte[] buffer = new byte[1024]; // 创建文件输入缓冲区
	ByteArrayOutputStream bos = new ByteArrayOutputStream();// 创建内存输出流
    int len;
    while((len=fis.read(buffer))!=-1)
	{ // 当整个循环结束后，文件中的内容就全部写入了缓冲区
		bos.write(buffer, 0, len);
		
	}	
   // System.out.println(bos);
	byte[] result = bos.toByteArray(); // 通过内存输出流把读到的内容放进字节数组
	String content = new String(result); // 通过字符型的数据存放结果，也就把文件中的内容赋值给了content变量
	//System.out.println(content);
	String[] res=content.split("\\=");	 
	if(car.getName().equals("jia")) {
	car.setDayOneCost(Double.parseDouble(res[1]));
	car.setDaytwoCost(Double.parseDouble(res[3]));
	car.setDayThrCost(Double.parseDouble(res[5]));
	car.setNightOneCost(Double.parseDouble(res[7]));
	car.setNightTwoCost(Double.parseDouble(res[9]));
	car.setNightThrCost(Double.parseDouble(res[11]));
	car.setFirdtDistance(Integer.parseInt(res[13].trim()));
	car.setSecondDistance(Integer.parseInt(res[15].trim()));
	car.setBoardingDayTime(Integer.parseInt(res[33].trim()));
	car.setBoardingDayTime(Integer.parseInt(res[35].trim()));
	}
	if(car.getName().equals("yi")){
		car.setDayOneCost(Double.parseDouble(res[17]));
		car.setDaytwoCost(Double.parseDouble(res[19]));
		car.setDayThrCost(Double.parseDouble(res[21]));
		car.setNightOneCost(Double.parseDouble(res[23]));
		car.setNightTwoCost(Double.parseDouble(res[25]));
		car.setNightThrCost(Double.parseDouble(res[27]));
		car.setFirdtDistance(Integer.parseInt(res[29].trim()));
		car.setSecondDistance(Integer.parseInt(res[31].trim()));
		car.setBoardingDayTime(Integer.parseInt(res[33].trim()));
		car.setBoardingDayTime(Integer.parseInt(res[35].trim()));
	}
}
}
