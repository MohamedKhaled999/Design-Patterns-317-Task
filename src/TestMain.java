/* 
we show one example 
to test our code 
this example show dynamic change for behavior
*/
public class TestMain {
    
    public static void main(String[] args) {
        Payment payment =new Credit();
        payment.doAuthorize();
        payment.setAuthorizeBehavior(new AuthorizeCredit2());
                payment.doAuthorize();

    }
}
