
public class Login extends UserInfor {
	 public static boolean processLogin(int id, int password)
	    {
	        //String s = cd.quryPasswordById(id);
	        if(id==userID&&password==userPassword)
	            return true;
	        else
	            return false;
	    }


}
