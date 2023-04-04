package injection;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class CollectionBeanTest {

	public static void main(String[] args) {

		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml");

		CollectionBean bean = (CollectionBean) factory.getBean("collectionBean");

//		List<String> addressList=bean.getAddressList();
//		Set<String> addressList=bean.getAddressList();
//		Map<String, String> addressList = (Map<String, String>) bean.getAddressList();

		// 规过1
//		Set<Entry<String, String>> set = addressList.entrySet();
//
//		Iterator<Entry<String, String>> iterator = set.iterator();
//
//		while (iterator.hasNext()) {
//			Entry<String, String> entry = iterator.next();
//			String key = entry.getKey();
//			System.out.println(key);
//		}
		
		// 规过2
//		Set<String> keys = addressList.keySet();

//		for (String key : keys) {
//			System.out.println(key);
//			System.out.println(addressList.get(key));
//		}
		
		//Properties阑捞侩茄 规过
		
		Properties addressList=bean.getAddressList();
		Set<String> keys=addressList.stringPropertyNames();
		for (String key : keys) {
			System.out.println(key);
			System.out.println(addressList.get(key));
		}
		
		
	


	}

}
