package com.antogian.Services;

import com.antogian.DTO.ItemDTO;
import com.antogian.DTO.SizeDTO;
import com.antogian.Entities.Size;

import java.util.ArrayList;
import java.util.List;

public class SizeService
{
    public Size toSizeEntity(List<SizeDTO> allSizesDTO)
    {
        Size size = new Size();
        try
        {
            List<String> names = new ArrayList<String>();
            for(SizeDTO sizeDTO : allSizesDTO)
            {
                names.add(sizeDTO.getName());
            }
            size.setNames(names);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

        return size;
    }
}
