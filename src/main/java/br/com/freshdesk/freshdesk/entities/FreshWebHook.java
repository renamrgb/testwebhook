package br.com.freshdesk.freshdesk.entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_fresh_web_hook")
public class FreshWebHook implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(unique=true, nullable=false)
	private Long ticketId;
	private String ticketSubject;
	private String ticketUrl;
	private String ticketLatestPublicComment;
	private String ticketLatestPrivateComment;
	private String ticketGroupName;
	private String ticketAgentEmail;
	private String ticketStatus;
	private String triggeredEvent;
	private String ticketCompanyName;
	private String ticketContactEmail;
	private String ticketSource;
	
	
	
	public FreshWebHook() {

	}

	

	public FreshWebHook(Long id, Long ticketId, String ticketSubject, String ticketUrl,
			String ticketLatestPublicComment, String ticketLatestPrivateComment, String ticketGroupName,
			String ticketAgentEmail, String ticketStatus, String triggeredEvent, String ticketCompanyName,
			String ticketContactEmail, String ticketSource) {
		super();
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



	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FreshWebHook other = (FreshWebHook) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
	
}
