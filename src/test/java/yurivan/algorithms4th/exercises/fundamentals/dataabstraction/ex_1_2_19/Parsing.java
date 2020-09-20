package yurivan.algorithms4th.exercises.fundamentals.dataabstraction.ex_1_2_19;

/*
    Develop the parse constructors for your Date and Transaction implementations of Exercise 1.2.13
    that take a single String argument to specify the initialization values, using the formats given in the table below.

    type                       format               example
    Date            integers separated by slashes   5/22/1939
    Transaction     customer, date, and amount,     Turing 5/22/1939 11.99
                      separated by whitespace

    Partial solution:
        public Date(String date)
        {
           String[] fields = date.split("/");
           month = Integer.parseInt(fields[0]);
           day   = Integer.parseInt(fields[1]);
           year  = Integer.parseInt(fields[2]);
        }
 */

public class Parsing {

}

