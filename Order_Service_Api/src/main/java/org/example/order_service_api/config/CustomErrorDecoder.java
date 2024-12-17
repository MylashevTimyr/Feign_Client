package org.example.order_service_api.config;

import feign.Response;
import feign.codec.ErrorDecoder;

public class CustomErrorDecoder implements ErrorDecoder {

    private final ErrorDecoder defaultDecoder = new Default();

    @Override
    public Exception decode(String methodKey, Response response) {
        switch (response.status()) {
            case 400:
                return new RuntimeException("Bad Request: Invalid request sent to server.");
            case 404:
                return new RuntimeException("Not Found: Requested resource not available.");
            case 500:
                return new RuntimeException("Internal Server Error: Server encountered an issue.");
            default:
                return defaultDecoder.decode(methodKey, response);
        }
    }
}
