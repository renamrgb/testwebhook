package br.com.freshdesk.freshdesk.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

import br.com.freshdesk.freshdesk.entities.FreshWebHook;

public class FreshWebHookDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@JsonProperty(value = "id")
	private Long id;
	@JsonProperty(value = "ticket_id")
	private Long ticketId;
	@JsonProperty(value = "ticket_subject")
	private String ticketSubject;
	@JsonProperty(value = "ticket_url")
	private String ticketUrl;
	@JsonProperty(value = "ticket_latest_public_comment")
	private String ticketLatestPublicComment;
	@JsonProperty(value = "ticket_latest_private_comment")
	private String ticketLatestPrivateComment;
	@JsonProperty(value = "ticket_group_name")
	private String ticketGroupName;
	@JsonProperty(value = "ticket_agent_email")
	private String ticketAgentEmail;
	@JsonProperty(value = "ticket_status")
	private String ticketStatus;
	@JsonProperty(value = "triggered_event")
	private String triggeredEvent;
	@JsonProperty(value = "ticket_company_name")
	private String ticketCompanyName;
	@JsonProperty(value = "ticket_contact_email")
	private String ticketContactEmail;
	@JsonProperty(value = "ticket_source")
	private String ticketSource;
	public FreshWebHookDTO() {

	}

	public FreshWebHookDTO(FreshWebHook entity) {
		this.id = entity.getId();
		this.ticketId = entity.getTicketId();
		this.ticketSubject = entity.getTicketSubject();
		this.ticketUrl = entity.getTicketUrl();
		this.ticketLatestPrivateComment = entity.getTicketLatestPrivateComment();
		this.ticketLatestPublicComment = entity.getTicketLatestPublicComment();
		this.ticketGroupName = entity.getTicketGroupName();
		this.ticketAgentEmail = entity.getTicketAgentEmail();
		this.ticketStatus = entity.getTicketStatus();
		this.triggeredEvent = entity.getTriggeredEvent();
		this.ticketCompanyName = entity.getTicketCompanyName();
		this.ticketContactEmail = entity.getTicketContactEmail();
		this.ticketSource = entity.getTicketSource();
	}
	
	

	public FreshWebHookDTO(Long id, Long ticketId, String ticketSubject, String ticketUrl,
			String ticketLatestPublicComment, String ticketLatestPrivateComment, String ticketGroupName,
			String ticketAgentEmail, String ticketStatus, String triggeredEvent, String ticketCompanyName,
			String ticketContactEmail, String ticketSource) {
		this.id = id;
		this.ticketId = ticketId;
		this.ticketSubject = ticketSubject;
		this.ticketUrl = ticketUrl;
		this.ticketLatestPublicComment = ticketLatestPublicComment;
		this.ticketLatestPrivateComment = ticketLatestPrivateComment;
		this.ticketGroupName = ticketGroupName;
		this.ticketAgentEmail = ticketAgentEmail;
		this.ticketStatus = ticketStatus;
		this.triggeredEvent = triggeredEvent;
		this.ticketCompanyName = ticketCompanyName;
		this.ticketContactEmail = ticketContactEmail;
		this.ticketSource = ticketSource;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getTicketId() {
		return ticketId;
	}

	public void setTicketId(Long ticketId) {
		this.ticketId = ticketId;
	}

	public String getTicketSubject() {
		return ticketSubject;
	}

	public void setTicketSubject(String ticketSubject) {
		this.ticketSubject = ticketSubject;
	}

	public String getTicketUrl() {
		return ticketUrl;
	}

	public void setTicketUrl(String ticketUrl) {
		this.ticketUrl = ticketUrl;
	}

	public String getTicketLatestPublicComment() {
		return ticketLatestPublicComment;
	}

	public void setTicketLatestPublicComment(String ticketLatestPublicComment) {
		this.ticketLatestPublicComment = ticketLatestPublicComment;
	}

	public String getTicketLatestPrivateComment() {
		return ticketLatestPrivateComment;
	}

	public void setTicketLatestPrivateComment(String ticketLatestPrivateComment) {
		this.ticketLatestPrivateComment = ticketLatestPrivateComment;
	}

	public String getTicketGroupName() {
		return ticketGroupName;
	}

	public void setTicketGroupName(String ticketGroupName) {
		this.ticketGroupName = ticketGroupName;
	}

	public String getTicketAgentEmail() {
		return ticketAgentEmail;
	}

	public void setTicketAgentEmail(String ticketAgentEmail) {
		this.ticketAgentEmail = ticketAgentEmail;
	}

	public String getTicketStatus() {
		return ticketStatus;
	}

	public void setTicketStatus(String ticketStatus) {
		this.ticketStatus = ticketStatus;
	}

	public String getTriggeredEvent() {
		return triggeredEvent;
	}

	public void setTriggeredEvent(String triggeredEvent) {
		this.triggeredEvent = triggeredEvent;
	}

	public String getTicketCompanyName() {
		return ticketCompanyName;
	}

	public void setTicketCompanyName(String ticketCompanyName) {
		this.ticketCompanyName = ticketCompanyName;
	}

	public String getTicketContactEmail() {
		return ticketContactEmail;
	}

	public void setTicketContactEmail(String ticketContactEmail) {
		this.ticketContactEmail = ticketContactEmail;
	}

	public String getTicketSource() {
		return ticketSource;
	}

	public void setTicketSource(String ticketSource) {
		this.ticketSource = ticketSource;
	}


	
	
	
}
