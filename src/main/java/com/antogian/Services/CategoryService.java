package com.antogian.Services;

import com.antogian.DTO.CategoryDTO;
import com.antogian.Entities.Category;

import java.util.ArrayList;
import java.util.List;

public class CategoryService
{
    private ItemService itemService = new ItemService();

    public List<Category> toCategoryEntity(List<CategoryDTO> allCategoriesDTO)
    {
        List<Category> allCategories = new ArrayList<Category>();
        try
        {
            for(CategoryDTO categoryDTO : allCategoriesDTO)
            {
                Category category = new Category();

                category.setName(categoryDTO.getName());
                category.setIndex(categoryDTO.getIndex());

                category.setAllItems(itemService.toItemEntity(categoryDTO.getAllItems()));
                allCategories.add(category);
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

        return allCategories;
    }
}
