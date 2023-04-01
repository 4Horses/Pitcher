package com.fourhorses.pitcherbe.badge.controller;

import com.fourhorses.pitcherbe.badge.dto.BadgeDto;
import com.fourhorses.pitcherbe.badge.service.BadgeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/badge")
public class BadgeController {
    private final BadgeService badgeService;

    @GetMapping("/{id}")
    public ResponseEntity<BadgeDto> getBadgeUserById(@PathVariable Long id) {
        return ResponseEntity.ok(badgeService.getBadgeUserById(id));
    }
}
