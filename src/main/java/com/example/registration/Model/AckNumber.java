package com.example.registration.Model;

import org.springframework.stereotype.Component;

@Component
public class AckNumber {
	
	int min = 200;  
	int max = 400;  
	
	public int showRandom()
	{
	int b = (int)(Math.random()*(max-min+1)+min);  
	//System.out.println(b);
	return b;
	}


}
