import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileGFB {
public String getProperty(String key)throws IOException{
	FileInputStream fis=new FileInputStream("./data/commondata.property");
	Properties p = new Properties();
	p.load(fis);
	String data = p.getProperty(key);
	return key;
	
}
}
