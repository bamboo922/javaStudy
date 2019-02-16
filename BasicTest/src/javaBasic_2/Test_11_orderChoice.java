package javaBasic_2;

import java.util.Scanner;

/*
 * switch语句 菜单跳转练习 
 */

public class Test_11_orderChoice {

	public static void main(String[] args){
		
		System.out.println("1.登录系统");
		System.out.println("2.退出");
		
		System.out.print("请选择：");
		
		Scanner scanner = new Scanner(System.in);
		int option = scanner.nextInt();
		
		switch(option){
		case 1:
			System.out.println("1.客户信息管理");
			System.out.println("2.购物结算");
			System.out.println("3.真情回馈");
			System.out.println("4.注销");
			
			System.out.println("请选择:");
		    option = scanner.nextInt();
		    
		    switch(option){
		    case 1:
		    	System.out.println("购物管理系统>客户信息管理");
		    	System.out.println("1.显示所有客户信息");
		    	System.out.println("2.添加客户信息");
		    	System.out.println("3.修改客户信息");
		    	System.out.println("4.查询客户信息");
		    	
		    	System.out.println("请选择:");
		    	option = scanner.nextInt();
		    	
		    	switch(option){
		    	case 1:
		    		System.out.println("购物管理系统>客户信息管理>显示所有客户信息");
		    		break;
		    	case 2:
		    		System.out.println("购物管理系统>客户信息管理>添加客户信息");
		    		break;
		    	case 3:
		    		System.out.println("购物管理系统>客户信息管理>修改客户信息");
		    		break;
		    	case 4:
		    		System.out.println("购物管理系统>客户信息管理>查询客户信息");
		    		break;
		    	default:
		    		System.out.println("输入错误");
		    		break;
		    	
		    	}	
		    	break;
		    	
		    case 2:
				System.out.println("购物管理系统>购物结算");
				break;
			
		    case 3:
		    	System.out.println("购物管理系统>真情回馈");
		    	System.out.println("1.幸运大放送");
		    	System.out.println("2.幸运抽奖");
		    	System.out.println("3.生日问候");
		    	
		    	System.out.println("请选择:");
		    	option = scanner.nextInt();
		    
		    	switch(option){
		    	case 1:
		    		System.out.println("购物管理系统>真情回馈>幸运大放送");
		    		break;
		    	
		    	case 2:
		    		System.out.println("购物管理系统>真情回馈>幸运抽奖");
		    		break;
		    		
		    	case 3:
		    		System.out.println("购物管理系统>真情回馈>生日问候");
		    		break;
		    	
		    	default:
					System.out.println("输入错误");
					break;    	
		    	}
		    	break;
		    	
		    case 4:
		    	System.out.println("注销成功");
		    	break;
		    	
		    default:
				System.out.println("输入错误");
				break;
		    }
		break;
		
		case 2:
			System.out.println("退出成功");
			break;

		default:
			System.out.println("输入错误");
			break;
		}
		
	}
}
