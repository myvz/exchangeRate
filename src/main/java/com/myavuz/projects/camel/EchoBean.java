package com.myavuz.projects.camel;

import com.myavuz.projects.exchangerate.TarihDateType;
import org.apache.camel.Exchange;

/**
 * Created by myavuz on 11.09.2015.
 */
public class EchoBean {

    public TarihDateType print(TarihDateType tarihDateType) {
        return tarihDateType;
    }

    public String test(String body) {
        return body;
    }
}
