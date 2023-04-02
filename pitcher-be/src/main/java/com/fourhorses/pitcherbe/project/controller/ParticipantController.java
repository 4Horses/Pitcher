package com.fourhorses.pitcherbe.project.controller;

import com.fourhorses.pitcherbe.common.exception.BadRequestException;
import com.fourhorses.pitcherbe.project.service.ProjectService;
import com.fourhorses.pitcherbe.user_account.dto.UserAccountDto;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/project/{id}/participant")
public class ParticipantController {
    private final ProjectService projectService;

    @Operation(summary = "Get all participants of a project")
    @GetMapping()
    public ResponseEntity<List<UserAccountDto>> getParticipant(@PathVariable Long id) {
        var participants = projectService.getParticipants(id);

        HttpStatus status = participants.isEmpty() ? HttpStatus.NO_CONTENT : HttpStatus.OK;
        return new ResponseEntity<>(participants, status);
    }

    @Operation(summary = "Add a participant to a project")
    @PostMapping()
    public ResponseEntity<UserAccountDto> addParticipant(@PathVariable Long id, @RequestBody UserAccountDto userAccountDto)
            throws BadRequestException {
        return ResponseEntity.ok(projectService.addParticipant(id, userAccountDto));
    }

    @Operation(summary = "Remove a participant from a project")
    @DeleteMapping()
    public ResponseEntity<Void> removeParticipant(@PathVariable Long id, @RequestBody UserAccountDto userAccountDto)
            throws BadRequestException {

        projectService.removeParticipant(id, userAccountDto);

        return ResponseEntity.ok().build();
    }
}
