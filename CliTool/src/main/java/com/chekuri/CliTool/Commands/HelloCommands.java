package com.chekuri.CliTool.Commands;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

@ShellComponent(value = "Hello Commands")
public class HelloCommands {

    @ShellMethod(value = "Hello world command ",key = "hello-world")
    public String helloWorld(@ShellOption(defaultValue = "Spring") String key){
        return "Hello " +key +"!, you have started the command line application";
    }

}
