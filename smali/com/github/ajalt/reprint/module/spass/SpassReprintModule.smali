.class public Lcom/github/ajalt/reprint/module/spass/SpassReprintModule;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lb/b/a/b/a/e;


# static fields
.field public static final STATUS_AUTHENTICATION_FAILED:I = 0x10

.field public static final STATUS_AUTHENTICATION_SUCCESS:I = 0x0

.field public static final STATUS_HW_UNAVAILABLE:I = 0x3ea

.field public static final STATUS_LOCKED_OUT:I = 0x3eb

.field public static final STATUS_NO_REGISTERED_FINGERPRINTS:I = 0x3e9

.field public static final STATUS_QUALITY_FAILED:I = 0xc

.field public static final STATUS_SENSOR_FAILED:I = 0x7

.field public static final STATUS_TIMEOUT_FAILED:I = 0x4

.field public static final STATUS_USER_CANCELLED:I = 0x8

.field public static final TAG:I = 0x2


# instance fields
.field private final context:Landroid/content/Context;

.field private final logger:Lb/b/a/b/a/c$a;

.field private final spass:Lcom/samsung/android/sdk/pass/Spass;

.field private spassFingerprint:Lcom/samsung/android/sdk/pass/SpassFingerprint;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lb/b/a/b/a/c$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lcom/github/ajalt/reprint/module/spass/SpassReprintModule;->context:Landroid/content/Context;

    iput-object p2, p0, Lcom/github/ajalt/reprint/module/spass/SpassReprintModule;->logger:Lb/b/a/b/a/c$a;

    :try_start_0
    new-instance p1, Lcom/samsung/android/sdk/pass/Spass;

    invoke-direct {p1}, Lcom/samsung/android/sdk/pass/Spass;-><init>()V

    iget-object p2, p0, Lcom/github/ajalt/reprint/module/spass/SpassReprintModule;->context:Landroid/content/Context;

    invoke-virtual {p1, p2}, Lcom/samsung/android/sdk/pass/Spass;->initialize(Landroid/content/Context;)V
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 p1, 0x0

    :goto_0
    iput-object p1, p0, Lcom/github/ajalt/reprint/module/spass/SpassReprintModule;->spass:Lcom/samsung/android/sdk/pass/Spass;

    return-void

    :catch_1
    move-exception p1

    throw p1
.end method

