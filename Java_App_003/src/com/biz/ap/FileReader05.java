package com.biz.ap;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * data1.txt ������ �о
 * ���� ������ ��ȯ�ϰ� 
 * ��ü ������ �ϰ� 
 * ��ü ����� ����ϴ�
 * �ڵ带 �ۼ��� ���ϴ�.
 */
public class FileReader05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String fileName = "src/com/biz/ap/data1.txt";
		
		FileReader fileReader = null ;
		BufferedReader buffer = null ;
		int num = 0 ;
		int intSum = 0 ;
		int cnt = 0;
		
		try {
			fileReader = new FileReader(fileName) ;
			buffer = new BufferedReader(fileReader);
			String reader = new String();

			while(true) {
				reader = buffer.readLine();
				if(reader == null) break ;
		
				try {
					num = Integer.valueOf(reader);
					intSum += num ;
					cnt ++ ;
				} catch (Exception e) {
					// TODO: handle exception
				}
				
				
				
			}
			System.out.println("�հ� : " + intSum);
			System.out.println("��� : "+ intSum/cnt);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}