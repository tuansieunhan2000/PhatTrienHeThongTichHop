package Lab3Bai5;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import InterfaceLab3Bai5.InterfaceLab3Bai5;

public class DaoNguocChuoi extends UnicastRemoteObject implements InterfaceLab3Bai5{

	protected DaoNguocChuoi() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void reverseWordInMyString(String str) throws RemoteException {
		// TODO Auto-generated method stub
		 String[] words = str.split(" ");
	        String reversedString = "";
	        for (int i = 0; i < words.length; i++)
	        {
	            String word = words[i];
	            String reverseWord = "";
	            for (int j = word.length()-1; j >= 0; j--)
	            {
	                reverseWord = reverseWord + word.charAt(j);
	            }
	            reversedString = reversedString + reverseWord + " ";
	        }
	        System.out.println("Chuỗi gốc"+str);
	        System.out.println("Chuỗi sau khi đảo ngược"+reversedString);
		
	}

}
