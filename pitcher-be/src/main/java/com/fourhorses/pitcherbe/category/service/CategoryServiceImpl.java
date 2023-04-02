package com.fourhorses.pitcherbe.category.service;

import com.fourhorses.pitcherbe.badge.dto.CategoryFrequencyDto;
import com.fourhorses.pitcherbe.category.dto.CategoryDto;
import com.fourhorses.pitcherbe.category.entity.CategoryEntity;
import com.fourhorses.pitcherbe.category.repository.CategoryRepository;
import com.fourhorses.pitcherbe.common.exception.BusinessException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Service
public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepository categoryRepository;

    private final ModelMapper modelMapper;

    @Override
    public List<CategoryDto> getAllCategories() {
        log.info("Getting all categories");
        return modelMapper.map(categoryRepository.findAll(), new TypeToken<List<CategoryDto>>() {
        }.getType());
    }

    @Override
    public CategoryEntity getCategoryEntityById(Long id) {
        log.info("Getting category by id {}", id);
        return categoryRepository.findById(id)
                .orElseThrow(() -> new BusinessException("Category not found"));
    }

    @Override
    public List<CategoryFrequencyDto> getCategoryFrequencyByUserId(Long userId) {
        log.info("Getting category frequency by user id {}", userId);
        List<Long> categoryIds = categoryRepository.findAll().stream().map(CategoryEntity::getId).toList();
        List<CategoryFrequencyDto> categoryFrequencyDtos = new ArrayList<>();

        categoryIds.forEach(categoryId -> {
            Long frequency = categoryRepository.countCategoryFrequency(userId, categoryId);
            categoryFrequencyDtos.add(CategoryFrequencyDto.builder()
                    .categoryId(categoryId)
                    .frequency(frequency)
                    .build());
        });

        return categoryFrequencyDtos;
    }
}
