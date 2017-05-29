package com.dropsnorz.spring_shell_example.commands;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.springframework.shell.core.CommandMarker;
import org.springframework.shell.core.annotation.CliCommand;
import org.springframework.shell.core.annotation.CliOption;
import org.springframework.stereotype.Component;

@Component
public class CustomCommands implements CommandMarker {


	@CliCommand(value = "read", help = "Read content from the given file")
	public String simple(
			@CliOption(key = { "file" }, mandatory = true, help = "File to load in DataMink") final String path){

		File file = new File(path);
		try {
			
			return FileUtils.readFileToString(file);

		}catch (IOException e) {
			return "Error: Invalid file";
		}

	}

}