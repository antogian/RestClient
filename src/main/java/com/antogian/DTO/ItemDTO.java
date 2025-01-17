package com.antogian.DTO;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

public class ItemDTO
{
    private String name;
    private String id;
    private int index;
    private double cost;
    private double totalCost;

    private List<SizeDTO> allSizes;
    private List<ModifierDTO> modifiers;
    private int[] freeModEntries;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public int getIndex()
    {
        return index;
    }

    public void setIndex(int index)
    {
        this.index = index;
    }

    public List<ModifierDTO> getModifiers()
    {
        return modifiers;
    }

    public void setModifiers(List<ModifierDTO> modifiers)
    {
        this.modifiers = modifiers;
    }

    public int[] getFreeModEntries()
    {
        return freeModEntries;
    }

    public void setFreeModEntries(int[] freeModEntries)
    {
        this.freeModEntries = freeModEntries;
    }

    public List<SizeDTO> getAllSizes()
    {
        return allSizes;
    }

    public void setAllSizes(List<SizeDTO> allSizes)
    {
        this.allSizes = allSizes;
    }

    public double getCost()
    {
        return cost;
    }

    public void setCost(double cost)
    {
        this.cost = cost;
    }

    public double getTotalCost()
    {
        BigDecimal bd = new BigDecimal(Double.toString(totalCost));
        bd = bd.setScale(2, RoundingMode.HALF_UP);

        //return bd.doubleValue();

        return bd.doubleValue();
    }

    public void setTotalCost(double totalCost)
    {
        this.totalCost = totalCost;
    }

    public void calculateTotalCost()
    {
        double tempCost = cost;
        int index = 1;
        if(!(allSizes == null || allSizes.isEmpty()))
        {
            for(SizeDTO size : allSizes)
            {
                if(size.isSelected())
                {
                    tempCost = size.getCost();
                    index = size.getIndex();
                }
            }
        }
        else
        {
            tempCost = cost;
        }
        if(!(modifiers == null || modifiers.isEmpty()))
        {
            for(ModifierDTO modifier : modifiers)
            {
                if(!(modifier.getEntries() == null || modifier.getEntries().isEmpty()))
                {
                    for(ModEntryDTO entry : modifier.getEntries())
                    {
                        if(entry.isSelected())
                        {
                            tempCost += entry.getTotalCost(index-1);
                        }
                    }
                }
            }
        }
        totalCost = tempCost;
    }
}
