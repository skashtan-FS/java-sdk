package com.global.api.serviceConfigs;

import com.global.api.entities.Address;
import com.global.api.entities.exceptions.ConfigurationException;
import com.global.api.network.enums.*;
import com.global.api.utils.StringUtils;

public class AcceptorConfig {
    // DE??
    private Address address;

    // DE22 - POS DATA CODE
    private CardDataInputCapability cardDataInputCapability = CardDataInputCapability.MagStripe_KeyEntrty;
    private CardHolderAuthenticationCapability cardHolderAuthenticationCapability = CardHolderAuthenticationCapability.None;
    private boolean cardCaptureCapability = false;
    private OperatingEnvironment operatingEnvironment = OperatingEnvironment.OnPremises_CardAcceptor_Attended;
    private CardHolderAuthenticationEntity cardHolderAuthenticationEntity = CardHolderAuthenticationEntity.NotAuthenticated;
    private CardDataOutputCapability cardDataOutputCapability = CardDataOutputCapability.None;
    private TerminalOutputCapability terminalOutputCapability = TerminalOutputCapability.None;
    private PinCaptureCapability pinCaptureCapability = PinCaptureCapability.TwelveCharacters;

    // DE48_2 - HARDWARE SOFTWARE CONFIG
    private String hardwareLevel;
    private String softwareLevel;
    private String operatingSystemLevel;

    // DE48_33 | DE62.NPC - POS CONFIGURATION
    private String timezone;
    private Boolean supportsPartialApproval;
    private Boolean supportsReturnBalance;
    private Boolean supportsCashOver;
    private Boolean mobileDevice;
    private Boolean supportsShutOffAmount;
    private Boolean supportsDiscoverNetworkReferenceId;
    private Boolean supportsAvsCnvVoidReferrals;
    private Boolean supportsEmvPin;

    // DE127 - FORWARDING DATA
    private EncryptionType supportedEncryptionType = EncryptionType.TEP2;

