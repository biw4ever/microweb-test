package com.yjz.microweb.test;

import org.springframework.stereotype.Component;
import org.springframework.web.filter.CharacterEncodingFilter;

import com.yjz.microweb.annotation.FilterClass;
import com.yjz.microweb.annotation.FilterDef;
import com.yjz.microweb.annotation.FilterInitParam;
import com.yjz.microweb.annotation.FilterName;
import com.yjz.microweb.annotation.FilterUrlPattern;

@Component
@FilterDef
public class FilterDefBean
{
    @FilterName("characterEncodingFilter")
    @FilterClass(CharacterEncodingFilter.class)
    @FilterUrlPattern("/*")
    @FilterInitParam(paramName="encoding",paramValue="UTF-8")
    public void characterEncodingFilter()
    {
        
    }
}
