package com.hdbandit.multi_tenant.repository;

import org.springframework.data.repository.CrudRepository;

import com.hdbandit.multi_tenant.domain.Invoice;

public interface InvoiceRepository extends CrudRepository<Invoice, Long> {

}
