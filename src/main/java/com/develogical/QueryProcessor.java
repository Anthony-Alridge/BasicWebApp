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
        }
        return "";
    }
}
