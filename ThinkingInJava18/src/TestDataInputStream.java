import java.io.*;

public class TestDataInputStream {
	public static void main(String[] args) {
		ByteArrayOutputStream bos=new ByteArrayOutputStream();
		DataOutputStream dos=new DataOutputStream(bos);
		try {
			dos.writeDouble( Math.random());
			dos.writeBoolean(true);
			ByteArrayInputStream bis=new ByteArrayInputStream(bos.toByteArray());
			System.out.println(bis.available());
			DataInputStream dis=new DataInputStream(bis);
			System.out.println(dis.readInt());
			System.out.println(dis.readBoolean());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
