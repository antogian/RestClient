package com.antogian.Repositories;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class Order
{
    private int OrderID;
    private int CheckID;
    private Timestamp CreateDate;
    private Timestamp ServiceDate;
    private String ServiceType;
    private String Resv0;
    private String OrderStatus;
    private String DelayStatus;
    private String PayStatus;
    private String TenderType;
    private Timestamp PayDate;
    private int ServerID;
    private int StationID;
    private int RoomID;
    private String TableID;
    private int NGuests;
    private int CustomerID;
    private String CustLName;
    private String CustFName;
    private String CustAddress;
    private int PPAIndex;
    private String CustPhone;
    private int TillID;
    private int PServerID;
    private int PStationID;
    private int PCashRegID;
    private BigDecimal SubtotalT;
    private BigDecimal SubtotalNT;
    private BigDecimal Tax;
    private BigDecimal Delivery;
    private BigDecimal Discount;
    private BigDecimal Gratuity;
    private BigDecimal Total;
    private BigDecimal Tender;
    private BigDecimal ChangeAmt;
    private BigDecimal EmpDelivery;
    private BigDecimal CshTender;
    private BigDecimal ChkTender;
    private BigDecimal CCTender;
    private BigDecimal GCTender;
    private BigDecimal SATender;
    private BigDecimal PastTender;
    private int DelryEmpID;
    private Timestamp DelryDateStart;
    private Timestamp DelryDateEnd;
    private int MakeEmpID;
    private Timestamp MakeDateStart;
    private Timestamp MakeDateEnd;
    private int CallID;
    private String CancelDate;
    private int ApprovalID;
    private int ChgFrOID;
    private int ChgToOID;
    private String ChgDescription;
    private int PrcFrOID;
    private int PrcToOID;
    private int GiftCertID;
    private int StoreAcctID;
    private BigDecimal SubtotalT1;
    private BigDecimal SubtotalT2;
    private BigDecimal Tax1;
    private BigDecimal Tax2;
    private int NoTaxOn;
    private int ForceCloseOn;
    private Timestamp CCTransDate;
    private String CCTransType;
    private String CCNumberLast;
    private String CCName;
    private int CCTState;
    private BigDecimal CCFee;
    private String DPrintDate;
    private int Accounted;
    private int TillStatus;
    private int ChgIndex;
    private int TaxRateIdx;
    private BigDecimal OverRdDiscount;
    private BigDecimal DynSpclDiscount;
    private BigDecimal Balance;
    private int NSubChecks;
    private BigDecimal SubCheckTotal;
    private int AddToOID;
    private int CashOutOn;
    private int SplitFrOID;
    private String OrderedFrom;
    private int OrderRows;
    private String Comment;
    private int OpenStatus;

    public int getOrderID()
    {
        return OrderID;
    }

    public void setOrderID(int orderID)
    {
        OrderID = orderID;
    }

    public int getCheckID()
    {
        return CheckID;
    }

    public void setCheckID(int checkID)
    {
        CheckID = checkID;
    }

    public Timestamp getCreateDate()
    {
        return CreateDate;
    }

    public void setCreateDate(Timestamp createDate)
    {
        CreateDate = createDate;
    }

    public Timestamp getServiceDate()
    {
        return ServiceDate;
    }

    public void setServiceDate(Timestamp serviceDate)
    {
        ServiceDate = serviceDate;
    }

    public String getServiceType()
    {
        return ServiceType;
    }

    public void setServiceType(String serviceType)
    {
        ServiceType = serviceType;
    }

    public String getResv0()
    {
        return Resv0;
    }

    public void setResv0(String resv0)
    {
        Resv0 = resv0;
    }

    public String getOrderStatus()
    {
        return OrderStatus;
    }

    public void setOrderStatus(String orderStatus)
    {
        OrderStatus = orderStatus;
    }

    public String getDelayStatus()
    {
        return DelayStatus;
    }

    public void setDelayStatus(String delayStatus)
    {
        DelayStatus = delayStatus;
    }

    public String getPayStatus()
    {
        return PayStatus;
    }

    public void setPayStatus(String payStatus)
    {
        PayStatus = payStatus;
    }

    public String getTenderType()
    {
        return TenderType;
    }

    public void setTenderType(String tenderType)
    {
        TenderType = tenderType;
    }

    public Timestamp getPayDate()
    {
        return PayDate;
    }

    public void setPayDate(Timestamp payDate)
    {
        PayDate = payDate;
    }

    public int getServerID()
    {
        return ServerID;
    }

    public void setServerID(int serverID)
    {
        ServerID = serverID;
    }

    public int getStationID()
    {
        return StationID;
    }

    public void setStationID(int stationID)
    {
        StationID = stationID;
    }

    public int getRoomID()
    {
        return RoomID;
    }

    public void setRoomID(int roomID)
    {
        RoomID = roomID;
    }

    public String getTableID()
    {
        return TableID;
    }

    public void setTableID(String tableID)
    {
        TableID = tableID;
    }

    public int getNGuests()
    {
        return NGuests;
    }

    public void setNGuests(int NGuests)
    {
        this.NGuests = NGuests;
    }

    public int getCustomerID()
    {
        return CustomerID;
    }

    public void setCustomerID(int customerID)
    {
        CustomerID = customerID;
    }

    public String getCustLName()
    {
        return CustLName;
    }

    public void setCustLName(String custLName)
    {
        CustLName = custLName;
    }

    public String getCustFName()
    {
        return CustFName;
    }

    public void setCustFName(String custFName)
    {
        CustFName = custFName;
    }

    public String getCustAddress()
    {
        return CustAddress;
    }

    public void setCustAddress(String custAddress)
    {
        CustAddress = custAddress;
    }

    public int getPPAIndex()
    {
        return PPAIndex;
    }

    public void setPPAIndex(int PPAIndex)
    {
        this.PPAIndex = PPAIndex;
    }

    public String getCustPhone()
    {
        return CustPhone;
    }

    public void setCustPhone(String custPhone)
    {
        CustPhone = custPhone;
    }

    public int getTillID()
    {
        return TillID;
    }

    public void setTillID(int tillID)
    {
        TillID = tillID;
    }

    public int getPServerID()
    {
        return PServerID;
    }

    public void setPServerID(int PServerID)
    {
        this.PServerID = PServerID;
    }

    public int getPStationID()
    {
        return PStationID;
    }

    public void setPStationID(int PStationID)
    {
        this.PStationID = PStationID;
    }

    public int getPCashRegID()
    {
        return PCashRegID;
    }

    public void setPCashRegID(int PCashRegID)
    {
        this.PCashRegID = PCashRegID;
    }

    public BigDecimal getSubtotalT()
    {
        return SubtotalT;
    }

    public void setSubtotalT(BigDecimal subtotalT)
    {
        SubtotalT = subtotalT;
    }

    public BigDecimal getSubtotalNT()
    {
        return SubtotalNT;
    }

    public void setSubtotalNT(BigDecimal subtotalNT)
    {
        SubtotalNT = subtotalNT;
    }

    public BigDecimal getTax()
    {
        return Tax;
    }

    public void setTax(BigDecimal tax)
    {
        Tax = tax;
    }

    public BigDecimal getDelivery()
    {
        return Delivery;
    }

    public void setDelivery(BigDecimal delivery)
    {
        Delivery = delivery;
    }

    public BigDecimal getDiscount()
    {
        return Discount;
    }

    public void setDiscount(BigDecimal discount)
    {
        Discount = discount;
    }

    public BigDecimal getGratuity()
    {
        return Gratuity;
    }

    public void setGratuity(BigDecimal gratuity)
    {
        Gratuity = gratuity;
    }

    public BigDecimal getTotal()
    {
        return Total;
    }

    public void setTotal(BigDecimal total)
    {
        Total = total;
    }

    public BigDecimal getTender()
    {
        return Tender;
    }

    public void setTender(BigDecimal tender)
    {
        Tender = tender;
    }

    public BigDecimal getChangeAmt()
    {
        return ChangeAmt;
    }

    public void setChangeAmt(BigDecimal changeAmt)
    {
        ChangeAmt = changeAmt;
    }

    public BigDecimal getEmpDelivery()
    {
        return EmpDelivery;
    }

    public void setEmpDelivery(BigDecimal empDelivery)
    {
        EmpDelivery = empDelivery;
    }

    public BigDecimal getCshTender()
    {
        return CshTender;
    }

    public void setCshTender(BigDecimal cshTender)
    {
        CshTender = cshTender;
    }

    public BigDecimal getChkTender()
    {
        return ChkTender;
    }

    public void setChkTender(BigDecimal chkTender)
    {
        ChkTender = chkTender;
    }

    public BigDecimal getCCTender()
    {
        return CCTender;
    }

    public void setCCTender(BigDecimal CCTender)
    {
        this.CCTender = CCTender;
    }

    public BigDecimal getGCTender()
    {
        return GCTender;
    }

    public void setGCTender(BigDecimal GCTender)
    {
        this.GCTender = GCTender;
    }

    public BigDecimal getSATender()
    {
        return SATender;
    }

    public void setSATender(BigDecimal SATender)
    {
        this.SATender = SATender;
    }

    public BigDecimal getPastTender()
    {
        return PastTender;
    }

    public void setPastTender(BigDecimal pastTender)
    {
        PastTender = pastTender;
    }

    public int getDelryEmpID()
    {
        return DelryEmpID;
    }

    public void setDelryEmpID(int delryEmpID)
    {
        DelryEmpID = delryEmpID;
    }

    public Timestamp getDelryDateStart()
    {
        return DelryDateStart;
    }

    public void setDelryDateStart(Timestamp delryDateStart)
    {
        DelryDateStart = delryDateStart;
    }

    public Timestamp getDelryDateEnd()
    {
        return DelryDateEnd;
    }

    public void setDelryDateEnd(Timestamp delryDateEnd)
    {
        DelryDateEnd = delryDateEnd;
    }

    public int getMakeEmpID()
    {
        return MakeEmpID;
    }

    public void setMakeEmpID(int makeEmpID)
    {
        MakeEmpID = makeEmpID;
    }

    public Timestamp getMakeDateStart()
    {
        return MakeDateStart;
    }

    public void setMakeDateStart(Timestamp makeDateStart)
    {
        MakeDateStart = makeDateStart;
    }

    public Timestamp getMakeDateEnd()
    {
        return MakeDateEnd;
    }

    public void setMakeDateEnd(Timestamp makeDateEnd)
    {
        MakeDateEnd = makeDateEnd;
    }

    public int getCallID()
    {
        return CallID;
    }

    public void setCallID(int callID)
    {
        CallID = callID;
    }

    public String getCancelDate()
    {
        return CancelDate;
    }

    public void setCancelDate(String cancelDate)
    {
        CancelDate = cancelDate;
    }

    public int getApprovalID()
    {
        return ApprovalID;
    }

    public void setApprovalID(int approvalID)
    {
        ApprovalID = approvalID;
    }

    public int getChgFrOID()
    {
        return ChgFrOID;
    }

    public void setChgFrOID(int chgFrOID)
    {
        ChgFrOID = chgFrOID;
    }

    public int getChgToOID()
    {
        return ChgToOID;
    }

    public void setChgToOID(int chgToOID)
    {
        ChgToOID = chgToOID;
    }

    public String getChgDescription()
    {
        return ChgDescription;
    }

    public void setChgDescription(String chgDescription)
    {
        ChgDescription = chgDescription;
    }

    public int getPrcFrOID()
    {
        return PrcFrOID;
    }

    public void setPrcFrOID(int prcFrOID)
    {
        PrcFrOID = prcFrOID;
    }

    public int getPrcToOID()
    {
        return PrcToOID;
    }

    public void setPrcToOID(int prcToOID)
    {
        PrcToOID = prcToOID;
    }

    public int getGiftCertID()
    {
        return GiftCertID;
    }

    public void setGiftCertID(int giftCertID)
    {
        GiftCertID = giftCertID;
    }

    public int getStoreAcctID()
    {
        return StoreAcctID;
    }

    public void setStoreAcctID(int storeAcctID)
    {
        StoreAcctID = storeAcctID;
    }

    public BigDecimal getSubtotalT1()
    {
        return SubtotalT1;
    }

    public void setSubtotalT1(BigDecimal subtotalT1)
    {
        SubtotalT1 = subtotalT1;
    }

    public BigDecimal getSubtotalT2()
    {
        return SubtotalT2;
    }

    public void setSubtotalT2(BigDecimal subtotalT2)
    {
        SubtotalT2 = subtotalT2;
    }

    public BigDecimal getTax1()
    {
        return Tax1;
    }

    public void setTax1(BigDecimal tax1)
    {
        Tax1 = tax1;
    }

    public BigDecimal getTax2()
    {
        return Tax2;
    }

    public void setTax2(BigDecimal tax2)
    {
        Tax2 = tax2;
    }

    public int getNoTaxOn()
    {
        return NoTaxOn;
    }

    public void setNoTaxOn(int noTaxOn)
    {
        NoTaxOn = noTaxOn;
    }

    public int getForceCloseOn()
    {
        return ForceCloseOn;
    }

    public void setForceCloseOn(int forceCloseOn)
    {
        ForceCloseOn = forceCloseOn;
    }

    public Timestamp getCCTransDate()
    {
        return CCTransDate;
    }

    public void setCCTransDate(Timestamp CCTransDate)
    {
        this.CCTransDate = CCTransDate;
    }

    public String getCCTransType()
    {
        return CCTransType;
    }

    public void setCCTransType(String CCTransType)
    {
        this.CCTransType = CCTransType;
    }

    public String getCCNumberLast()
    {
        return CCNumberLast;
    }

    public void setCCNumberLast(String CCNumberLast)
    {
        this.CCNumberLast = CCNumberLast;
    }

    public String getCCName()
    {
        return CCName;
    }

    public void setCCName(String CCName)
    {
        this.CCName = CCName;
    }

    public int getCCTState()
    {
        return CCTState;
    }

    public void setCCTState(int CCTState)
    {
        this.CCTState = CCTState;
    }

    public BigDecimal getCCFee()
    {
        return CCFee;
    }

    public void setCCFee(BigDecimal CCFee)
    {
        this.CCFee = CCFee;
    }

    public String getDPrintDate()
    {
        return DPrintDate;
    }

    public void setDPrintDate(String DPrintDate)
    {
        this.DPrintDate = DPrintDate;
    }

    public int getAccounted()
    {
        return Accounted;
    }

    public void setAccounted(int accounted)
    {
        Accounted = accounted;
    }

    public int getTillStatus()
    {
        return TillStatus;
    }

    public void setTillStatus(int tillStatus)
    {
        TillStatus = tillStatus;
    }

    public int getChgIndex()
    {
        return ChgIndex;
    }

    public void setChgIndex(int chgIndex)
    {
        ChgIndex = chgIndex;
    }

    public int getTaxRateIdx()
    {
        return TaxRateIdx;
    }

    public void setTaxRateIdx(int taxRateIdx)
    {
        TaxRateIdx = taxRateIdx;
    }

    public BigDecimal getOverRdDiscount()
    {
        return OverRdDiscount;
    }

    public void setOverRdDiscount(BigDecimal overRdDiscount)
    {
        OverRdDiscount = overRdDiscount;
    }

    public BigDecimal getDynSpclDiscount()
    {
        return DynSpclDiscount;
    }

    public void setDynSpclDiscount(BigDecimal dynSpclDiscount)
    {
        DynSpclDiscount = dynSpclDiscount;
    }

    public BigDecimal getBalance()
    {
        return Balance;
    }

    public void setBalance(BigDecimal balance)
    {
        Balance = balance;
    }

    public int getNSubChecks()
    {
        return NSubChecks;
    }

    public void setNSubChecks(int NSubChecks)
    {
        this.NSubChecks = NSubChecks;
    }

    public BigDecimal getSubCheckTotal()
    {
        return SubCheckTotal;
    }

    public void setSubCheckTotal(BigDecimal subCheckTotal)
    {
        SubCheckTotal = subCheckTotal;
    }

    public int getAddToOID()
    {
        return AddToOID;
    }

    public void setAddToOID(int addToOID)
    {
        AddToOID = addToOID;
    }

    public int getCashOutOn()
    {
        return CashOutOn;
    }

    public void setCashOutOn(int cashOutOn)
    {
        CashOutOn = cashOutOn;
    }

    public int getSplitFrOID()
    {
        return SplitFrOID;
    }

    public void setSplitFrOID(int splitFrOID)
    {
        SplitFrOID = splitFrOID;
    }

    public String getOrderedFrom()
    {
        return OrderedFrom;
    }

    public void setOrderedFrom(String orderedFrom)
    {
        OrderedFrom = orderedFrom;
    }

    public int getOrderRows()
    {
        return OrderRows;
    }

    public void setOrderRows(int orderRows)
    {
        OrderRows = orderRows;
    }

    public String getComment()
    {
        return Comment;
    }

    public void setComment(String comment)
    {
        Comment = comment;
    }

    public int getOpenStatus()
    {
        return OpenStatus;
    }

    public void setOpenStatus(int openStatus)
    {
        OpenStatus = openStatus;
    }
}
