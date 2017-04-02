package com.transport.helper;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClientBuilder;
import org.springframework.stereotype.Component;

@Component
public class HTTPClientHelper {

	public HttpResponse connectURL(String url) {
		HttpResponse response = null;
		try {
			HttpClient client = HttpClientBuilder.create().build();
			HttpPost postMethod = new HttpPost(url);
			response = client.execute(postMethod);

		} catch (IOException e) {
		}
		return response;
	}
}
