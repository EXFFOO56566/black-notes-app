package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public final class io implements tn {

    /* renamed from: a  reason: collision with root package name */
    private final String f3119a;

    public io() {
        this(null);
    }

    public io(String str) {
        this.f3119a = str;
    }

    @Override // com.google.android.gms.internal.ads.tn
    public final void a(String str) {
        String sb;
        String message;
        StringBuilder sb2;
        try {
            String valueOf = String.valueOf(str);
            co.a(valueOf.length() != 0 ? "Pinging URL: ".concat(valueOf) : new String("Pinging URL: "));
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            try {
                on2.a();
                sn.a(true, httpURLConnection, this.f3119a);
                wn wnVar = new wn();
                wnVar.a(httpURLConnection, (byte[]) null);
                int responseCode = httpURLConnection.getResponseCode();
                wnVar.a(httpURLConnection, responseCode);
                if (responseCode < 200 || responseCode >= 300) {
                    StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 65);
                    sb3.append("Received non-success response code ");
                    sb3.append(responseCode);
                    sb3.append(" from pinging URL: ");
                    sb3.append(str);
                    co.d(sb3.toString());
                }
            } finally {
                httpURLConnection.disconnect();
            }
        } catch (IndexOutOfBoundsException e) {
            String message2 = e.getMessage();
            StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 32 + String.valueOf(message2).length());
            sb4.append("Error while parsing ping URL: ");
            sb4.append(str);
            sb4.append(". ");
            sb4.append(message2);
            sb = sb4.toString();
            co.d(sb);
        } catch (IOException e2) {
            message = e2.getMessage();
            sb2 = new StringBuilder(String.valueOf(str).length() + 27 + String.valueOf(message).length());
            sb2.append("Error while pinging URL: ");
            sb2.append(str);
            sb2.append(". ");
            sb2.append(message);
            sb = sb2.toString();
            co.d(sb);
        } catch (RuntimeException e3) {
            message = e3.getMessage();
            sb2 = new StringBuilder(String.valueOf(str).length() + 27 + String.valueOf(message).length());
            sb2.append("Error while pinging URL: ");
            sb2.append(str);
            sb2.append(". ");
            sb2.append(message);
            sb = sb2.toString();
            co.d(sb);
        }
    }
}
