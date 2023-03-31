.class final Lcom/samsung/android/sdk/pass/g;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private synthetic a:Lcom/samsung/android/sdk/pass/SpassFingerprint$c;

.field private final synthetic b:Lcom/samsung/android/fingerprint/FingerprintEvent;

.field private final synthetic c:Lcom/samsung/android/sdk/pass/SpassFingerprint$IdentifyListener;


# direct methods
.method constructor <init>(Lcom/samsung/android/sdk/pass/SpassFingerprint$c;Lcom/samsung/android/fingerprint/FingerprintEvent;Lcom/samsung/android/sdk/pass/SpassFingerprint$IdentifyListener;)V
    .locals 0

    iput-object p1, p0, Lcom/samsung/android/sdk/pass/g;->a:Lcom/samsung/android/sdk/pass/SpassFingerprint$c;

    iput-object p2, p0, Lcom/samsung/android/sdk/pass/g;->b:Lcom/samsung/android/fingerprint/FingerprintEvent;

    iput-object p3, p0, Lcom/samsung/android/sdk/pass/g;->c:Lcom/samsung/android/sdk/pass/SpassFingerprint$IdentifyListener;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lcom/samsung/android/sdk/pass/g;->b:Lcom/samsung/android/fingerprint/FingerprintEvent;

    iget v0, v0, Lcom/samsung/android/fingerprint/FingerprintEvent;->eventId:I

    const/16 v1, 0xd

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/samsung/android/sdk/pass/g;->a:Lcom/samsung/android/sdk/pass/SpassFingerprint$c;

    invoke-static {v0}, Lcom/samsung/android/sdk/pass/SpassFingerprint$c;->b(Lcom/samsung/android/sdk/pass/SpassFingerprint$c;)Lcom/samsung/android/sdk/pass/SpassFingerprint;

    move-result-object v0

    iget-object v1, p0, Lcom/samsung/android/sdk/pass/g;->c:Lcom/samsung/android/sdk/pass/SpassFingerprint$IdentifyListener;

    iget-object v2, p0, Lcom/samsung/android/sdk/pass/g;->b:Lcom/samsung/android/fingerprint/FingerprintEvent;

    const/4 v3, -0x1

    invoke-static {v0, v1, v2, v3}, Lcom/samsung/android/sdk/pass/SpassFingerprint;->a(Lcom/samsung/android/sdk/pass/SpassFingerprint;Lcom/samsung/android/sdk/pass/SpassFingerprint$IdentifyListener;Lcom/samsung/android/fingerprint/FingerprintEvent;I)V

    iget-object v0, p0, Lcom/samsung/android/sdk/pass/g;->c:Lcom/samsung/android/sdk/pass/SpassFingerprint$IdentifyListener;

    invoke-interface {v0}, Lcom/samsung/android/sdk/pass/SpassFingerprint$IdentifyListener;->onCompleted()V

    :cond_0
    return-void
.end method
