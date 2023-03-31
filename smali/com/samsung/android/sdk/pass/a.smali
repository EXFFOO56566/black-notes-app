.class final Lcom/samsung/android/sdk/pass/a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private synthetic a:Lcom/samsung/android/sdk/pass/SpassFingerprint;

.field private final synthetic b:Lcom/samsung/android/sdk/pass/SpassFingerprint$IdentifyListener;


# direct methods
.method constructor <init>(Lcom/samsung/android/sdk/pass/SpassFingerprint;Lcom/samsung/android/sdk/pass/SpassFingerprint$IdentifyListener;)V
    .locals 0

    iput-object p1, p0, Lcom/samsung/android/sdk/pass/a;->a:Lcom/samsung/android/sdk/pass/SpassFingerprint;

    iput-object p2, p0, Lcom/samsung/android/sdk/pass/a;->b:Lcom/samsung/android/sdk/pass/SpassFingerprint$IdentifyListener;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lcom/samsung/android/sdk/pass/a;->a:Lcom/samsung/android/sdk/pass/SpassFingerprint;

    iget-object v1, p0, Lcom/samsung/android/sdk/pass/a;->b:Lcom/samsung/android/sdk/pass/SpassFingerprint$IdentifyListener;

    const/4 v2, 0x0

    const/16 v3, 0x8

    invoke-static {v0, v1, v2, v3}, Lcom/samsung/android/sdk/pass/SpassFingerprint;->a(Lcom/samsung/android/sdk/pass/SpassFingerprint;Lcom/samsung/android/sdk/pass/SpassFingerprint$IdentifyListener;Lcom/samsung/android/fingerprint/FingerprintEvent;I)V

    iget-object v0, p0, Lcom/samsung/android/sdk/pass/a;->b:Lcom/samsung/android/sdk/pass/SpassFingerprint$IdentifyListener;

    invoke-interface {v0}, Lcom/samsung/android/sdk/pass/SpassFingerprint$IdentifyListener;->onCompleted()V

    return-void
.end method
