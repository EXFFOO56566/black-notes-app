package com.google.android.gms.internal.ads;

import java.io.IOException;

public class b02 extends IOException {
    public b02(String str) {
        super(str);
    }

    static b02 a() {
        return new b02("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static b02 b() {
        return new b02("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static b02 c() {
        return new b02("CodedInputStream encountered a malformed varint.");
    }

    static b02 d() {
        return new b02("Protocol message contained an invalid tag (zero).");
    }

    static b02 e() {
        return new b02("Protocol message end-group tag did not match expected tag.");
    }

    static a02 f() {
        return new a02("Protocol message tag had invalid wire type.");
    }

    static b02 g() {
        return new b02("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    static b02 h() {
        return new b02("Failed to parse the message.");
    }

    static b02 i() {
        return new b02("Protocol message had invalid UTF-8.");
    }

    public final b02 a(c12 c12) {
        return this;
    }
}
