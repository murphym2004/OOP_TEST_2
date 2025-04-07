package org.example;

import org.junit.jupiter.api.*;

import java.rmi.UnexpectedException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class testPassenger {
     passenger Attendee;

    @BeforeAll
    static void init() {
    System.out.println("beginning of test");
    }

    @BeforeEach
    void setup(){
        Attendee = new passenger;
    }
   @Test
      void Title(){


        assertEquals(expected:Attendee.Title());
    }
    @Test
    void Lname(){


        assertEquals(expected:Attendee.Lname());
    }
    @Test
    void Fname(){


        assertEquals(expected:Attendee.Fname());
    }
    @Test
    void Age(){


        assertEquals(expected:Attendee.Age());
    }
    @Test
    void IDcode(){


        assertEquals(expected:Attendee.IDcode());
    }

    @AfterEach
    void tearThis(){
        System.out.println("@AfterEach executed");
    }


   @AfterAll
   static void tear (){
        System.out.println("@AfterAll Executed");
    }
}
