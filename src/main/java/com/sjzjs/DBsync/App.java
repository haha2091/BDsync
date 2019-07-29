package com.sjzjs.DBsync;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.sjzjs.DBsync.utils.TimingTasks;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Logger logger = LogManager.getLogger(App.class);
        logger.debug("******************程序开始执行*********************");
//        TimingTasks task = new TimingTasks();
//        task.doMain();
//        getDatasFromOracle();
        doNext();
        logger.debug("******************执行完毕！！！*********************");
    }
    
    public static void doNext() {
    	 Properties prop = new Properties();

         // add some properties
         prop.put("Height", "200");
         prop.put("Width", "15");

         try {

            // create a output and input as a xml file
            FileOutputStream fos = new FileOutputStream("properties.xml");
            FileInputStream fis = new FileInputStream("properties.xml");

            // store the properties in the specific xml
            prop.storeToXML(fos, null);

            // load from the xml that we saved earlier
            prop.loadFromXML(fis);

            // print the properties list
            prop.list(System.out);

         } catch (IOException ex) {
            ex.printStackTrace();
         }


    }
        
}
