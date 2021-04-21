/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sata
 */
public class Cash extends Payment{
    private float cashTendered;

    public Cash() {
        printBehavior = new PrintCashTrans();
        authorizeBehavior =new AuthorizeNon();
    }
 
    public float getCashTendered() {
        return cashTendered;
    }

    public void setCashTendered(float cashTendered) {
        this.cashTendered = cashTendered;
    }
    
    
    
}
