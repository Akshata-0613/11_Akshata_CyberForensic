package pract1;
import java.io.*;
importjava.util.*;
import java.net.*;
public class Sender {
public static void main(String[] args) throws Exception {
 String s="";
 String ct="";
 String key="";
 Socket sc=new Socket("localhost",6017);
 Random r=new Random();
int i=0,k=0;
2
System.out.println("Enter the string");
BufferedReaderbr= new BufferedReader(new InputStreamReader(System.in));
BufferedWriterbw=new BufferedWriter(new OutputStreamWriter(sc.getOutputStream()));
 s=br.readLine();
int j[]=new int[s.length()];
for(i=0;i<s.length();i++)
 {
j[k]=r.nextInt(50);
key+=Integer.valueOf(j[k])+",";
System.out.println("j="+j[k]);
ct+=(char)(s.charAt(i)+j[k]);
k++;
 }
System.out.println("Key="+key);
System.out.println("Encrypted message: "+ct);
bw.write(ct+","+key);
bw.flush();
bw.close();
}
}
