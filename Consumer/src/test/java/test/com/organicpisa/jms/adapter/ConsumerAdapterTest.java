package test.com.organicpisa.jms.adapter;

import static org.junit.Assert.*;

import java.net.UnknownHostException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.organicpisa.jms.adapter.ConsumerAdapter;

public class ConsumerAdapterTest {

	private String json = "{vendorName:\"Microsofttest\",firstName:\"BobTest\",lastName:\"SmithTest\",address:\"123 Main test\",city:\"TulsaTest\",state:\"OKTest\",zip:\"71345Test\",email:\"Bob@microsoft.test\",phoneNumber:\"test-123-test\"}";
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSendToMongo() throws UnknownHostException {
		ConsumerAdapter adapter = new ConsumerAdapter();
		adapter.sendToMongo(json);
		assertNotNull(json);
	}

}
