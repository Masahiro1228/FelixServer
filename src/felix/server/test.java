package felix.server;


import java.net.InetAddress;
import java.util.Map;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(System.getProperty("user.dir"));
		Map<String,String> map = System.getenv();//调用系统的方法来获取计算机信�?
	    System.out.println(map);
	    //System.out.println(InetAddress.getLocalHost());
	  //  System.out.println(InetAddress.getLocalHost().getHostAddress().toString());
	}

}
