package com.mongomonguito.xmens.services;

import com.mongomonguito.xmens.documents.Xmen;
import com.mongomonguito.xmens.repository.XmenRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class XmenService {

    @Autowired
    XmenRepo xmenRepo;

    public Xmen insertOne(Xmen xmen) {
        return xmenRepo.insert(xmen);
    }
}
