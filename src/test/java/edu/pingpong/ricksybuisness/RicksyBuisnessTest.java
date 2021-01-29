package edu.pingpong.ricksybuisness;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class RicksyBuisnessTest 
{
    @Test
    public void constructor_test(){
        CreditCard card = new CreditCard("Rick","9874585");
        assertNotNull(card);

    }
    @Test
    public void getOwner_test(){
        CreditCard card= new CreditCard("Rick","9874585");
        assertEquals("Rick", card.getOwner());
    }
    
    @Test
    public void getNumber(){
        CreditCard card = new CreditCard("Rick", "9874585");
        assertEquals("9874585", card.getNumber());
    }

    @Test
    public void getCredit(){
        CreditCard credit = new CreditCard("Ricksy", "987654321");
        assertEquals("3000.0", credit.getCredit());
    }
}
