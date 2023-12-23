package com.chekuri.CliTool.Commands;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

@ShellComponent(value = "Home Loan: ")
public class HomeLoan implements Loan
{

    private String loanFormat = """
            Home Loan :
                Loan Amount : Rs.%s
                Interest: %s %%
                Tenure: %s Years
            """;

    @Override
    @ShellMethod(value = "Amount Payable ", key = "estimate")
    public String estimate(int loanAmount, double interestRate, int tenure) {
        return loanFormat.formatted(String.valueOf(loanAmount),
                String.valueOf(interestRate),
                String.valueOf(tenure)) ;
    }

    
}
