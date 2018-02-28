package UDP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPServer {

	public static void main(String[] args) {

		// 创建UDP服务器端的对象，必须制定端口
		DatagramSocket ds = null;
		try {
			ds = new DatagramSocket(8088);
			// 定义接收数据的字节数组
			byte[] bs = new byte[1024];
			// 定义接收的数据包
			DatagramPacket dp = new DatagramPacket(bs, bs.length);
			System.out.println("服务器已经启动");
			//数据包的接收
			ds.receive(dp);
			System.out.println("服务器已接收");
			//获得发送端的IP
			InetAddress ia = dp.getAddress();
			
			//获得数据包中的数据
			byte[]  bs1 = dp.getData();
			
			//获得实际的数据的长度
			int len = dp.getLength();
			
			//组装接收的数据
			String data = new String(bs1,0,len);
			System.out.println(ia.getHostAddress()+"接收了:"+data);
		    
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
             if(ds != null) {
            	 ds.close();
             }
		}

	}

}
