package com.dropsnorz.spring_shell_example;

import java.io.IOException;

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
			Bootstrap.main(args);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
