package com.antogian.Utilities;

import com.antogian.DTO.*;
import com.antogian.Repositories.OrderDetails;

import java.util.ArrayList;
import java.util.List;

public class OrderDetailsConverter
{
    public static List<OrderDetails> getOrderDetailsFromCart(ShoppingCart cart, int id)
    {
        List<OrderDetails> orderDetailsList = new ArrayList<OrderDetails>();

        int lineNumber = 0;
        for(CartEntry cartEntry : cart.getEntries())
        {
            OrderDetails orderDetails = new OrderDetails();

            orderDetails.setOrderID(id);
            orderDetails.setLineNumber(lineNumber);
            lineNumber++;
            orderDetails.setNumber(String.valueOf(cartEntry.getQuantity()));
            for(SizeDTO sizeDTO : cartEntry.getItem().getAllSizes())
            {
                if(sizeDTO.isSelected())
                {
                    orderDetails.setSize(sizeDTO.getName());
                    orderDetails.setiSize(sizeDTO.getIndex());
                }
            }

            orderDetails.setItem(cartEntry.getItem().getName());
            orderDetails.setPrice("$" + String.valueOf(cartEntry.getItem().getTotalCost()));
            orderDetails.setProps(1);
            orderDetails.setTaxOn(1);
            orderDetails.setItmIdx(cartEntry.getItem().getIndex());
            orderDetails.setLnPriority(0);
            orderDetails.setsPrice(orderDetails.getPrice());
            orderDetails.setInclString1("");
            orderDetails.setInclString2("");
            orderDetails.setProdCode2(orderDetails.getItem());
            orderDetails.setItemName(orderDetails.getItem());

            orderDetailsList.add(orderDetails);

            List<OrderDetails> modifierDetailsList = new ArrayList<OrderDetails>();

            for(ModifierDTO modifierDTO : cartEntry.getItem().getModifiers())
            {
                for(ModEntryDTO modEntryDTO : modifierDTO.getEntries())
                {
                    if(!modEntryDTO.isIncluded() && modEntryDTO.isSelected())
                    {
                        OrderDetails modDetails = new OrderDetails();
                        modDetails.setOrderID(id);
                        modDetails.setLineNumber(lineNumber);
                        setModifierDetails(cartEntry.getItem(), modifierDTO, modEntryDTO, orderDetails, modDetails);
                        modifierDetailsList.add(modDetails);
                        lineNumber++;
                    }
                    if(modEntryDTO.isIncluded() && !modEntryDTO.isSelected())
                    {
                        OrderDetails modDetails = new OrderDetails();
                        modDetails.setOrderID(id);
                        modDetails.setLineNumber(lineNumber);
                        setModifierDetails(cartEntry.getItem(), modifierDTO, modEntryDTO, orderDetails, modDetails);
                        modDetails.setItem("No " + modEntryDTO.getName());
                        modifierDetailsList.add(modDetails);
                        lineNumber++;
                    }
                }
            }
            for(OrderDetails od : modifierDetailsList)
                orderDetailsList.add(od);
        }

        return orderDetailsList;
    }

    private static String getInclusionsString(ModifierDTO modifierDTO)
    {
        StringBuilder inclusions = new StringBuilder();
        inclusions.append(',');

        for(ModEntryDTO modEntryDTO : modifierDTO.getEntries())
        {
            if (modEntryDTO.isIncluded() && modEntryDTO.isSelected())
            {
                inclusions.append((char) modEntryDTO.getIndex());
                inclusions.append(',');
            }
        }

        return inclusions.toString();
    }

    private static String getSelectionsString(ModifierDTO modifierDTO)
    {
        StringBuilder selections = new StringBuilder();
        selections.append(',');

        for(ModEntryDTO modEntryDTO : modifierDTO.getEntries())
        {
            if (modEntryDTO.isSelected())
            {
                selections.append(modEntryDTO.getIndex());
                selections.append(',');
            }
        }

        return selections.toString();
    }

    private static int getIncludedChoices(ModifierDTO modifierDTO)
    {
        StringBuilder inclChoice = new StringBuilder();
        if(modifierDTO.getRequiredEntries() >= 0)
            inclChoice.append(modifierDTO.getRequiredEntries());
        else
            inclChoice.append(0);

        if(inclChoice.length() >= 1)
            inclChoice.append(modifierDTO.getRequiredEntries());
        else
            inclChoice.append(0);

        if(modifierDTO.getFreeEntries() >= 1)
            inclChoice.append(modifierDTO.getFreeEntries());
        else
            inclChoice.append(0);

        String inclChoiceString = inclChoice.toString();
        if(inclChoiceString.equals("000"))
            return 0;
        else
            return Integer.parseInt(inclChoiceString);
    }

    private static void setModifierDetails(ItemDTO itemDTO, ModifierDTO modifierDTO, ModEntryDTO modEntryDTO,
                                           OrderDetails orderDetails, OrderDetails modDetails)
    {
        modDetails.setNumber("");
        modDetails.setSize("");
        modDetails.setItem(modEntryDTO.getName());
        modDetails.setPrice("$" + String.valueOf(modEntryDTO.getTotalCost(orderDetails.getiSize())));
        modDetails.setItmIdx(orderDetails.getItmIdx());
        modDetails.setLnPriority(10);
        modDetails.setiSize(orderDetails.getiSize());
        modDetails.setsPrice(modDetails.getPrice());
        modDetails.setInclString1(getInclusionsString(modifierDTO));
        modDetails.setInclString2(getSelectionsString(modifierDTO));
        modDetails.setInclChoice1(getIncludedChoices(modifierDTO));
        modDetails.setInclChoice2(getIncludedChoices(modifierDTO));
        modDetails.setInclChoice3(getIncludedChoices(modifierDTO));
        modDetails.setInclChoice4(getIncludedChoices(modifierDTO));
        modDetails.setInclChoice5(getIncludedChoices(modifierDTO));
        modDetails.setInclChoice6(getIncludedChoices(modifierDTO));
        modDetails.setProdCode2(itemDTO.getName());
        modDetails.setItemName(itemDTO.getName());
    }
}
