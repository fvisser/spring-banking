package org.frvi.springbanking.web.view;

import org.apache.commons.lang.NotImplementedException;
import org.frvi.springbanking.dao.TransactionDao;
import org.frvi.springbanking.domain.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Collection;

/**
 * 2010 Xebia B.V
 * User: frank
 * Created: Sep 19, 2010
 * Time: 9:55:33 PM
 */
@Controller
@RequestMapping("/overview")
public class OverviewController {
    private static Logger logger = LoggerFactory.getLogger(OverviewController.class);

    // later on we will get a real business layer in between
    @Autowired
    TransactionDao transactionDao;

    @RequestMapping(method = RequestMethod.GET)
    public String overview(Model model) {
        logger.debug("logging is working");
        Collection<Transaction> transactions = transactionDao.findAllTransactions();        // get all transactions
        model.addAttribute("value", "Hello World");
        return "overview";
    }
}
