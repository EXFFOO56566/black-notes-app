package com.google.android.gms.internal.ads;

import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.SSLSocketFactory;

/* access modifiers changed from: package-private */
public final class ar extends SSLSocketFactory {

    /* renamed from: a  reason: collision with root package name */
    private SSLSocketFactory f1804a = ((SSLSocketFactory) SSLSocketFactory.getDefault());

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ xq f1805b;

    ar(xq xqVar) {
        this.f1805b = xqVar;
    }

    private final Socket a(Socket socket) {
        if (this.f1805b.o > 0) {
            socket.setReceiveBufferSize(this.f1805b.o);
        }
        this.f1805b.a((xq) socket);
        return socket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i) {
        Socket createSocket = this.f1804a.createSocket(str, i);
        a(createSocket);
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) {
        Socket createSocket = this.f1804a.createSocket(str, i, inetAddress, i2);
        a(createSocket);
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i) {
        Socket createSocket = this.f1804a.createSocket(inetAddress, i);
        a(createSocket);
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        Socket createSocket = this.f1804a.createSocket(inetAddress, i, inetAddress2, i2);
        a(createSocket);
        return createSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final Socket createSocket(Socket socket, String str, int i, boolean z) {
        Socket createSocket = this.f1804a.createSocket(socket, str, i, z);
        a(createSocket);
        return createSocket;
    }

    public final String[] getDefaultCipherSuites() {
        return this.f1804a.getDefaultCipherSuites();
    }

    public final String[] getSupportedCipherSuites() {
        return this.f1804a.getSupportedCipherSuites();
    }
}
