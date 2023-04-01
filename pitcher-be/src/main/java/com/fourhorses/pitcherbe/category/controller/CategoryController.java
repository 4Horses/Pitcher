package com.fourhorses.pitcherbe.category.controller;

import com.fourhorses.pitcherbe.category.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class CategoryController {
    private final CategoryService categoryService;
}
