package org.killbill.billing.plugin.tahseel.client.model;

public enum ErrorCodes {

    // DWOLLA TRANSFER STATUS VALUES
    // processed, pending, cancelled, failed, or reclaimed

    SUCCESS("Successful operation","I000000"),
    NOTFOUND("Wrong Type Code","E002001"),
    CANCELLED("cancelled","E999999"),
    FAILED("Unrecoverable error","E999998");
   // RECLAIMED("reclaimed","E777777");

    public final String status;
    public final String code;
    ErrorCodes(final String status, final String code) {
        this.status = status;
        this.code = code;
    }



   @Override
    public String toString() {
        return status;
    }
}