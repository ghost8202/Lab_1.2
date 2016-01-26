/**
 *
 * @author Yooju Choi
 */

import java.io.*;

public class Lab1_2
{
	public static void main(String[] args)
	{
	try{
            //Declaration and creation of FileReader since it is a text file
            FileReader fr = new FileReader("H:\\Mbobi\\Java\\Streams\\myFile.txt");
            int count =0;
            while (fr.ready()){
                System.out.print(fr.read()+" ");
                count++;
            
        }
            fr.close();//close the file
            System.out.println("\nTotal Bytes read : " +count);
        }catch(IOException e){
            System.out.println("Error ......."+e.toString());
        }	
	}
}
