package com.dropsnorz.spring_shell_example.commands;

import org.springframework.core.annotation.Order;
import org.springframework.shell.plugin.support.DefaultPromptProvider;
import org.springframework.stereotype.Component;
import org.springframework.core.Ordered;

@Component
@Order(Ordered.HIGHEST_PRECEDENCE)
public class CustomPromptProvider extends DefaultPromptProvider {

	@Override
	public String getPrompt() {
		return "Ase>";
	}

	@Override
	public String getProviderName() {
		return "Awesome spring-shell example";
	}
}
