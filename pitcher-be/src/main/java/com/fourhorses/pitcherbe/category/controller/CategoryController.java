package com.fourhorses.pitcherbe.category.controller;

import com.fourhorses.pitcherbe.category.dto.CategoryDto;
import com.fourhorses.pitcherbe.category.service.CategoryService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/category")
public class CategoryController {
    private final CategoryService categoryService;

    @Operation(summary = "Get all categories")
    @GetMapping()
    public ResponseEntity<List<CategoryDto>> getAllCategories() {
        var categories = categoryService.getAllCategories();

        HttpStatus status = CollectionUtils.isEmpty(categories) ? HttpStatus.NO_CONTENT : HttpStatus.OK;
        return new ResponseEntity<>(categories, status);
    }
}
