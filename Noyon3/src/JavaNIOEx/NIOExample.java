package JavaNIOEx;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class NIOExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			
			Path path=Path.of("abd.txt");
			FileChannel fileChannel=FileChannel.open(path, StandardOpenOption.CREATE,StandardOpenOption.WRITE);
			String content ="Hello Bangladesah,This is ADDIE";
			ByteBuffer buffer=ByteBuffer.allocate(1024);
			buffer.put(content.getBytes());
			buffer.flip();
			fileChannel.write(buffer);	
			System.out.println("Data write Successfully");
			
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
	}

}
