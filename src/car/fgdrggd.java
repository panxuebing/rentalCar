package car;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class fgdrggd {
	public static void main(String[] args) throws IOException {
		
	
		File file = new File("src/Readme.txt");
		FileInputStream fis = new FileInputStream(file); // �����ļ�������
		byte[] buffer = new byte[1024]; // �����ļ����뻺����
		ByteArrayOutputStream bos = new ByteArrayOutputStream();// �����ڴ������
	    int len;
	    while((len=fis.read(buffer))!=-1)
		{ // ������ѭ���������ļ��е����ݾ�ȫ��д���˻�����
			bos.write(buffer, 0, len);
			
		}
	    System.out.println(bos);
		byte[] result = bos.toByteArray(); // ͨ���ڴ�������Ѷ��������ݷŽ��ֽ�����
		String content = new String(result); // ͨ���ַ��͵����ݴ�Ž����Ҳ�Ͱ��ļ��е����ݸ�ֵ����content����
		System.out.println(content);
		System.out.println("1111"+content.split("\\=")[1]);
		
		String[] res=content.split("\\=");
		String[] res1=content.split("\\.");
		System.out.println();
		Cars car=new Cars();
		car.setDayOneCost(Double.parseDouble(res[1]));
		car.setDaytwoCost(Double.parseDouble(res[3]));
		car.setDayThrCost(Double.parseDouble(res[21]));
		System.out.println(car.dayThrCost);
		System.out.println(res1[0]);
		
		}

}
