import com.step.bank.Account;
import com.step.bank.InvalidAccNumberException;
import com.step.bank.MinimumBalanceException;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class AccountTest {

    private Account account;

    @Before
    public void setUp() throws MinimumBalanceException,InvalidAccNumberException {
        account = new Account("1234-5678", 2000);
    }

    @Test
    public void checkBalance(){
        assertThat(account.getBalance(), is(2000.0));
    }

    @Test
    public void checkAccNumber(){
        assertThat(account.getAccNumber(),is("1234-5678"));
    }

    @Test(expected = MinimumBalanceException.class)
    public void checkMinimumBalance() throws MinimumBalanceException,InvalidAccNumberException {
        Account account = new Account("1234-5678", 300);
    }

    @Test
    public void checkMinimumWithdrawal() throws MinimumBalanceException {
        assertThat(account.getBalance(),is(2000.0));
        try {
            account.debit(1100);
        }catch (MinimumBalanceException e){
            assertThat(account.getBalance(),is(2000.0));
        }
    }

    @Test
    public void withdrawBalance() throws MinimumBalanceException {
        assertThat(account.getBalance(),is(2000.0));
        account.debit(900);
        assertThat(account.getBalance(),is(1100.0));
    }
}
