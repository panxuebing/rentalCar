package car;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class fgdrggd {
	public static void main(String[] args) throws IOException {
		
	
		File file = new File("src/Readme.txt");
		FileInputStream fis = new FileInputStream(file); // 创建文件输入流
		byte[] buffer = new byte[1024]; // 创建文件输入缓冲区
		ByteArrayOutputStream bos = new ByteArrayOutputStream();// 创建内存输出流
	    int len;
	    while((len=fis.read(buffer))!=-1)
		{ // 当整个循环结束后，文件中的内容就全部写入了缓冲区
			bos.write(buffer, 0, len);
			
		}
	    System.out.println(bos);
		byte[] result = bos.toByteArray(); 
		String content = new String(result); 
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
