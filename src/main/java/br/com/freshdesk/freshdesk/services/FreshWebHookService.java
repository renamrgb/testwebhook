package br.com.freshdesk.freshdesk.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.freshdesk.freshdesk.dto.FreshWebHookDTO;
import br.com.freshdesk.freshdesk.dto.WebHookDTO;
import br.com.freshdesk.freshdesk.entities.FreshWebHook;
import br.com.freshdesk.freshdesk.repositories.FreshWebHookRepository;

@Service
public class FreshWebHookService {
	
	@Autowired
	private FreshWebHookRepository repository;
	
	@Transactional
	public FreshWebHookDTO insert (WebHookDTO dto) {
		
		FreshWebHook entity = new FreshWebHook();
		
		
		copyDtoToEntity(entity, dto);
		
		entity = repository.save(entity);
		
		return new FreshWebHookDTO(entity);
	}
	
	
	
	
	private void copyDtoToEntity(FreshWebHook entity, WebHookDTO dto ) {
		
		entity.setTicketId(dto.getFreshWebHookDto().getTicketId());
		entity.setTicketSubject(dto.getFreshWebHookDto().getTicketSubject());
		entity.setTicketUrl(dto.getFreshWebHookDto().getTicketUrl());
		entity.setTicketLatestPrivateComment(dto.getFreshWebHookDto().getTicketLatestPrivateComment());
		entity.setTicketLatestPublicComment(dto.getFreshWebHookDto().getTicketLatestPublicComment());
		entity.setTicketGroupName(dto.getFreshWebHookDto().getTicketGroupName());
		entity.setTicketAgentEmail(dto.getFreshWebHookDto().getTicketAgentEmail());
		entity.setTicketStatus(dto.getFreshWebHookDto().getTicketStatus());
		entity.setTriggeredEvent(dto.getFreshWebHookDto().getTriggeredEvent());
		entity.setTicketCompanyName(dto.getFreshWebHookDto().getTicketCompanyName());
		entity.setTicketContactEmail(dto.getFreshWebHookDto().getTicketContactEmail());
		entity.setTicketSource(dto.getFreshWebHookDto().getTicketSource());
		
		
	}
	
}
