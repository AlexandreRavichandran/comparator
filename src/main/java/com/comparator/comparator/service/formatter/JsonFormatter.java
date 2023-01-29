package com.comparator.comparator.service.formatter;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonFormatter implements Formatter{

    @Override
    public String format(String format) {
        ObjectMapper mapper = new ObjectMapper();

        try{
            return mapper.writerWithDefaultPrettyPrinter().writeValueAsString(format);

        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        return "";
    }
}
