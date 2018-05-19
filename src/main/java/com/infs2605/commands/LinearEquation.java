package com.infs2605.commands;

import com.google.common.math.LinearTransformation;

import java.util.Scanner;

public class LinearEquation implements CommandInterface {
    @Override
    public void execute() {
        Scanner in = new Scanner(System.in);
        System.out.println("It works!");
        try {
            System.out.print("Enter first point's coordinates (x0 y0): ");
            LinearTransformation.LinearTransformationBuilder builder =
                    LinearTransformation.mapping(in.nextDouble(), in.nextDouble());
            System.out.print("Enter second point's coordinates (x1 y1): ");
            LinearTransformation lt = builder.and(in.nextDouble(), in.nextDouble());

            System.out.println("The linear equation of this coordinate pair is: " + lt.toString());
            System.out.println("The slope of this linear equation is: " + lt.slope());
            System.out.println("The inverse of this linear equation is: " + lt.inverse().toString());


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getDescription() {
        return "Basic tools for analysing linear equations.";
    }
}
