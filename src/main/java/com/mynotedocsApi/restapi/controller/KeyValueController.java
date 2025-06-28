package com.mynotedocsApi.restapi.controller;

import java.util.Map;
import com.mynotedocsApi.restapi.service.KeyValueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/kv")
public class KeyValueController {

	@Autowired
	private KeyValueService service;

	@PostMapping
	public ResponseEntity<?> save(@RequestBody Map<String, String> body) {
		return ResponseEntity.ok(service.save(body.get("key"), body.get("value")));
	}

	@GetMapping("/{key}")
	public ResponseEntity<?> get(@PathVariable String key) {
		return service.get(key)
				.map(ResponseEntity::ok)
				.orElse(ResponseEntity.notFound().build());
	}

	@GetMapping("/search")
	public ResponseEntity<?> search(@RequestParam String query) {
		return ResponseEntity.ok(service.search(query));
	}
}
