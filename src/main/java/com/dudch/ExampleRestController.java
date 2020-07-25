package com.dudch;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import lombok.Getter;
import lombok.Setter;

import java.awt.*;

@RestController
public class ExampleRestController {

    @Getter
    @Setter
    public static class RestResponse{
        private String param1;
        private String param2;
    }

    @RequestMapping(value = "/hello", method = RequestMethod.GET,
    produces = MediaType.APPLICATION_JSON_VALUE)
    public RestResponse restMethod(String name){
        RestResponse result = new RestResponse();
        result.setParam1("Hello");
        result.setParam2(name);
        return result;
    }

}
