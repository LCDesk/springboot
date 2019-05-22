package com.lc95.springboot4restfulcurd.component;

import org.springframework.web.servlet.LocaleResolver;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

public class MyLocaleResovler implements LocaleResolver {
    @Override
    public Locale resolveLocale(HttpServletRequest request) {
        String lg = request.getParameter("lg");
        Locale locale = Locale.getDefault();
        if (!StringUtils.isEmpty(lg)) {
            String[] strings = lg.split("_");
            locale = new Locale(strings[0], strings[1]);
        }
        return locale;
    }

    @Override
    public void setLocale(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Locale locale) {

    }
}
