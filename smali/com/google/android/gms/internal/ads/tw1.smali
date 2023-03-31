.class public final Lcom/google/android/gms/internal/ads/tw1;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T_WRAPPER::",
        "Lcom/google/android/gms/internal/ads/sw1<",
        "TT_ENGINE;>;T_ENGINE:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# static fields
.field private static final d:Ljava/util/logging/Logger;

.field private static final e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/security/Provider;",
            ">;"
        }
    .end annotation
.end field

.field public static final f:Lcom/google/android/gms/internal/ads/tw1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/tw1<",
            "Lcom/google/android/gms/internal/ads/vw1;",
            "Ljavax/crypto/Cipher;",
            ">;"
        }
    .end annotation
.end field

.field public static final g:Lcom/google/android/gms/internal/ads/tw1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/tw1<",
            "Lcom/google/android/gms/internal/ads/zw1;",
            "Ljavax/crypto/Mac;",
            ">;"
        }
    .end annotation
.end field

.field public static final h:Lcom/google/android/gms/internal/ads/tw1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/tw1<",
            "Lcom/google/android/gms/internal/ads/uw1;",
            "Ljavax/crypto/KeyAgreement;",
            ">;"
        }
    .end annotation
.end field

.field public static final i:Lcom/google/android/gms/internal/ads/tw1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/tw1<",
            "Lcom/google/android/gms/internal/ads/ww1;",
            "Ljava/security/KeyPairGenerator;",
            ">;"
        }
    .end annotation
.end field

.field public static final j:Lcom/google/android/gms/internal/ads/tw1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/tw1<",
            "Lcom/google/android/gms/internal/ads/xw1;",
            "Ljava/security/KeyFactory;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private a:Lcom/google/android/gms/internal/ads/sw1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT_WRAPPER;"
        }
    .end annotation
.end field

.field private b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/security/Provider;",
            ">;"
        }
    .end annotation
.end field

.field private c:Z


# direct methods
.method static constructor <clinit>()V
    .locals 9

    const-class v0, Lcom/google/android/gms/internal/ads/tw1;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ads/tw1;->d:Ljava/util/logging/Logger;

    invoke-static {}, Lcom/google/android/gms/internal/ads/gx1;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "GmsCore_OpenSSL"

    const-string v1, "AndroidOpenSSL"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    const/4 v4, 0x2

    if-ge v3, v4, :cond_1

    aget-object v4, v0, v3

    invoke-static {v4}, Ljava/security/Security;->getProvider(Ljava/lang/String;)Ljava/security/Provider;

    move-result-object v5

    if-eqz v5, :cond_0

    invoke-interface {v1, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_0
    sget-object v5, Lcom/google/android/gms/internal/ads/tw1;->d:Ljava/util/logging/Logger;

    sget-object v6, Ljava/util/logging/Level;->INFO:Ljava/util/logging/Level;

    const/4 v7, 0x1

    new-array v7, v7, [Ljava/lang/Object;

    aput-object v4, v7, v2

    const-string v4, "Provider %s not available"

    invoke-static {v4, v7}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    const-string v7, "com.google.crypto.tink.subtle.EngineFactory"

    const-string v8, "toProviderList"

    invoke-virtual {v5, v6, v7, v8, v4}, Ljava/util/logging/Logger;->logp(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    sput-object v1, Lcom/google/android/gms/internal/ads/tw1;->e:Ljava/util/List;

    goto :goto_2

    :cond_2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/tw1;->e:Ljava/util/List;

    :goto_2
    new-instance v0, Lcom/google/android/gms/internal/ads/tw1;

    new-instance v1, Lcom/google/android/gms/internal/ads/vw1;

    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/vw1;-><init>()V

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/tw1;-><init>(Lcom/google/android/gms/internal/ads/sw1;)V

    sput-object v0, Lcom/google/android/gms/internal/ads/tw1;->f:Lcom/google/android/gms/internal/ads/tw1;

    new-instance v0, Lcom/google/android/gms/internal/ads/tw1;

    new-instance v1, Lcom/google/android/gms/internal/ads/zw1;

    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/zw1;-><init>()V

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/tw1;-><init>(Lcom/google/android/gms/internal/ads/sw1;)V

    sput-object v0, Lcom/google/android/gms/internal/ads/tw1;->g:Lcom/google/android/gms/internal/ads/tw1;

    new-instance v0, Lcom/google/android/gms/internal/ads/tw1;

    new-instance v1, Lcom/google/android/gms/internal/ads/bx1;

    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/bx1;-><init>()V

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/tw1;-><init>(Lcom/google/android/gms/internal/ads/sw1;)V

    new-instance v0, Lcom/google/android/gms/internal/ads/tw1;

    new-instance v1, Lcom/google/android/gms/internal/ads/yw1;

    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/yw1;-><init>()V

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/tw1;-><init>(Lcom/google/android/gms/internal/ads/sw1;)V

    new-instance v0, Lcom/google/android/gms/internal/ads/tw1;

    new-instance v1, Lcom/google/android/gms/internal/ads/uw1;

    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/uw1;-><init>()V

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/tw1;-><init>(Lcom/google/android/gms/internal/ads/sw1;)V

    sput-object v0, Lcom/google/android/gms/internal/ads/tw1;->h:Lcom/google/android/gms/internal/ads/tw1;

    new-instance v0, Lcom/google/android/gms/internal/ads/tw1;

    new-instance v1, Lcom/google/android/gms/internal/ads/ww1;

    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/ww1;-><init>()V

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/tw1;-><init>(Lcom/google/android/gms/internal/ads/sw1;)V

    sput-object v0, Lcom/google/android/gms/internal/ads/tw1;->i:Lcom/google/android/gms/internal/ads/tw1;

    new-instance v0, Lcom/google/android/gms/internal/ads/tw1;

    new-instance v1, Lcom/google/android/gms/internal/ads/xw1;

    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/xw1;-><init>()V

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/tw1;-><init>(Lcom/google/android/gms/internal/ads/sw1;)V

    sput-object v0, Lcom/google/android/gms/internal/ads/tw1;->j:Lcom/google/android/gms/internal/ads/tw1;

    return-void
.end method

.method private constructor <init>(Lcom/google/android/gms/internal/ads/sw1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT_WRAPPER;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/tw1;->a:Lcom/google/android/gms/internal/ads/sw1;

    sget-object p1, Lcom/google/android/gms/internal/ads/tw1;->e:Ljava/util/List;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/tw1;->b:Ljava/util/List;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/tw1;->c:Z

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")TT_ENGINE;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/tw1;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    move-object v2, v1

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/security/Provider;

    :try_start_0
    iget-object v4, p0, Lcom/google/android/gms/internal/ads/tw1;->a:Lcom/google/android/gms/internal/ads/sw1;

    invoke-interface {v4, p1, v3}, Lcom/google/android/gms/internal/ads/sw1;->a(Ljava/lang/String;Ljava/security/Provider;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception v3

    if-nez v2, :cond_0

    move-object v2, v3

    goto :goto_0

    :cond_1
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/tw1;->c:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/tw1;->a:Lcom/google/android/gms/internal/ads/sw1;

    invoke-interface {v0, p1, v1}, Lcom/google/android/gms/internal/ads/sw1;->a(Ljava/lang/String;Ljava/security/Provider;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_2
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "No good Provider found."

    invoke-direct {p1, v0, v2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1
.end method
