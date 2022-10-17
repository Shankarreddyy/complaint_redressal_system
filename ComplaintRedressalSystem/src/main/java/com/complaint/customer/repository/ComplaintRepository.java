package com.complaint.customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.complaint.customer.entities.Complaint;

@Repository
public interface ComplaintRepository extends JpaRepository<Complaint, Integer> {

}
