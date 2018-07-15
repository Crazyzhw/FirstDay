package day03.test;

public class IpUtil {

	public static long IpTs(String web) {
		String[] split = web.split("\\.");
		Long i1 =Long.valueOf(split[0]);
		Long i2 =Long.valueOf(split[1]);
		Long i3 =Long.valueOf(split[2]);
		Long i4 =Long.valueOf(split[3]);
		long ip = i4+(i3*256)+(i2*256*256)+(i1*256*256*256);
		return ip;
		
	}

}