.method static synthetic access$000(Lcom/github/ajalt/reprint/module/spass/SpassReprintModule;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lcom/github/ajalt/reprint/module/spass/SpassReprintModule;->context:Landroid/content/Context;

    return-object p0
.end method

.method static synthetic access$100(Lcom/github/ajalt/reprint/module/spass/SpassReprintModule;La/g/h/a;Lb/b/a/b/a/b;Lb/b/a/b/a/c$b;I)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/github/ajalt/reprint/module/spass/SpassReprintModule;->authenticate(La/g/h/a;Lb/b/a/b/a/b;Lb/b/a/b/a/c$b;I)V

    return-void
.end method

.method static synthetic access$200(Lcom/github/ajalt/reprint/module/spass/SpassReprintModule;)Lcom/samsung/android/sdk/pass/SpassFingerprint;
    .locals 0

    iget-object p0, p0, Lcom/github/ajalt/reprint/module/spass/SpassReprintModule;->spassFingerprint:Lcom/samsung/android/sdk/pass/SpassFingerprint;

    return-object p0
.end method

.method static synthetic access$300(Lcom/samsung/android/sdk/pass/SpassFingerprint;)V
    .locals 0

    invoke-static {p0}, Lcom/github/ajalt/reprint/module/spass/SpassReprintModule;->cancelFingerprintRequest(Lcom/samsung/android/sdk/pass/SpassFingerprint;)V

    return-void
.end method

.method private authenticate(La/g/h/a;Lb/b/a/b/a/b;Lb/b/a/b/a/c$b;I)V
    .locals 14

    move-object v7, p0

    iget-object v0, v7, Lcom/github/ajalt/reprint/module/spass/SpassReprintModule;->spassFingerprint:Lcom/samsung/android/sdk/pass/SpassFingerprint;

    if-nez v0, :cond_0

    new-instance v0, Lcom/samsung/android/sdk/pass/SpassFingerprint;

    iget-object v1, v7, Lcom/github/ajalt/reprint/module/spass/SpassReprintModule;->context:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/samsung/android/sdk/pass/SpassFingerprint;-><init>(Landroid/content/Context;)V

    iput-object v0, v7, Lcom/github/ajalt/reprint/module/spass/SpassReprintModule;->spassFingerprint:Lcom/samsung/android/sdk/pass/SpassFingerprint;

    :cond_0
    :try_start_0
    iget-object v0, v7, Lcom/github/ajalt/reprint/module/spass/SpassReprintModule;->spassFingerprint:Lcom/samsung/android/sdk/pass/SpassFingerprint;

    invoke-virtual {v0}, Lcom/samsung/android/sdk/pass/SpassFingerprint;->hasRegisteredFinger()Z

    move-result v0

    if-nez v0, :cond_1

    sget-object v2, Lb/b/a/b/a/a;->d:Lb/b/a/b/a/a;

    const/4 v3, 0x1

    iget-object v0, v7, Lcom/github/ajalt/reprint/module/spass/SpassReprintModule;->context:Landroid/content/Context;

    sget v1, Lcom/github/ajalt/reprint/module/spass/R$string;->fingerprint_error_hw_not_available:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x2

    const/16 v6, 0x3e9

    move-object/from16 v1, p2

    invoke-interface/range {v1 .. v6}, Lb/b/a/b/a/b;->a(Lb/b/a/b/a/a;ZLjava/lang/CharSequence;II)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    return-void

    :cond_1
    iget-object v0, v7, Lcom/github/ajalt/reprint/module/spass/SpassReprintModule;->spassFingerprint:Lcom/samsung/android/sdk/pass/SpassFingerprint;

    invoke-static {v0}, Lcom/github/ajalt/reprint/module/spass/SpassReprintModule;->cancelFingerprintRequest(Lcom/samsung/android/sdk/pass/SpassFingerprint;)V

    :try_start_1
    iget-object v0, v7, Lcom/github/ajalt/reprint/module/spass/SpassReprintModule;->spassFingerprint:Lcom/samsung/android/sdk/pass/SpassFingerprint;

    new-instance v8, Lcom/github/ajalt/reprint/module/spass/SpassReprintModule$1;

    move-object v1, v8

    move-object v2, p0

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move/from16 v5, p4

    move-object v6, p1

    invoke-direct/range {v1 .. v6}, Lcom/github/ajalt/reprint/module/spass/SpassReprintModule$1;-><init>(Lcom/github/ajalt/reprint/module/spass/SpassReprintModule;Lb/b/a/b/a/b;Lb/b/a/b/a/c$b;ILa/g/h/a;)V

    invoke-virtual {v0, v8}, Lcom/samsung/android/sdk/pass/SpassFingerprint;->startIdentify(Lcom/samsung/android/sdk/pass/SpassFingerprint$IdentifyListener;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    new-instance v0, Lcom/github/ajalt/reprint/module/spass/SpassReprintModule$2;

    invoke-direct {v0, p0}, Lcom/github/ajalt/reprint/module/spass/SpassReprintModule$2;-><init>(Lcom/github/ajalt/reprint/module/spass/SpassReprintModule;)V

    move-object v1, p1

    invoke-virtual {p1, v0}, La/g/h/a;->a(La/g/h/a$a;)V

    return-void

    :catchall_0
    move-exception v0

    iget-object v1, v7, Lcom/github/ajalt/reprint/module/spass/SpassReprintModule;->logger:Lb/b/a/b/a/c$a;

    const-string v2, "SpassReprintModule: fingerprint identification would not start"

    invoke-interface {v1, v0, v2}, Lb/b/a/b/a/c$a;->a(Ljava/lang/Throwable;Ljava/lang/String;)V

    sget-object v9, Lb/b/a/b/a/a;->f:Lb/b/a/b/a/a;

    const/4 v10, 0x1

    const/4 v11, 0x0

    const/4 v12, 0x2

    const/16 v13, 0x3eb

    move-object/from16 v8, p2

    invoke-interface/range {v8 .. v13}, Lb/b/a/b/a/b;->a(Lb/b/a/b/a/a;ZLjava/lang/CharSequence;II)V

    return-void

    :catchall_1
    sget-object v1, Lb/b/a/b/a/a;->c:Lb/b/a/b/a/a;

    const/4 v2, 0x1

    iget-object v0, v7, Lcom/github/ajalt/reprint/module/spass/SpassReprintModule;->context:Landroid/content/Context;

    sget v3, Lcom/github/ajalt/reprint/module/spass/R$string;->fingerprint_error_hw_not_available:I

    invoke-virtual {v0, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x2

    const/16 v5, 0x3ea

    move-object/from16 v0, p2

    invoke-interface/range {v0 .. v5}, Lb/b/a/b/a/b;->a(Lb/b/a/b/a/a;ZLjava/lang/CharSequence;II)V

    return-void
.end method

.method private static cancelFingerprintRequest(Lcom/samsung/android/sdk/pass/SpassFingerprint;)V
    .locals 0

    :try_start_0
    invoke-virtual {p0}, Lcom/samsung/android/sdk/pass/SpassFingerprint;->cancelIdentify()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method


# virtual methods
.method public authenticate(La/g/h/a;Lb/b/a/b/a/b;Lb/b/a/b/a/c$b;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, p3, v0}, Lcom/github/ajalt/reprint/module/spass/SpassReprintModule;->authenticate(La/g/h/a;Lb/b/a/b/a/b;Lb/b/a/b/a/c$b;I)V

    return-void
.end method

.method public hasFingerprintRegistered()Z
    .locals 2

    :try_start_0
    invoke-virtual {p0}, Lcom/github/ajalt/reprint/module/spass/SpassReprintModule;->isHardwarePresent()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/github/ajalt/reprint/module/spass/SpassReprintModule;->spassFingerprint:Lcom/samsung/android/sdk/pass/SpassFingerprint;

    if-nez v0, :cond_0

    new-instance v0, Lcom/samsung/android/sdk/pass/SpassFingerprint;

    iget-object v1, p0, Lcom/github/ajalt/reprint/module/spass/SpassReprintModule;->context:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/samsung/android/sdk/pass/SpassFingerprint;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/github/ajalt/reprint/module/spass/SpassReprintModule;->spassFingerprint:Lcom/samsung/android/sdk/pass/SpassFingerprint;

    :cond_0
    iget-object v0, p0, Lcom/github/ajalt/reprint/module/spass/SpassReprintModule;->spassFingerprint:Lcom/samsung/android/sdk/pass/SpassFingerprint;

    invoke-virtual {v0}, Lcom/samsung/android/sdk/pass/SpassFingerprint;->hasRegisteredFinger()Z

    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public isHardwarePresent()Z
    .locals 2

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lcom/github/ajalt/reprint/module/spass/SpassReprintModule;->spass:Lcom/samsung/android/sdk/pass/Spass;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/github/ajalt/reprint/module/spass/SpassReprintModule;->spass:Lcom/samsung/android/sdk/pass/Spass;

    invoke-virtual {v1, v0}, Lcom/samsung/android/sdk/pass/Spass;->isFeatureEnabled(I)Z

    move-result v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v1, :cond_0

    const/4 v0, 0x1

    :catch_0
    :cond_0
    return v0
.end method

.method public tag()I
    .locals 1

    const/4 v0, 0x2

    return v0
.end method
