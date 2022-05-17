package br.com.freshdesk.freshdesk.controllers;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.com.freshdesk.freshdesk.dto.FreshWebHookDTO;
import br.com.freshdesk.freshdesk.dto.WebHookDTO;
import br.com.freshdesk.freshdesk.services.FreshWebHookService;

@RestController
@RequestMapping(value = "/ticket")
public class FreshWebHookController {

	@Autowired
	private FreshWebHookService service;

	@PostMapping
	public ResponseEntity<FreshWebHookDTO> insert(@RequestBody WebHookDTO dto) {

		FreshWebHookDTO responseDto = new FreshWebHookDTO();
		responseDto = service.insert(dto);

		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(responseDto.getId())
				.toUri();

		return ResponseEntity.created(uri).body(responseDto);
	}

}
