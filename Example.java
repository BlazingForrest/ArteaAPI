import arteaAPI.IFTTT;

public class Example {
	
	public static void main(String[] args) {
		// Data you want to send to IFTTT server, please note that IFTTT can only recieve 3 values
		
		String[] values = {"1", "2"};
		
		// You can find your IFTTT maker key by searching 'webhooks' on IFTTT, clicking 'settings' on the top-right and
		// copying the part of the url after https://maker.ifttt.com/use/
		// For example, your URL might be 1234567890 because the URL is https://maker.ifttt.com/use/1234567890
		
		IFTTT.sendWebHook("event_name", "IFTTT_Maker_key", values);
	}

}

