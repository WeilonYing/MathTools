package com.infs2605.commands;

public class Exit implements CommandInterface {
    @Override
    public void execute() {
        System.exit(0);
    }

    @Override
    public String getDescription() {
        return "Quit the program.";
    }
}
