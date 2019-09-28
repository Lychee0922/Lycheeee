import java.util.Scanner;

class Goods{
	//��������
	int[] id=new int[11];
	String[] name=new String[10];
	double[] price=new double[10];
	double sum=0;
	double ww; // intתdouble���� ����
	
	Scanner scanner=new Scanner(System.in);
	
	//��ʼ��
	public void Init(){
		for(int i=0;i<10;i++){
			id[i]=i+1;
			name[i]="未上架";
			price[i]=0.0;
		}
	}
	
	
	//�˵�
	public void menu(){
		System.out.println("***************欢迎使用007ϵͳ************");
		System.out.println("\t\t  1. 查看");
		System.out.println("\t\t  2. 上架");
		System.out.println("\t\t  3. 下架");
		System.out.println("\t\t  4. 购买");
		System.out.println("\t\t  5. 用户");
		System.out.println("\t\t  6. 退出");
		System.out.println("**************************************************");
	}
	public void choice(){
		while(true){
			System.out.println("输入选择");
			int choice=scanner.nextInt();
			switch(choice){
				case 1:checkGood();
				       menu();
				       break;
			    case 2:addGood();
				       checkGood();
				       menu();
				       break;
			    case 3:outGood();
				       checkGood();
				       menu();
				       break;
				case 4:checkGood();
				       buyGood();
					   menu();
				       break;
				case 5:addUser();
					   menu();
					   break;
				case 6:quit();
				       break;
				default:System.out.println("有误，重输");
				       menu();
			}
		}		
	}


	public void quit() {
        System.out.println("*******************************************************");
        System.out.println("������ѹ��� "+sum+"Ԫ");
        System.out.println("                下次再见                 ");
        System.out.println("*******************************************************");
        System.exit(0);
    }

	
	//�����Ʒ
	public void addGood(){
		for(int i=0;i<10;i++){
		if(name[i]=="未上架"){
			System.out.println("已上架: "+i+"空位"+(10-i)+"个");
			System.out.println("现上架商品编号"+(i+1));
			System.out.println("上架商品名称");
			name[i]=scanner.next();
			System.out.println("输入价格: (格式0.0)");
		    price[i]=scanner.nextDouble();
			System.out.println("继续上架-->1,结束上架-->0");
			int a=scanner.nextInt();
			if(a==0)
				break;
		}
		}
		System.out.println("上架成功");
	}
	
	
	//�¼���Ʒ
	public void outGood(){
		System.out.print("输入下架编号: ");
		int outid=scanner.nextInt();
		name[outid-1]="未上架";
		price[outid-1]=0.0;
	}
	
	
	//��Ʒ�鿴
	public void checkGood(){
		System.out.println("\t编号\t名称\t价格");
		for(int i=0;i<10;i++)
			System.out.println("\t"+id[i]+"\t\t"+name[i]+"\t\t"+price[i]);
	}
	
	
	//��Ʒ����
	public void buyGood(){
		double sum2=0;
		//������ӡ�嵥�ı���
		int[] paperid=new int[20];
		int[] papernum =new int[20];
		String[] papername=new String[20];
		double[] paperprice=new double[20];
		for(int j=0;j<20;j++){
			paperid[j]=0;
			papernum[j]=0;
			papername[j]="";
			paperprice[j]=0.0;
		}
		int j=0;
		//����ѭ��
		while(true){
			System.out.print("输入编号");
			int buyid=scanner.nextInt();
		    System.out.print("输入件数");
		    int num=scanner.nextInt();
			for(int i=0;i<10;i++){
				if(buyid==id[i]){
					sum=price[i]*num+sum;
					sum2=price[i]*num+sum2;
					System.out.println("");
					System.out.println(name[i]+"以加入购物车 "+num+" 件");
					paperid[j]=buyid;
					papernum[j]=num;
					papername[j]=name[i];
					paperprice[j]=price[i];
					j++;
					}
				}
				System.out.println("");
				System.out.println("继续购买-->1,结束购买-->0");
				int a=scanner.nextInt();
				//��ӡ�嵥
			    if(a==0){
					System.out.println("*********************购物清单************************");
					System.out.println("次序"+"\t名称"+"\t单价"+"\t个数");
					j=0;
					while(paperid[j]!=0){
						System.out.println(+(j+1)+" ."+"\t"+papername[j]+"\t\t"+paperprice[j]+"\t\t"+papernum[j]);
			            j++;
						}
						System.out.println("");
						//ÿ����ʾ���������Ѷ����Ǵ˴����� ����
						System.out.println("�总计: "+sum);
						//System.out.println("�ܼ�: "+sum2);
						System.out.println("**************************************************");
					break;
				}
				}
		
				
	}
	//�����û�
	//ֻ�ܱ�����һ���û���Ϣ ����
	 private void addUser() {
			System.out.println("Please input a new user ID:");
			Scanner sc = new Scanner(System.in);
			int ww2=sc.nextInt();
			while(true){
				while((ww2==ww)) {	
			System.out.println("Invaild ID, please enter a different one");
			System.out.println("Please input a new user ID:");			
			ww2=sc.nextInt();
			System.out.println("\n");
			}
				ww=ww2;
				System.out.println("please input the password of "+ww);
				String pp=sc.next();
				System.out.println("Create succeed!");
				System.out.println("The new user ID is "+ww+" and the password is "+pp);
				break;
				}
		}
}