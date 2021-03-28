package common_utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class FileUtility {
	public String getProprtiesKeyValue(String key) throws Exception
	{
		FileInputStream fis = new FileInputStream(".\\src\\main\\resources\\DataStorage\\commondata.PROPERTIES");
		Properties prop =new Properties();
		prop.load(fis);
		return prop.getProperty(key);
		}
	public static void main(String[] args) throws Exception {
		System.out.println(new FileUtility().getProprtiesKeyValue("browser"));
		System.out.println(new FileUtility().getProprtiesKeyValue("url"));
		System.out.println(new FileUtility().getProprtiesKeyValue("usename"));
		System.out.println(new FileUtility().getProprtiesKeyValue("password"));
	}

}
