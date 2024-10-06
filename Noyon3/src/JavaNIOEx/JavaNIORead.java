package JavaNIOEx;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class JavaNIORead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
try {
			
			Path path=Path.of("abd.txt");
			FileChannel fileChannel=FileChannel.open(path, StandardOpenOption.READ);
			ByteBuffer buffer=ByteBuffer.allocate(1024);
			
			fileChannel.read(buffer);
			buffer.flip();
			String result=new String(buffer.array(),0,buffer.limit());
			System.out.println("File content ="+result);
			
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
