package com.mohs10.ActionDriver;

import java.io.IOException;

import org.testng.annotations.DataProvider;



public class DataProviders {
	
	 @DataProvider(name="Sheet1Data")
		public String[][] getSheet1Data() throws IOException, java.io.IOException
		{
			String path=System.getProperty("user.dir")+"//TestData//Mohs10Data.xlsx";
			XLUtility xl=new XLUtility(path);
			
			int rownum=xl.getRowCount("GetInTouch");
			int colcount=xl.getCellCount("GetInTouch",1);
			
			String apidata[][]=new String[rownum][colcount];
			
			for(int i=1;i<=rownum;i++)
			{
				for(int j=0;j<colcount;j++)
				{
					apidata[i-1][j]=xl.getCellData("GetInTouch", i, j);
				}
			}
			return apidata;
		}
	 
	 @DataProvider(name="Sheet3Data")
		public String[][] getSheet01Data() throws IOException, java.io.IOException
		{
			String path=System.getProperty("user.dir")+"//TestData//JyotsnaUserdata.xlsx";
			XLUtility xl=new XLUtility(path);
			
			int rownum=xl.getRowCount("Superadmin");
			int colcount=xl.getCellCount("Superadmin",1);
			
			String apidata[][]=new String[rownum][colcount];
			System.out.println(rownum);
			System.out.println(colcount);
			//int k=0;
			for(int i=1;i<=rownum;i++)
			{
				for(int j=0;j<colcount;j++)
				{
					apidata[i-1][j]=xl.getCellData("Superadmin", i, j);
					System.out.println(apidata[i-1][j]);
				}
			}
			return apidata;
	}
	
	 @DataProvider(name="Sheet2Data")
	public String[][] getSheet2Data() throws IOException, java.io.IOException
	{
		String path=System.getProperty("user.dir")+"//TestData//JyotsnaUserdata.xlsx";
		XLUtility xl=new XLUtility(path);
		
		int rownum=xl.getRowCount("LoginAccounts");
		int colcount=xl.getCellCount("LoginAccounts",1);
		
		String apidata[][]=new String[rownum][colcount];
		
		for(int i=1;i<=rownum;i++)
		{
			for(int j=0;j<colcount;j++)
			{
				apidata[i-1][j]=xl.getCellData("LoginAccounts", i, j);
			}
		}
		return apidata;
	}
	
	@DataProvider(name="UserNames")
	public String[] getUserNames() throws IOException, java.io.IOException
	{
		String path=System.getProperty("user.dir")+"//TestData//JyotsnaUserdata.xlsx";
		XLUtility xl=new XLUtility(path);
		
		int rownum=xl.getRowCount("Sheet1");
		
		String apidata[]=new String[rownum];
		for(int i=1;i<=rownum;i++)
		{
			apidata[i-1]=xl.getCellData("Sheet1", i, 1);
		}

		return apidata;

	}
	
	@DataProvider(name="Sheet4Data")
	public String[][] getSheet3Data() throws IOException, java.io.IOException
	{
		String path=System.getProperty("user.dir")+"//TestData//JyotsnaUserdata.xlsx";
		XLUtility xl=new XLUtility(path);
		
		int rownum=xl.getRowCount("Addadmin");
		int colcount=xl.getCellCount("Addadmin",1);
		
		String apidata[][]=new String[rownum][colcount];
		
		for(int i=1;i<=rownum;i++)
		{
			for(int j=0;j<colcount;j++)
			{
				apidata[i-1][j]=xl.getCellData("Addadmin", i, j);
			}
		}
		return apidata;
	}
	
	 @DataProvider(name="Sheet5Data")
		public String[][] getSheet5Data() throws IOException, java.io.IOException
		{
			String path=System.getProperty("user.dir")+"//TestData//JyotsnaUserdata.xlsx";
			XLUtility xl=new XLUtility(path);
			
			int rownum=xl.getRowCount("AdminLogin");
			int colcount=xl.getCellCount("AdminLogin",1);
			
			String apidata[][]=new String[rownum][colcount];
			System.out.println(rownum);
			System.out.println(colcount);
			//int k=0;
			for(int i=1;i<=rownum;i++)
			{
				for(int j=0;j<colcount;j++)
				{
					apidata[i-1][j]=xl.getCellData("AdminLogin", i, j);
					System.out.println(apidata[i-1][j]);
				}
			}
			return apidata;
	}
	 @DataProvider(name="Sheet6Data")
		public String[][] getSheet6Data() throws IOException, java.io.IOException
		{
			String path=System.getProperty("user.dir")+"//TestData//JyotsnaUserdata.xlsx";
			XLUtility xl=new XLUtility(path);
			
			int rownum=xl.getRowCount("ConsultantLogin");
			int colcount=xl.getCellCount("ConsultantLogin",1);
			
			String apidata[][]=new String[rownum][colcount];
			System.out.println(rownum);
			System.out.println(colcount);
			//int k=0;
			for(int i=1;i<=rownum;i++)
			{
				for(int j=0;j<colcount;j++)
				{
					apidata[i-1][j]=xl.getCellData("ConsultantLogin", i, j);
					System.out.println(apidata[i-1][j]);
				}
			}
			return apidata;
	}
	 @DataProvider(name="Sheet7Data")
		public String[][] getSheet7Data() throws IOException, java.io.IOException
		{
			String path=System.getProperty("user.dir")+"//TestData//JyotsnaUserdata.xlsx";
			XLUtility xl=new XLUtility(path);
			
			int rownum=xl.getRowCount("ReceptionistLogin");
			int colcount=xl.getCellCount("ReceptionistLogin",1);
			
			String apidata[][]=new String[rownum][colcount];
			System.out.println(rownum);
			System.out.println(colcount);
			//int k=0;
			for(int i=1;i<=rownum;i++)
			{
				for(int j=0;j<colcount;j++)
				{
					apidata[i-1][j]=xl.getCellData("ReceptionistLogin", i, j);
					System.out.println(apidata[i-1][j]);
				}
			}
			return apidata;
	}
	}
