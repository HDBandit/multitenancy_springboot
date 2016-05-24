package com.hdbandit.multi_tenant.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.google.common.collect.Lists;
import com.hdbandit.multi_tenant.domain.Invoice;
import com.hdbandit.multi_tenant.repository.InvoiceRepository;

@RestController
@RequestMapping("/{tenantId}/invoice")
public class InvoiceController {
    
    @Autowired
    private InvoiceRepository invoiceRepository;

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Invoice> invoices() {
       return Lists.newArrayList(invoiceRepository.findAll());
    }

}
