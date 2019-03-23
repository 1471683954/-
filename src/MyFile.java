import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class MyFile {
    public static void main(String[] args) throws Exception {
    file();
    }
    public static void file() throws Exception {
        FileChannel channel = new FileOutputStream("1.txt").getChannel();

        channel.write(ByteBuffer.wrap("潘顺祥".getBytes()));

        channel.close();

        FileChannel channel1 = new FileInputStream("1.txt").getChannel();
        ByteBuffer buffer =ByteBuffer.allocate(1024);
        channel1.read(buffer);
        buffer.put("dsadsa".getBytes());
        buffer.flip();
        while (buffer.hasRemaining())
        System.out.println(buffer.get());

    }
}
