package controller;

import hbdao.daonew;
import pojo.addressd;

public class testnew {

	public static void main(String[] args)
	{
    addressd a=new addressd();
    //a.setAid(1);
    a.setAloc("hyd");
    a.setAmailid("raja@234");
    a.setApincode("534534");
    
    daonew k =new daonew();
	//k.insert(a);
	//k.delete(2);
	//k.update(3);
	k.getall();
	
    
	}

}
