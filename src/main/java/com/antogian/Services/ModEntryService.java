package com.antogian.Services;

import com.antogian.DTO.ModEntryDTO;
import com.antogian.Entities.ModEntry;

import java.util.ArrayList;
import java.util.List;

public class ModEntryService
{
    public List<ModEntry> toModEntryEntity(List<ModEntryDTO> allModEntriesDTO)
    {
        List<ModEntry> allModEntries = new ArrayList<ModEntry>();
        try
        {
            for(ModEntryDTO modEntryDTO : allModEntriesDTO)
            {
                ModEntry modEntry = new ModEntry();

                modEntry.setName(modEntryDTO.getName());
                modEntry.setIndex(modEntryDTO.getIndex());

                List<Double> cost = new ArrayList<Double>();
                for(int i=0; i<modEntryDTO.getCost().length; i++)
                {
                    cost.add(modEntryDTO.getCost()[i]);
                }
                modEntry.setCost(cost);

                List<Double> halfCost = new ArrayList<Double>();
                if(modEntryDTO.getHalfCost() != null)
                {
                    for(int i=0; i<modEntryDTO.getHalfCost().length; i++)
                    {
                        cost.add(modEntryDTO.getHalfCost()[i]);
                    }
                    modEntry.setHalfCost(halfCost);
                }

                allModEntries.add(modEntry);
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

        return allModEntries;
    }

    public List<Integer> getInclusionsIndices(List<ModEntryDTO> allModEntries)
    {
        List<Integer> indices = new ArrayList<Integer>();
        try
        {
            for(ModEntryDTO modEntryDTO : allModEntries)
            {
                if(modEntryDTO.isSelected())
                {
                    indices.add(modEntryDTO.getIndex());
                }
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

        return indices;
    }
}
