package com.fourhorses.pitcherbe.project.controller;

import com.fourhorses.pitcherbe.common.exception.BadRequestException;
import com.fourhorses.pitcherbe.organization_account.dto.OrganizationAccountDto;
import com.fourhorses.pitcherbe.project.service.ProjectService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/project/{id}/sponsor")
public class SponsorController {
    private final ProjectService projectService;

    @Operation(summary = "Get all sponsors of a project")
    @GetMapping()
    public ResponseEntity<List<OrganizationAccountDto>> getSponsors(@PathVariable Long id) {
        return ResponseEntity.ok(projectService.getSponsors(id));
    }

    @Operation(summary = "Add a sponsor to a project")
    @PostMapping()
    public ResponseEntity<OrganizationAccountDto> addSponsor(@PathVariable Long id, @RequestBody OrganizationAccountDto organizationAccountDto)
            throws BadRequestException {
        return ResponseEntity.ok(projectService.addSponsor(id, organizationAccountDto));
    }

    @Operation(summary = "Remove a sponsor from a project")
    @DeleteMapping()
    public ResponseEntity<Void> removeSponsor(@PathVariable Long id, @RequestBody OrganizationAccountDto organizationAccountDto)
            throws BadRequestException {

        projectService.removeSponsor(id, organizationAccountDto);

        return ResponseEntity.ok().build();
    }
}
