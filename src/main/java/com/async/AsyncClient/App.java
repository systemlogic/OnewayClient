package com.async.AsyncClient;

import java.util.Map;

import javax.xml.ws.BindingProvider;
import com.systemlogic.ONEWAY;
import com.systemlogic.ONEWAYService;

/**
 * Hello world!
 *
 */
public class App 
{
    @SuppressWarnings("restriction")
	public static void main( String[] args ) 
    {
    	ONEWAYService as = new ONEWAYService();
		ONEWAY add = as.getONEWAYPort();
		ONEWAY hello = as.getPort(ONEWAY.class);
		Map<String, Object> req_ctx = ((BindingProvider)hello).getRequestContext();
		req_ctx.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, "http://localhost:8888/Oneway/ONEWAY");
		System.out.println();
		
		ONEWAY oneway = as.getONEWAYPort();
		oneway.adding(12, 13);
		int sum = oneway.returnAddResult(15);
		System.out.println(sum);
    }
}
