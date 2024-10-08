package edu.grinnell.csc207;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.grinnell.csc207.linear.BuiltinPriorityQueue;
import edu.grinnell.csc207.util.Comparators.StringComparator;

public class TestPriorityQueue {
    @Test
    public void TestPQueue() throws Exception{
         BuiltinPriorityQueue<String> bq = new BuiltinPriorityQueue<String>(16, new StringComparator());
         bq.put("b");
         bq.put("h");
         bq.put("d");
         bq.put("e");
         bq.put("f");
         bq.put("a");
         bq.put("g");
         bq.put("c");
         bq.put("a");

         assertEquals("a", bq.get());
         assertEquals("a", bq.get());
         assertEquals("b", bq.get());
         assertEquals("c", bq.peek());
         assertEquals("c", bq.get());
         assertEquals("d", bq.get());
         assertEquals("e", bq.get());
         assertEquals("f", bq.get());
         assertEquals("g", bq.get());
         
    }
}
