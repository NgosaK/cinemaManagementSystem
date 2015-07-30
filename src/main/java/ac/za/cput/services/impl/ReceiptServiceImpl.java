package ac.za.cput.services.impl;

import ac.za.cput.domain.Receipt;
import ac.za.cput.repository.ReceiptRepository;
import ac.za.cput.services.ReceiptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by OWNER on 2015/04/24.
 */
@Service
public class ReceiptServiceImpl implements ReceiptService {

    @Autowired
    ReceiptRepository repository;

    @Override
    public List<Receipt> getReceipts() {

        List<Receipt> allReceipts= new ArrayList<Receipt>();
        Iterable<Receipt> receipts= repository.findAll();

        for(Receipt receipt: receipts)
        {
            allReceipts.add(receipt);
        }

        return allReceipts;
    }

}
