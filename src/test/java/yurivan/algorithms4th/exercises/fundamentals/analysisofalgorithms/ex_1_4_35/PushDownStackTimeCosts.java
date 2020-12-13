package yurivan.algorithms4th.exercises.fundamentals.analysisofalgorithms.ex_1_4_35;

/*
    Justify the entries in the table below, which shows typical time costs for various pushdown stack implementations,
    using a cost model that counts both data references (references to data pushed onto the stack,
    either an array reference or a reference to an object’s instance variable) and objects created.

    Time costs for pushdown stacks  (various implementations):

                                cost to push N int values
    data structure item type data references objects created
    linked list    int       2N              N
                   Integer   3N              2N

    resizing array
                   int       ~5N             lgN
                   Integer   ~5N             ~N
 */

public class PushDownStackTimeCosts {

}
