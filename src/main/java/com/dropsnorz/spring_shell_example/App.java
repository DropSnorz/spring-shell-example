package com.dropsnorz.spring_shell_example;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.shell.Bootstrap;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args )
	{
		try {
			ArrayList<String> argsList = new ArrayList<String>(Arrays.asList(args));
			argsList.add("--disableInternalCommands");
			String[] argsArray = new String[argsList.size()];
			argsArray = argsList.toArray(argsArray);

			Bootstrap.main(argsArray);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
