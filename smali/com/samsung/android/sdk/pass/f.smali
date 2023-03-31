.class final Lcom/samsung/android/sdk/pass/f;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private synthetic a:Lcom/samsung/android/sdk/pass/SpassFingerprint$c;

.field private final synthetic b:Lcom/samsung/android/fingerprint/FingerprintEvent;


# direct methods
.method constructor <init>(Lcom/samsung/android/sdk/pass/SpassFingerprint$c;Lcom/samsung/android/fingerprint/FingerprintEvent;)V
    .locals 0

    iput-object p1, p0, Lcom/samsung/android/sdk/pass/f;->a:Lcom/samsung/android/sdk/pass/SpassFingerprint$c;

    iput-object p2, p0, Lcom/samsung/android/sdk/pass/f;->b:Lcom/samsung/android/fingerprint/FingerprintEvent;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/samsung/android/sdk/pass/f;->a:Lcom/samsung/android/sdk/pass/SpassFingerprint$c;

    invoke-static {v0}, Lcom/samsung/android/sdk/pass/SpassFingerprint$c;->a(Lcom/samsung/android/sdk/pass/SpassFingerprint$c;)Lcom/samsung/android/sdk/pass/SpassFingerprint$IdentifyListener;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/samsung/android/sdk/pass/f;->b:Lcom/samsung/android/fingerprint/FingerprintEvent;

    iget v0, v0, Lcom/samsung/android/fingerprint/FingerprintEvent;->eventId:I

    const/16 v1, 0xb

    if-eq v0, v1, :cond_1

    const/16 v1, 0xc

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/samsung/android/sdk/pass/f;->a:Lcom/samsung/android/sdk/pass/SpassFingerprint$c;

    invoke-static {v0}, Lcom/samsung/android/sdk/pass/SpassFingerprint$c;->a(Lcom/samsung/android/sdk/pass/SpassFingerprint$c;)Lcom/samsung/android/sdk/pass/SpassFingerprint$IdentifyListener;

    move-result-object v0

    invoke-interface {v0}, Lcom/samsung/android/sdk/pass/SpassFingerprint$IdentifyListener;->onStarted()V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/samsung/android/sdk/pass/f;->a:Lcom/samsung/android/sdk/pass/SpassFingerprint$c;

    invoke-static {v0}, Lcom/samsung/android/sdk/pass/SpassFingerprint$c;->a(Lcom/samsung/android/sdk/pass/SpassFingerprint$c;)Lcom/samsung/android/sdk/pass/SpassFingerprint$IdentifyListener;

    move-result-object v0

    invoke-interface {v0}, Lcom/samsung/android/sdk/pass/SpassFingerprint$IdentifyListener;->onReady()V

    :cond_2
    :goto_0
    return-void
.end method
