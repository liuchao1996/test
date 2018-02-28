package UDP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPClient {

	public static void main(String[] args) {

		//创建客户端的套接字对象
		DatagramSocket ds = null;
		
		try {
			ds = new DatagramSocket();
			
			//定义一个要发送的内容
			byte[] bs = "你好aaaaaaaaaaaaaaaaa".getBytes();
			
			//创建要发送的目的地的IP对象
		//	InetAddress ia = InetAddress.getByName("192.168.8.222");
			
			//打数据包
			DatagramPacket dp = new DatagramPacket(bs, bs.length, InetAddress.getByName("192.168.1.14") , 8088);	
			
			//发送
			ds.send(dp);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(ds != null) {
				ds.close();
			}
		}
		
		
	 
		
	}

}