    // DE??
    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }

    // DE22 - POS DATA CODE
    public CardDataInputCapability getCardDataInputCapability() {
        return cardDataInputCapability;
    }
    public void setCardDataInputCapability(CardDataInputCapability cardDataInputCapability) {
        this.cardDataInputCapability = cardDataInputCapability;
    }
    public CardHolderAuthenticationCapability getCardHolderAuthenticationCapability() {
        return cardHolderAuthenticationCapability;
    }
    public void setCardHolderAuthenticationCapability(CardHolderAuthenticationCapability cardHolderAuthenticationCapability) {
        this.cardHolderAuthenticationCapability = cardHolderAuthenticationCapability;
    }
    public boolean isCardCaptureCapability() {
        return cardCaptureCapability;
    }
    public void setCardCaptureCapability(boolean cardCaptureCapability) {
        this.cardCaptureCapability = cardCaptureCapability;
    }
    public OperatingEnvironment getOperatingEnvironment() {
        return operatingEnvironment;
    }
    public void setOperatingEnvironment(OperatingEnvironment operatingEnvironment) {
        this.operatingEnvironment = operatingEnvironment;
    }
    public CardHolderAuthenticationEntity getCardHolderAuthenticationEntity() {
        return cardHolderAuthenticationEntity;
    }
    public void setCardHolderAuthenticationEntity(CardHolderAuthenticationEntity cardHolderAuthenticationEntity) {
        this.cardHolderAuthenticationEntity = cardHolderAuthenticationEntity;
    }
    public CardDataOutputCapability getCardDataOutputCapability() {
        return cardDataOutputCapability;
    }
    public void setCardDataOutputCapability(CardDataOutputCapability cardDataOutputCapability) {
        this.cardDataOutputCapability = cardDataOutputCapability;
    }
    public TerminalOutputCapability getTerminalOutputCapability() {
        return terminalOutputCapability;
    }
    public void setTerminalOutputCapability(TerminalOutputCapability terminalOutputCapability) {
        this.terminalOutputCapability = terminalOutputCapability;
    }
    public PinCaptureCapability getPinCaptureCapability() {
        return pinCaptureCapability;
    }
    public void setPinCaptureCapability(PinCaptureCapability pinCaptureCapability) {
        this.pinCaptureCapability = pinCaptureCapability;
    }

    // DE48_2 - HARDWARE SOFTWARE CONFIG
    public String getHardwareLevel() {
        return hardwareLevel;
    }
    public void setHardwareLevel(String hardwareLevel) {
        this.hardwareLevel = hardwareLevel;
    }
    public String getSoftwareLevel() {
        return softwareLevel;
    }
    public void setSoftwareLevel(String softwareLevel) {
        this.softwareLevel = softwareLevel;
    }
    public String getOperatingSystemLevel() {
        return operatingSystemLevel;
    }
    public void setOperatingSystemLevel(String operatingSystemLevel) {
        this.operatingSystemLevel = operatingSystemLevel;
    }

    // DE48_33 POS CONFIGURATION
    public String getTimezone() {
        return timezone;
    }
    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }
    public Boolean getSupportsPartialApproval() {
        return supportsPartialApproval;
    }
    public void setSupportsPartialApproval(Boolean supportsPartialApproval) {
        this.supportsPartialApproval = supportsPartialApproval;
    }
    public Boolean getSupportsShutOffAmount() {
        return supportsShutOffAmount;
    }
    public void setSupportsShutOffAmount(Boolean supportsShutOffAmount) {
        this.supportsShutOffAmount = supportsShutOffAmount;
    }
    public Boolean getSupportsReturnBalance() {
        return supportsReturnBalance;
    }
    public void setSupportsReturnBalance(Boolean supportsReturnBalance) {
        this.supportsReturnBalance = supportsReturnBalance;
    }
    public Boolean getSupportsCashOver() {
        return supportsCashOver;
    }
    public void setSupportsCashOver(Boolean supportsCashOver) {
        this.supportsCashOver = supportsCashOver;
    }
    public Boolean getSupportsDiscoverNetworkReferenceId() {
        return supportsDiscoverNetworkReferenceId;
    }
    public void setSupportsDiscoverNetworkReferenceId(Boolean supportsDiscoverNetworkReferenceId) {
        this.supportsDiscoverNetworkReferenceId = supportsDiscoverNetworkReferenceId;
    }
    public Boolean getSupportsAvsCnvVoidReferrals() {
        return supportsAvsCnvVoidReferrals;
    }
    public void setSupportsAvsCnvVoidReferrals(Boolean supportsAvsCnvVoidReferrals) {
        this.supportsAvsCnvVoidReferrals = supportsAvsCnvVoidReferrals;
    }
    public Boolean getSupportsEmvPin() {
        return supportsEmvPin;
    }
    public void setSupportsEmvPin(Boolean supportsEmvPin) {
        this.supportsEmvPin = supportsEmvPin;
    }
    public Boolean getMobileDevice() {
        return mobileDevice;
    }
    public void setMobileDevice(Boolean mobileDevice) {
        this.mobileDevice = mobileDevice;
    }
    public boolean hasPosConfiguration_MessageControl() {
        return (!StringUtils.isNullOrEmpty(timezone)
                || supportsPartialApproval != null
                || supportsReturnBalance != null
                || supportsCashOver != null
                || mobileDevice != null);
    }
    public boolean hasPosConfiguration_IssuerData() {
        return (supportsPartialApproval != null
                || supportsShutOffAmount != null
                || supportsReturnBalance != null
                || supportsDiscoverNetworkReferenceId != null
                || supportsAvsCnvVoidReferrals != null
                || supportsEmvPin != null
                || mobileDevice != null);
    }
    public String getPosConfigForIssuerData() {
        String rvalue = supportsPartialApproval != null ? supportsPartialApproval ? "Y" : "N" : "N";
        rvalue = rvalue.concat(supportsShutOffAmount != null ? supportsShutOffAmount ? "Y" : "N" : "N")
                .concat("N")
                .concat(supportsReturnBalance != null ? supportsReturnBalance ? "Y" : "N" : "N")
                .concat(supportsDiscoverNetworkReferenceId != null ? supportsDiscoverNetworkReferenceId ? "Y" : "N" : "N")
                .concat(supportsAvsCnvVoidReferrals != null ? supportsAvsCnvVoidReferrals ? "Y" : "N" : "N")
                .concat(supportsEmvPin != null ? supportsEmvPin ? "Y" : "N" : "N")
                .concat(mobileDevice != null ? mobileDevice ? "Y" : "N" : "N")
                .concat("N");
        return rvalue;
    }

    // DE127 FORWARDING DATA
    public EncryptionType getSupportedEncryptionType() {
        return supportedEncryptionType;
    }
    public void setSupportedEncryptionType(EncryptionType supportedEncryptionType) {
        this.supportedEncryptionType = supportedEncryptionType;
    }

    public void validate() throws ConfigurationException {
        if(!StringUtils.isNullOrEmpty(hardwareLevel) && hardwareLevel.length() > 4) {
            throw new ConfigurationException("Hardware Level must be no more than 8 characters.");
        }

        if(!StringUtils.isNullOrEmpty(softwareLevel) && softwareLevel.length() > 8) {
            throw new ConfigurationException("Software Level must be no more than 8 characters.");
        }

        if(!StringUtils.isNullOrEmpty(operatingSystemLevel) && operatingSystemLevel.length() > 8) {
            throw new ConfigurationException("Operating System Level must be no more than 8 characters.");
        }

        if(address != null) {
            if(address.getName() == null || address.getStreetAddress1() == null || address.getCity() == null) {
                throw new ConfigurationException("Missing Acceptor Address Field: Name, Street1 or City.");
            }

            if(address.getPostalCode() == null || address.getState() == null || address.getCountry() == null) {
                throw new ConfigurationException("Missing Acceptor Address Field: PostalCode, State/Region or Country.");
            }
        }
    }
}
