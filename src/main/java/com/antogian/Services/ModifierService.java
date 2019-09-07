package com.antogian.Services;

import com.antogian.DTO.ModifierDTO;
import com.antogian.Entities.Modifier;

import java.util.ArrayList;
import java.util.List;

public class ModifierService
{
    private ModEntryService modEntryService = new ModEntryService();

    public List<Modifier> toModifierEntity(List<ModifierDTO> allModifiersDTO)
    {
        List<Modifier> allModifiers = new ArrayList<Modifier>();

        try
        {
            for(ModifierDTO modifierDTO : allModifiersDTO)
            {
                Modifier modifier = new Modifier();

                modifier.setName(modifierDTO.getName());
                modifier.setPlatterPrice(modifierDTO.getPlatterPrice());
                modifier.setPlatter(modifierDTO.isPlatter());
                modifier.setHalfEnabled((modifierDTO.isHalfEnabled()));
                modifier.setQualifiersEnabled(modifierDTO.isQualifiersEnabled());

                modifier.setEntries(modEntryService.toModEntryEntity(modifierDTO.getEntries()));

                allModifiers.add(modifier);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return allModifiers;
    }

    public List<Integer> getInclusions(ModifierDTO modifierDTO)
    {
        List<Integer> inclusions = new ArrayList<Integer>();

        try
        {
            inclusions = modEntryService.getInclusionsIndices(modifierDTO.getEntries());
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

        return inclusions;
    }
}
