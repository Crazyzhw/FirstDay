package cn.edu360.javase35.day07;
/**
 * 标题：平方十位数
		由0~9这10个数字不重复、不遗漏，可以组成很多10位数字。
		这其中也有很多恰好是平方数（是某个数的平方）。
		比如：1026753849，就是其中最小的一个平方数。
		请你找出其中最大的一个平方数是多少？
		注意：你需要提交的是一个10位数字，不要填写任何多余内容。
 解答方法：枚举：枚举范围可以确定为：[1026753849,9999999999]，判断区间内每一个数是否包含0~9这九个数字；
		这样的枚举变量范围太大，可以改变枚举变量——枚举平方数的平方根；
		可以确定平方根枚举范围为：[30000,100000]，平方后判断是否包含0~9这九个数字。
		判断平方数是否包含0~9的方法：
		设置数组arr[10]（初始化为0），每次取平方数的个位数d，判断arr[d]是否等于1，等于1说明之前存在数d，立即返回false；
		否则将add[d]=1；若平方数有机会小于0（即10位数字都没有重复），则可以返回true；
 */
public class PinFanShu {
	    
	    static boolean Judge(long num) {    //判断此平方数是否包含0~9
	        int arr[]= {0,0,0,0,0,0,0,0,0,0};
	        int tt=0;
	        while(num!=0) {
	            int d=(int)(num%10);    //存放个位数
	            if(arr[d]==1) {
	                return false;
	            }
	            arr[d]=1;
	            tt++;
	            num=num/10;    
	        }
	        if(tt==10) {    //平方根从30000开始，平方数还没到10位，加以判断；
	            return true;
	        }
	        return false;
	    }
	    
	    public static void main(String args[]) {
	        long i=0L;
	        long max=0L;
	        for(i=30000L;i<100000L;i++) {
	            if(Judge(i*i)==true) {
	                if(i*i>max) {
	                    max=i*i;
	                }
	            }
	        }
	        System.out.println(max);
	    }
	    
	}

