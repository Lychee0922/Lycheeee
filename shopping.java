import java.util.*;

public class shopping extends UserInfor{
	//final static int userID=1;
	//final static double userPassword=000;
	
	public static void main(String[] args){
		//登录
		int id;
		int password;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input your id");
        id = sc.nextInt();
        System.out.println("Please input your password");
        password = sc.nextInt();
        Login login=new Login();
        //登录失败循环
        while(true){
        while(!Login.processLogin(id, password))
        {
            System.out.printf("\n\n");
            //选择help以后依然会出现“Wrong id or password!” 纠错
            System.out.println("Wrong id or password!");
            System.out.println("Do you need a help?");
            System.out.println("\t\t  1. yes");
    		System.out.println("\t\t  2. no");
    		int choice1=sc.nextInt();
    		switch(choice1){
			case 1:
				System.out.println("   The id is 1, and the password is 000");
			       break;
		    case 2:
		    	System.out.println("Please input your id");
            id = sc.nextInt();
            System.out.println("Please input your password");
            password = sc.nextInt();
			       break;
            
        }
    		}

		Goods goods=new Goods();
		goods.Init();
		goods.menu();
		goods.choice();
		}
	}
	//冗余代码
    public static boolean processLogin(int id, int password)
    {
        //String s = cd.quryPasswordById(id);
        if(id==userID||password==userPassword)
            return true;
        else
            return false;
    }
}


	


