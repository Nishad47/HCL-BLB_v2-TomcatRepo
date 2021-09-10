package com.hcl.capstoneserver.user.dto.views;

public class ClientDataViewDTO {
    private String clientId;
    private String name;

    public ClientDataViewDTO() {
    }

    public ClientDataViewDTO(String clientId, String name) {
        this.clientId = clientId;
        this.name = name;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
