package program1;


import java.applet.*;
//sadadsadasdasd
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
//hello worlda's'd'fa's'da's'd
public class vertex {
	HashMap<String,Edge> E;
	String text;
	
	
	
	String [] T;
	int number;
	
	int Know;
	int Dist;
	vertex P;
	
	public static void HelloWorld()
	{
		System.out.println("hello world");
	}
	
	void Init()
	{
		
		Know=0;
		Dist=-1;
		P=null;
	}
	public   void put(String S,vertex to)
	{
		if(E.get(S)==null)
		{
			Edge e= new Edge(to);
			E.put(S, e);
			T[number]=S;
			number++;
			
		} 
		E.get(S).wight++;
		
	}
	
	
	public  vertex(String S)
	{
		text =S;
		E=new HashMap<String,Edge>(100);
		number=0;
		T=new String[50];
	}
	

}
