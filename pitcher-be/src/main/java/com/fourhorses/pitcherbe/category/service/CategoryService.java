package com.fourhorses.pitcherbe.category.service;

import com.fourhorses.pitcherbe.badge.dto.CategoryFrequencyDto;
import com.fourhorses.pitcherbe.category.dto.CategoryDto;
import com.fourhorses.pitcherbe.category.entity.CategoryEntity;

import java.util.List;

public interface CategoryService {
    List<CategoryDto> getAllCategories();

    CategoryEntity getCategoryEntityById(Long id);

    List<CategoryFrequencyDto> getCategoryFrequencyByUserId(Long userId);
}
