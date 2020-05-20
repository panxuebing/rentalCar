package car;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFile {
	
	public static void getCar(Cars car) throws IOException {
	File file = new File("src/Readme.txt");
	FileInputStream fis = new FileInputStream(file); // �����ļ�������
	byte[] buffer = new byte[1024]; // �����ļ����뻺����
	ByteArrayOutputStream bos = new ByteArrayOutputStream();// �����ڴ������
    int len;
    while((len=fis.read(buffer))!=-1)
	{ // ������ѭ���������ļ��е����ݾ�ȫ��д���˻�����
		bos.write(buffer, 0, len);
		
	}	
   // System.out.println(bos);
	byte[] result = bos.toByteArray(); // ͨ���ڴ�������Ѷ��������ݷŽ��ֽ�����
	String content = new String(result); // ͨ���ַ��͵����ݴ�Ž����Ҳ�Ͱ��ļ��е����ݸ�ֵ����content����
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
