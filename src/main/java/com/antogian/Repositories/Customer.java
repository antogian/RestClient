package com.antogian.Repositories;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class Customer
{
    private int CID;
    private String LName;
    private String FName;
    private String AddrType;
    private String Address1;
    private String Address2;
    private String City;
    private String State;
    private String Zip;
    private String Country;
    private String bLName;
    private String bFName;
    private String bAddress1;
    private String bAddress2;
    private String bCity;
    private String bState;
    private String bZip;
    private String bCountry;
    private String PhoneN1;
    private String PhoneN2;
    private String eMail;
    private BigDecimal MaxCreditAmt;
    private BigDecimal CreditAmt;
    private BigDecimal MinBuyAmt;
    private BigDecimal MaxBuyAmt;
    private String SecLevel;
    private String UserID;
    private byte[] Password;
    private String SecQuestion;
    private String SecAnswer;
    private Timestamp CreateDate;
    private Timestamp UpdateDate;
    private String CCName;
    private byte[] CCNumber;
    private byte[] CCExp;
    private byte[] CCSecCode;
    private String CreditHist;
    private BigDecimal BankAmt;
    private String CustType;
    private int ZoneID;
    private String SpcInstruct;
    private int NOrders;
    private BigDecimal OrdersAmt;
    private String StoreName;
    private int LogIn;
    private int Active;
    private String PhoneExt;
    private String BarcodeID;
    private BigDecimal DiscountAmt;
    private int BadCustomerOn;
    private int SCreditOn;
    private int SBankOn;
    private String CCFName;
    private String CCLName;
    private int IsCellPhone;
    private int CanSolicitPhone;

    public int getCID()
    {
        return CID;
    }

    public void setCID(int CID)
    {
        this.CID = CID;
    }

    public String getLName()
    {
        return LName;
    }

    public void setLName(String LName)
    {
        this.LName = LName;
    }

    public String getFName()
    {
        return FName;
    }

    public void setFName(String FName)
    {
        this.FName = FName;
    }

    public String getAddrType()
    {
        return AddrType;
    }

    public void setAddrType(String addrType)
    {
        AddrType = addrType;
    }

    public String getAddress1()
    {
        return Address1;
    }

    public void setAddress1(String address1)
    {
        Address1 = address1;
    }

    public String getAddress2()
    {
        return Address2;
    }

    public void setAddress2(String address2)
    {
        Address2 = address2;
    }

    public String getCity()
    {
        return City;
    }

    public void setCity(String city)
    {
        City = city;
    }

    public String getState()
    {
        return State;
    }

    public void setState(String state)
    {
        State = state;
    }

    public String getZip()
    {
        return Zip;
    }

    public void setZip(String zip)
    {
        Zip = zip;
    }

    public String getCountry()
    {
        return Country;
    }

    public void setCountry(String country)
    {
        Country = country;
    }

    public String getbLName()
    {
        return bLName;
    }

    public void setbLName(String bLName)
    {
        this.bLName = bLName;
    }

    public String getbFName()
    {
        return bFName;
    }

    public void setbFName(String bFName)
    {
        this.bFName = bFName;
    }

    public String getbAddress1()
    {
        return bAddress1;
    }

    public void setbAddress1(String bAddress1)
    {
        this.bAddress1 = bAddress1;
    }

    public String getbAddress2()
    {
        return bAddress2;
    }

    public void setbAddress2(String bAddress2)
    {
        this.bAddress2 = bAddress2;
    }

    public String getbCity()
    {
        return bCity;
    }

    public void setbCity(String bCity)
    {
        this.bCity = bCity;
    }

    public String getbState()
    {
        return bState;
    }

    public void setbState(String bState)
    {
        this.bState = bState;
    }

    public String getbZip()
    {
        return bZip;
    }

    public void setbZip(String bZip)
    {
        this.bZip = bZip;
    }

    public String getbCountry()
    {
        return bCountry;
    }

    public void setbCountry(String bCountry)
    {
        this.bCountry = bCountry;
    }

    public String getPhoneN1()
    {
        return PhoneN1;
    }

    public void setPhoneN1(String phoneN1)
    {
        PhoneN1 = phoneN1;
    }

    public String getPhoneN2()
    {
        return PhoneN2;
    }

    public void setPhoneN2(String phoneN2)
    {
        PhoneN2 = phoneN2;
    }

    public String geteMail()
    {
        return eMail;
    }

    public void seteMail(String eMail)
    {
        this.eMail = eMail;
    }

    public BigDecimal getMaxCreditAmt()
    {
        return MaxCreditAmt;
    }

    public void setMaxCreditAmt(BigDecimal maxCreditAmt)
    {
        MaxCreditAmt = maxCreditAmt;
    }

    public BigDecimal getCreditAmt()
    {
        return CreditAmt;
    }

    public void setCreditAmt(BigDecimal creditAmt)
    {
        CreditAmt = creditAmt;
    }

    public BigDecimal getMinBuyAmt()
    {
        return MinBuyAmt;
    }

    public void setMinBuyAmt(BigDecimal minBuyAmt)
    {
        MinBuyAmt = minBuyAmt;
    }

    public BigDecimal getMaxBuyAmt()
    {
        return MaxBuyAmt;
    }

    public void setMaxBuyAmt(BigDecimal maxBuyAmt)
    {
        MaxBuyAmt = maxBuyAmt;
    }

    public String getSecLevel()
    {
        return SecLevel;
    }

    public void setSecLevel(String secLevel)
    {
        SecLevel = secLevel;
    }

    public String getUserID()
    {
        return UserID;
    }

    public void setUserID(String userID)
    {
        UserID = userID;
    }

    public byte[] getPassword()
    {
        return Password;
    }

    public void setPassword(byte[] password)
    {
        Password = password;
    }

    public String getSecQuestion()
    {
        return SecQuestion;
    }

    public void setSecQuestion(String secQuestion)
    {
        SecQuestion = secQuestion;
    }

    public String getSecAnswer()
    {
        return SecAnswer;
    }

    public void setSecAnswer(String secAnswer)
    {
        SecAnswer = secAnswer;
    }

    public Timestamp getCreateDate()
    {
        return CreateDate;
    }

    public void setCreateDate(Timestamp createDate)
    {
        CreateDate = createDate;
    }

    public Timestamp getUpdateDate()
    {
        return UpdateDate;
    }

    public void setUpdateDate(Timestamp updateDate)
    {
        UpdateDate = updateDate;
    }

    public String getCCName()
    {
        return CCName;
    }

    public void setCCName(String CCName)
    {
        this.CCName = CCName;
    }

    public byte[] getCCNumber()
    {
        return CCNumber;
    }

    public void setCCNumber(byte[] CCNumber)
    {
        this.CCNumber = CCNumber;
    }

    public byte[] getCCExp()
    {
        return CCExp;
    }

    public void setCCExp(byte[] CCExp)
    {
        this.CCExp = CCExp;
    }

    public byte[] getCCSecCode()
    {
        return CCSecCode;
    }

    public void setCCSecCode(byte[] CCSecCode)
    {
        this.CCSecCode = CCSecCode;
    }

    public String getCreditHist()
    {
        return CreditHist;
    }

    public void setCreditHist(String creditHist)
    {
        CreditHist = creditHist;
    }

    public BigDecimal getBankAmt()
    {
        return BankAmt;
    }

    public void setBankAmt(BigDecimal bankAmt)
    {
        BankAmt = bankAmt;
    }

    public String getCustType()
    {
        return CustType;
    }

    public void setCustType(String custType)
    {
        CustType = custType;
    }

    public int getZoneID()
    {
        return ZoneID;
    }

    public void setZoneID(int zoneID)
    {
        ZoneID = zoneID;
    }

    public String getSpcInstruct()
    {
        return SpcInstruct;
    }

    public void setSpcInstruct(String spcInstruct)
    {
        SpcInstruct = spcInstruct;
    }

    public int getNOrders()
    {
        return NOrders;
    }

    public void setNOrders(int NOrders)
    {
        this.NOrders = NOrders;
    }

    public BigDecimal getOrdersAmt()
    {
        return OrdersAmt;
    }

    public void setOrdersAmt(BigDecimal ordersAmt)
    {
        OrdersAmt = ordersAmt;
    }

    public String getStoreName()
    {
        return StoreName;
    }

    public void setStoreName(String storeName)
    {
        StoreName = storeName;
    }

    public int getLogIn()
    {
        return LogIn;
    }

    public void setLogIn(int logIn)
    {
        LogIn = logIn;
    }

    public int getActive()
    {
        return Active;
    }

    public void setActive(int active)
    {
        Active = active;
    }

    public String getPhoneExt()
    {
        return PhoneExt;
    }

    public void setPhoneExt(String phoneExt)
    {
        PhoneExt = phoneExt;
    }

    public String getBarcodeID()
    {
        return BarcodeID;
    }

    public void setBarcodeID(String barcodeID)
    {
        BarcodeID = barcodeID;
    }

    public BigDecimal getDiscountAmt()
    {
        return DiscountAmt;
    }

    public void setDiscountAmt(BigDecimal discountAmt)
    {
        DiscountAmt = discountAmt;
    }

    public int getBadCustomerOn()
    {
        return BadCustomerOn;
    }

    public void setBadCustomerOn(int badCustomerOn)
    {
        BadCustomerOn = badCustomerOn;
    }

    public int getSCreditOn()
    {
        return SCreditOn;
    }

    public void setSCreditOn(int SCreditOn)
    {
        this.SCreditOn = SCreditOn;
    }

    public int getSBankOn()
    {
        return SBankOn;
    }

    public void setSBankOn(int SBankOn)
    {
        this.SBankOn = SBankOn;
    }

    public String getCCFName()
    {
        return CCFName;
    }

    public void setCCFName(String CCFName)
    {
        this.CCFName = CCFName;
    }

    public String getCCLName()
    {
        return CCLName;
    }

    public void setCCLName(String CCLName)
    {
        this.CCLName = CCLName;
    }

    public int getIsCellPhone()
    {
        return IsCellPhone;
    }

    public void setIsCellPhone(int isCellPhone)
    {
        IsCellPhone = isCellPhone;
    }

    public int getCanSolicitPhone()
    {
        return CanSolicitPhone;
    }

    public void setCanSolicitPhone(int canSolicitPhone)
    {
        CanSolicitPhone = canSolicitPhone;
    }
}
