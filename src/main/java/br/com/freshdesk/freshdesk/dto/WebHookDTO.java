package br.com.freshdesk.freshdesk.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WebHookDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@JsonProperty(value = "freshdesk_webhook")
	private FreshWebHookDTO freshWebHookDto;
	
	
	public WebHookDTO() {
	}


	public FreshWebHookDTO getFreshWebHookDto() {
		return freshWebHookDto;
	}


	public void setFreshWebHookDto(FreshWebHookDTO freshWebHookDto) {
		this.freshWebHookDto = freshWebHookDto;
	}


	@Override
	public String toString() {
		//System.out.println("Teste");
		return freshWebHookDto.getTicketId().toString() + " - " + freshWebHookDto.getTicketSubject().toString();
	}
	
	
}
