package com.develogical;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an "
                    + "English poet, playwright, and actor, widely regarded as the greatest "
                    + "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.toLowerCase().contains("what is your team name")) {
            return "Team Jordamn";
        } else if (query.toLowerCase().contains("plus")) {
            String[] in = query.toLowerCase().split("is ");
            String[] first = in[1].split(" plus ");
            int left = Integer.parseInt(first[0]);
            int right = Integer.parseInt(first[1]);
            int out = left + right;
            return Integer.toString(out);
        } else if (query.toLowerCase().contains("multiplied by")) {
            String[] in = query.toLowerCase().split("is ");
            String[] first = in[1].split(" multiplied by ");
            int left = Integer.parseInt(first[0]);
            int right = Integer.parseInt(first[1]);
            int out = left * right;
            return Integer.toString(out);
        } else if (query.toLowerCase().contains("who played James Bond in the film Dr No")) {
            return "Sean Connery";
        } else if (query.toLowerCase().contains("minus")) {
            String[] in = query.toLowerCase().split("is ");
            String[] first = in[1].split(" minus ");
            int left = Integer.parseInt(first[0]);
            int right = Integer.parseInt(first[1]);
            int out = left - right;
            return Integer.toString(out);
        } else if (query.toLowerCase().contains("divided by")) {
            String[] in = query.toLowerCase().split("is ");
            String[] first = in[1].split(" divided by ");
            int left = Integer.parseInt(first[0]);
            int right = Integer.parseInt(first[1]);
            int out = left / right;
            return Integer.toString(out);
        } else if (query.toLowerCase().contains("what colour is a banana")) {
            return "yellow";
        } else if (query.toLowerCase().contains("Fibonacci sequence")) {
            String[] in = query.toLowerCase().split("the ");
            String[] first = in[1].split("th");
            int n = Integer.parseInt(first[0]);
            int fibonacci=0,num=0,num2=1;
            for(int loop=1;loop<n;loop++) {
               fibonacci=num+num2;
               num=num2;
               num2=fibonacci;
            }
            return Integer.toString(fibonacci);
        } else if (query.toLowerCase().contains("which city is the eiffel tower in")) {
            return "paris";
        } else if (query.toLowerCase().contains("which of the following numbers is the largest")) {
            String[] in = query.toLowerCase().split(": ");
            String[] first = in[1].split(", ");
            int left = Integer.parseInt(first[0]);
            int right = Integer.parseInt(first[1]);
            if (left >= right) {
                return Integer.toString(left);
            } else {
                return Integer.toString(right);
            }
        } else if (query.toLowerCase().contains("which of the following numbers is both a square and a cube:")) {
            String[] in = query.toLowerCase().split(": ");
            String[] first = in[1].split(", ");

            for (String x_str : first) {
                int x = Integer.parseInt(x_str);
                double sq = Math.sqrt(x);
                double cb = Math.cbrt(x);

                if ((sq - Math.floor(sq)) == 0 && (cb - Math.floor(cb)) == 0) {
                    return Integer.toString(x);
                }
            }
        }
        return "";
    }
}
