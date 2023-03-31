.class public Lcom/samsung/android/sdk/pass/Spass;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/samsung/android/sdk/SsdkInterface;


# static fields
.field public static final DEVICE_FINGERPRINT:I = 0x0

.field public static final DEVICE_FINGERPRINT_AVAILABLE_PASSWORD:I = 0x4

.field public static final DEVICE_FINGERPRINT_CUSTOMIZED_DIALOG:I = 0x2

.field public static final DEVICE_FINGERPRINT_FINGER_INDEX:I = 0x1

.field public static final DEVICE_FINGERPRINT_UNIQUE_ID:I = 0x3

.field private static a:Z = false

.field private static b:Z = false

.field private static c:Z = false

.field private static d:Z = false


# instance fields
.field private e:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getVersionCode()I
    .locals 1

    const/16 v0, 0xc

    return v0
.end method

.method public getVersionName()Ljava/lang/String;
    .locals 1

    const-string v0, "1.2.6"

    return-object v0
.end method

.method public initialize(Landroid/content/Context;)V
    .locals 2

    iget-object v0, p0, Lcom/samsung/android/sdk/pass/Spass;->e:Landroid/content/Context;

    if-eqz v0, :cond_0

    return-void

    :cond_0
    if-eqz p1, :cond_3

    invoke-static {}, Lcom/samsung/android/sdk/SsdkVendorCheck;->isSamsungDevice()Z

    move-result v0

    if-eqz v0, :cond_2

    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const-string v1, "com.sec.feature.fingerprint_manager_service"

    invoke-virtual {v0, v1}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    move-result v0

    sput-boolean v0, Lcom/samsung/android/sdk/pass/Spass;->a:Z
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v0, :cond_1

    new-instance v0, Lcom/samsung/android/sdk/pass/SpassFingerprint;

    invoke-direct {v0, p1}, Lcom/samsung/android/sdk/pass/SpassFingerprint;-><init>(Landroid/content/Context;)V

    invoke-static {}, Lcom/samsung/android/sdk/pass/SpassFingerprint;->a()Z

    move-result v1

    sput-boolean v1, Lcom/samsung/android/sdk/pass/Spass;->c:Z

    invoke-virtual {v0}, Lcom/samsung/android/sdk/pass/SpassFingerprint;->b()Z

    move-result v1

    sput-boolean v1, Lcom/samsung/android/sdk/pass/Spass;->b:Z

    invoke-virtual {v0}, Lcom/samsung/android/sdk/pass/SpassFingerprint;->c()Z

    move-result v0

    sput-boolean v0, Lcom/samsung/android/sdk/pass/Spass;->d:Z

    iput-object p1, p0, Lcom/samsung/android/sdk/pass/Spass;->e:Landroid/content/Context;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "initialize : BP="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-boolean v1, Lcom/samsung/android/sdk/pass/Spass;->d:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ",CD="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-boolean v1, Lcom/samsung/android/sdk/pass/Spass;->c:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ",ID="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-boolean v1, Lcom/samsung/android/sdk/pass/Spass;->b:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ",GT=false"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "SpassFingerprintSDK"

    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/samsung/android/sdk/pass/SpassFingerprint;->a(Landroid/content/Context;Ljava/lang/String;)V

    return-void

    :cond_1
    new-instance p1, Lcom/samsung/android/sdk/SsdkUnsupportedException;

    const/4 v0, 0x1

    const-string v1, "This device does not provide FingerprintService."

    invoke-direct {p1, v1, v0}, Lcom/samsung/android/sdk/SsdkUnsupportedException;-><init>(Ljava/lang/String;I)V

    throw p1

    :catch_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "context is not valid."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p1, Lcom/samsung/android/sdk/SsdkUnsupportedException;

    const/4 v0, 0x0

    const-string v1, "This is not Samsung device."

    invoke-direct {p1, v1, v0}, Lcom/samsung/android/sdk/SsdkUnsupportedException;-><init>(Ljava/lang/String;I)V

    throw p1

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "context passed is null."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public isFeatureEnabled(I)Z
    .locals 1

    iget-object v0, p0, Lcom/samsung/android/sdk/pass/Spass;->e:Landroid/content/Context;

    if-eqz v0, :cond_4

    if-eqz p1, :cond_3

    const/4 v0, 0x1

    if-eq p1, v0, :cond_2

    const/4 v0, 0x2

    if-eq p1, v0, :cond_2

    const/4 v0, 0x3

    if-eq p1, v0, :cond_1

    const/4 v0, 0x4

    if-ne p1, v0, :cond_0

    sget-boolean p1, Lcom/samsung/android/sdk/pass/Spass;->d:Z

    return p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "type passed is not valid"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    sget-boolean p1, Lcom/samsung/android/sdk/pass/Spass;->b:Z

    return p1

    :cond_2
    sget-boolean p1, Lcom/samsung/android/sdk/pass/Spass;->c:Z

    return p1

    :cond_3
    sget-boolean p1, Lcom/samsung/android/sdk/pass/Spass;->a:Z

    return p1

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "initialize() is not Called first."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
