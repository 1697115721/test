/**
* @author 刘双平
* @date 2017年7月18日 上午10:04:48 
* @Description: TODO(定义变量，操作变量aa)
 */
public class Test01 {
    public static void main(String []args){
    	//定义变量，在内存中开辟空间
    	int num;
    	//向这块空间中存入数据
    	num=50;
    	//再次开辟空间，存储数据。
    	int num1=10;
    	//通过变量名访问 变量中存储的具体数据。
    	int sum=num+num1;
    	//通过变量名 将数据取出并打印
    	System.out.println(sum);
    	
    	//定义常量
    	final int  PI=314;
    	System.out.println(PI);
         
    	byte b=127;
    	short s=100;
    	int i=10;
    	//定义一个long 类型数据 ，默认开辟空间为int空间大小,超出int范围，加l来让系统扩充空间到long类型大小
    	long l=9999999999l;
    	//定义 float类型 ，赋值时数据后面要加f
    	float f=3.4f;
    	double d=3.5;
    	//char类型赋值  用单引号 '' 括起来。
    	char c='男';
    	//boolean 取值范围 有两个  true 为成立， false为不成立
    	boolean bl= true;//false
    	
    	//注意 当  byte 型和 short型 之间 进行运算时  ，结果默认为 int型,默认自动类型转换
    	// 自动类型转换,将存储范围小的数据类型赋值给存储范围大的数据类型时，可以自动类型转换
    	short k=b;
    	int j=k;
    	float ff=j;
        double dd=ff; 
        char cc='a';
        double ddd=cc;
        System.out.println(ddd);
        double f3=f+3.5;
        
        //强制类型转换,是将大的类型转为小的类型，可能会溢出，溢出多少不确定。 
         byte num3=(byte)39999999999999999999999.14;
         System.out.println(num3);
    }

}


