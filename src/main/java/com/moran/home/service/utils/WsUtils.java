package com.moran.home.service.utils;

import java.util.Map;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

import org.json.JSONObject;

public class WsUtils {
	
	public static final int HTTP_SUCCESS = 200;
	public static final int HTTP_CREATED = 201;
	public static final int HTTP_ACCEPTED = 202;
	

	public static String createSuccessResponseMessage(String message, Map<String, String> refLinks) {
		JSONObject json = new JSONObject();
		json.put("result", "SUCCESS");
		json.put("message", message);
		json.put("self", refLinks);
		return json.toString();
	}

	public static Response createSuccessRsResponse(ResponseBuilder responseBuilder, String sucessMessage,
			int httpStatus) {
		responseBuilder.entity(sucessMessage);
		responseBuilder.status(httpStatus);
		return responseBuilder.build();
	}
}
