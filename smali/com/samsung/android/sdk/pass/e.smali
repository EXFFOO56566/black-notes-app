.class final Lcom/samsung/android/sdk/pass/e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private synthetic a:Lcom/samsung/android/sdk/pass/SpassFingerprint$b;

.field private final synthetic b:Lcom/samsung/android/fingerprint/FingerprintEvent;

.field private final synthetic c:Lcom/samsung/android/sdk/pass/SpassFingerprint$IdentifyListener;


# direct methods
.method constructor <init>(Lcom/samsung/android/sdk/pass/SpassFingerprint$b;Lcom/samsung/android/fingerprint/FingerprintEvent;Lcom/samsung/android/sdk/pass/SpassFingerprint$IdentifyListener;)V
    .locals 0

    iput-object p1, p0, Lcom/samsung/android/sdk/pass/e;->a:Lcom/samsung/android/sdk/pass/SpassFingerprint$b;

    iput-object p2, p0, Lcom/samsung/android/sdk/pass/e;->b:Lcom/samsung/android/fingerprint/FingerprintEvent;

    iput-object p3, p0, Lcom/samsung/android/sdk/pass/e;->c:Lcom/samsung/android/sdk/pass/SpassFingerprint$IdentifyListener;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lcom/samsung/android/sdk/pass/e;->b:Lcom/samsung/android/fingerprint/FingerprintEvent;

    iget v0, v0, Lcom/samsung/android/fingerprint/FingerprintEvent;->eventId:I

    const/16 v1, 0x10

    if-eq v0, v1, :cond_1

    const v1, 0x186a0

    if-eq v0, v1, :cond_0

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    iget-object v0, p0, Lcom/samsung/android/sdk/pass/e;->a:Lcom/samsung/android/sdk/pass/SpassFingerprint$b;

    invoke-static {v0}, Lcom/samsung/android/sdk/pass/SpassFingerprint$b;->a(Lcom/samsung/android/sdk/pass/SpassFingerprint$b;)Lcom/samsung/android/sdk/pass/SpassFingerprint;

    move-result-object v0

    iget-object v1, p0, Lcom/samsung/android/sdk/pass/e;->c:Lcom/samsung/android/sdk/pass/SpassFingerprint$IdentifyListener;

    iget-object v2, p0, Lcom/samsung/android/sdk/pass/e;->b:Lcom/samsung/android/fingerprint/FingerprintEvent;

    const/4 v3, -0x1

    invoke-static {v0, v1, v2, v3}, Lcom/samsung/android/sdk/pass/SpassFingerprint;->a(Lcom/samsung/android/sdk/pass/SpassFingerprint;Lcom/samsung/android/sdk/pass/SpassFingerprint$IdentifyListener;Lcom/samsung/android/fingerprint/FingerprintEvent;I)V

    invoke-static {}, Lcom/samsung/android/sdk/pass/SpassFingerprint;->d()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/samsung/android/sdk/pass/e;->c:Lcom/samsung/android/sdk/pass/SpassFingerprint$IdentifyListener;

    invoke-interface {v0}, Lcom/samsung/android/sdk/pass/SpassFingerprint$IdentifyListener;->onCompleted()V

    return-void

    :pswitch_1
    iget-object v0, p0, Lcom/samsung/android/sdk/pass/e;->c:Lcom/samsung/android/sdk/pass/SpassFingerprint$IdentifyListener;

    invoke-interface {v0}, Lcom/samsung/android/sdk/pass/SpassFingerprint$IdentifyListener;->onStarted()V

    return-void

    :pswitch_2
    iget-object v0, p0, Lcom/samsung/android/sdk/pass/e;->c:Lcom/samsung/android/sdk/pass/SpassFingerprint$IdentifyListener;

    invoke-interface {v0}, Lcom/samsung/android/sdk/pass/SpassFingerprint$IdentifyListener;->onReady()V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/samsung/android/sdk/pass/e;->c:Lcom/samsung/android/sdk/pass/SpassFingerprint$IdentifyListener;

    const/4 v1, 0x7

    invoke-interface {v0, v1}, Lcom/samsung/android/sdk/pass/SpassFingerprint$IdentifyListener;->onFinished(I)V

    iget-object v0, p0, Lcom/samsung/android/sdk/pass/e;->c:Lcom/samsung/android/sdk/pass/SpassFingerprint$IdentifyListener;

    invoke-interface {v0}, Lcom/samsung/android/sdk/pass/SpassFingerprint$IdentifyListener;->onCompleted()V

    goto :goto_0

    :cond_1
    invoke-static {}, Lcom/samsung/android/sdk/pass/SpassFingerprint;->d()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/samsung/android/sdk/pass/e;->c:Lcom/samsung/android/sdk/pass/SpassFingerprint$IdentifyListener;

    invoke-interface {v0}, Lcom/samsung/android/sdk/pass/SpassFingerprint$IdentifyListener;->onCompleted()V

    :cond_2
    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0xb
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
