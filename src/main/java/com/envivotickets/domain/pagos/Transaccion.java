
package com.envivotickets.domain.pagos;

public class Transaccion {
    private String authId;
    private String rawResponse;

    public Transaccion(String authId, String rawResponse) {
        this.authId = authId;
        this.rawResponse = rawResponse;
    }

    public String getAuthId() { return authId; }
    public String getRawResponse() { return rawResponse; }
}
