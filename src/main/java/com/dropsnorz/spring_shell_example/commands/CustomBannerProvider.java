package com.dropsnorz.spring_shell_example.commands;

import org.springframework.core.annotation.Order;
import org.springframework.shell.plugin.support.DefaultBannerProvider;
import org.springframework.shell.support.util.OsUtils;
import org.springframework.stereotype.Component;
import org.springframework.core.Ordered;

@Component
@Order(Ordered.HIGHEST_PRECEDENCE)
public class CustomBannerProvider extends DefaultBannerProvider  {

	public String getBanner() {
		StringBuffer buf = new StringBuffer();
	    buf.append("#####################################################" + OsUtils.LINE_SEPARATOR);
	    buf.append("#           Awesome spring-shell example            #" + OsUtils.LINE_SEPARATOR);
	    buf.append("#####################################################" + OsUtils.LINE_SEPARATOR);

		return buf.toString();
	}


	public String getWelcomeMessage() {
		return "Welcome to Awesome spring-shell example";
	}
	
	@Override
	public String getProviderName() {
		return "Awesome spring-shell example";
	}
}