package com.skc.caching.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.skc.caching.dao.TicketBookingDao;
import com.skc.caching.model.Ticket;


@Service
public class TicketBookingService {
	
	@Autowired
	CacheManager cacheManager;

	@Autowired
	private TicketBookingDao ticketBookingDao;
	
	@Cacheable(value="ticketsCache",key="#ticketId", unless="#result==null")
	public Ticket getTicketById(Integer ticketId) {
		Ticket  ticket= ticketBookingDao.getOne(ticketId);
		return ticket;
	}
	
	@CacheEvict(value="ticketsCache",key="#ticketId")
	public void deleteTicket(Integer ticketId) {
		ticketBookingDao.deleteById(ticketId);
	}
	
	@CachePut(value="ticketsCache",key="#ticketId")
	public Ticket updateTicket(Integer ticketId, String newEmail) {
		Ticket ticketFromDb = ticketBookingDao.getOne(ticketId);
		ticketFromDb.setEmail(newEmail);
		Ticket upadedTicket = ticketBookingDao.save(ticketFromDb);
		return upadedTicket;
	}
	
	public Ticket getTicket() {
		//List<Ticket> list = new ArrayList<>();
		Cache cache = cacheManager.getCache("ticketsCache");
		System.out.println(cache.getName());
		Ticket l =  cache.get(3, Ticket.class);
		//list.forEach(l-> System.out.println(l.toString()));
		return l;
	}
	
	
}
