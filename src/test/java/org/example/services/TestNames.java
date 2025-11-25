package org.example.services;

import org.example.calculatorService.CheckNames;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestNames {
    CheckNames ob=new CheckNames();
    @Test
    public void testFirstName(){
      String res= ob.firstUserName("Dinu");
    String excString="Dinesh";
      Assert.assertEquals(excString,res);
    }

    @Test
    public void testLastName(){

        String res="Shrirame";
        String exceptedString="Shrirame";
        Assert.assertEquals(exceptedString,res);
    }
@Test
    public void userDist(){
    String res="Nanded";
    String excepted="Nanded";
    Assert.assertEquals(excepted,res);
}


}
