package com.test.authentication;

import javax.security.auth.callback.CallbackHandler;

import org.apache.cxf.interceptor.security.JAASLoginInterceptor;
import org.apache.cxf.interceptor.security.NamePasswordCallbackHandler;

public class CustomJAASLoginInterceptor extends JAASLoginInterceptor {
	  @Override
	  protected CallbackHandler getCallbackHandler(String name, String password) {
	    return new NamePasswordCallbackHandler(name, password, "setCredential");
	  }
	}
