package com.fourhorses.pitcherbe.category.service;

import com.fourhorses.pitcherbe.category.dto.CategoryDto;
import com.fourhorses.pitcherbe.category.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepository categoryRepository;

    private final ModelMapper modelMapper;

    @Override
    public List<CategoryDto> getAllCategories() {
        return modelMapper.map(categoryRepository.findAll(), new TypeToken<List<CategoryDto>>() {
        }.getType());
    }
}
