package org.frvi.springbanking.dao;

import org.frvi.springbanking.domain.Transaction;
import org.springframework.stereotype.Component;

import java.util.Collection;

/**
 * 2010 Xebia B.V
 * User: frank
 * Created: Sep 19, 2010
 * Time: 10:16:16 PM
 */
@Component
public interface TransactionDao extends GenericDao<Transaction, Long> {
    public Collection<Transaction> findAllTransactions();
}
