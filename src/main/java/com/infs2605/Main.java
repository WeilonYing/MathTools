package com.infs2605;

import com.infs2605.commands.CommandInterface;
import com.infs2605.commands.Exit;
import com.infs2605.commands.LinearEquation;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Map<String, CommandInterface> getCommands() {
        HashMap<String, CommandInterface> commands = new HashMap<>();
        commands.put(LinearEquation.class.getSimpleName().toLowerCase(), new LinearEquation());
        commands.put(Exit.class.getSimpleName().toLowerCase(), new Exit());
        return commands;
    }

    public void run() {
        Scanner in = new Scanner(System.in);
        Map<String, CommandInterface> commands = getCommands();
        while (true) {
            System.out.print("\nEnter a command (Type '?' for help): ");
            String c = in.next().toLowerCase();
            if (c.equals("?")) { // print list of commands and their description
                System.out.println("## HELP ##");
                for (String key : commands.keySet()) {
                    System.out.println(key + " - " + commands.get(key).getDescription());
                }
            } else if (commands.containsKey(c)) {
                commands.get(c).execute();
            } else {
                System.out.println("Command not recognised. Type '?' for help.");
            }
        }
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
