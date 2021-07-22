package com.openclassrooms.paymybuddy.service;

import com.openclassrooms.paymybuddy.constants.Constants;
import com.openclassrooms.paymybuddy.model.Fee;
import com.openclassrooms.paymybuddy.model.User;
import com.openclassrooms.paymybuddy.repository.FeeRepository;
import com.openclassrooms.paymybuddy.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

/**
 * The type Fee service.
 */
@Service
public class FeeService {

    private final Logger LOGGER = LoggerFactory.getLogger(FeeService.class);

    @Autowired
    private FeeRepository feeRepository;

    /**
     * Gets fees.
     *
     * @return the fees
     */
    public Iterable<Fee> getFees() {
        LOGGER.info("Processing to get all fees");
        return feeRepository.findAll(Sort.by(Sort.Direction.DESC,"date"));
    }

    /**
     * Save fee.
     *
     * @param fee the fee
     */
    public void saveFee(Fee fee){
        LOGGER.info("Processing to save new fee");

        fee.setDate(LocalDateTime.now());
        fee.setRate100(Constants.RATE100);

        feeRepository.save(fee);
    }
}
