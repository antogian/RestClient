package com.antogian.Services;

import com.antogian.DTO.ItemDTO;
import com.antogian.DTO.ModifierDTO;
import com.antogian.DTO.SizeDTO;
import com.antogian.Entities.Item;

import java.util.ArrayList;
import java.util.List;

public class ItemService
{
    private SizeService sizeService = new SizeService();
    private ModifierService modifierService = new ModifierService();

    public List<Item> toItemEntity(List<ItemDTO> allItemsDTO)
    {
        List<Item> allItems = new ArrayList<Item>();
        try
        {
            for(ItemDTO itemDTO : allItemsDTO)
            {
                Item item = new Item();

                item.setName(itemDTO.getName());
                item.setIndex(itemDTO.getIndex());
                //----------------------------------------------------------------------------------------------------------
                item.setModifiers(modifierService.toModifierEntity(itemDTO.getModifiers()));

                //----------------------------------------------------------------------------------------------------------
                List<Integer> freeModEntries = new ArrayList<Integer>();
                List<Integer> requiredModEntries = new ArrayList<Integer>();
                for(ModifierDTO modifierDTO : itemDTO.getModifiers())
                {
                    requiredModEntries.add(modifierDTO.getRequiredEntries());
                    freeModEntries.add(modifierDTO.getFreeEntries());
                }
                item.setFreeModEntries(freeModEntries);
                item.setRequiredModEntries(requiredModEntries);
                //----------------------------------------------------------------------------------------------------------
                //----------------------------------------------------------------------------------------------------------
                List<Double> cost = new ArrayList<Double>();
                for(SizeDTO sizeDTO : itemDTO.getAllSizes())
                {
                    cost.add(sizeDTO.getCost());
                }
                item.setCost(cost);
                //----------------------------------------------------------------------------------------------------------
                item.setSize(sizeService.toSizeEntity(itemDTO.getAllSizes()));
                //----------------------------------------------------------------------------------------------------------
                if(itemDTO.getModifiers().size() >= 1)
                    item.setInclusions1(modifierService.getInclusions(itemDTO.getModifiers().get(0)));
                if(itemDTO.getModifiers().size() >= 2)
                    item.setInclusions2(modifierService.getInclusions(itemDTO.getModifiers().get(1)));
                if(itemDTO.getModifiers().size() >= 3)
                    item.setInclusions3(modifierService.getInclusions(itemDTO.getModifiers().get(2)));
                if(itemDTO.getModifiers().size() >= 4)
                    item.setInclusions4(modifierService.getInclusions(itemDTO.getModifiers().get(3)));
                if(itemDTO.getModifiers().size() >= 5)
                    item.setInclusions5(modifierService.getInclusions(itemDTO.getModifiers().get(4)));
                if(itemDTO.getModifiers().size() >= 6)
                    item.setInclusions6(modifierService.getInclusions(itemDTO.getModifiers().get(5)));

                allItems.add(item);
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

        return allItems;
    }

//    private List<Integer> getInclusions(ItemDTO itemDTO, int index)
//    {
//        List<Integer> inclusions = new ArrayList<Integer>();
//
//        //modifierService
//
//        return inclusions;
//    }
}
