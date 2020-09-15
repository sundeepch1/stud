package com.skc.caching.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.skc.caching.model.Ticket;

public interface TicketBookingDao extends JpaRepository<Ticket, Integer>{

}
