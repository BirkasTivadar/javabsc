package algorithmssum.transactions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransactionTest {

    @Test
    void testCreateTransaction() {
        Transaction transaction = new Transaction("1234-2345-1231", TransactionOperation.CREDIT, 100000);

        assertEquals("1234-2345-1231", transaction.accountNumber());
        assertEquals(TransactionOperation.CREDIT, transaction.transactionOperation());
        assertEquals(100000, transaction.amount());
        assertTrue(transaction.isCredit());
        assertFalse(transaction.isDebit());
    }
}