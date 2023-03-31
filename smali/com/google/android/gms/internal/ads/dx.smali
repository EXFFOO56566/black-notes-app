.class final Lcom/google/android/gms/internal/ads/dx;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/zc1;


# instance fields
.field private a:Landroid/content/Context;

.field private b:Ljava/lang/String;

.field private final synthetic c:Lcom/google/android/gms/internal/ads/iw;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/ads/iw;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/dx;->c:Lcom/google/android/gms/internal/ads/iw;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/ads/iw;Lcom/google/android/gms/internal/ads/hw;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/dx;-><init>(Lcom/google/android/gms/internal/ads/iw;)V

    return-void
.end method


# virtual methods
.method public final a()Lcom/google/android/gms/internal/ads/ad1;
    .locals 5

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/dx;->a:Landroid/content/Context;

    const-class v1, Landroid/content/Context;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/y42;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    new-instance v0, Lcom/google/android/gms/internal/ads/cx;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/dx;->c:Lcom/google/android/gms/internal/ads/iw;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/dx;->a:Landroid/content/Context;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/dx;->b:Ljava/lang/String;

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/google/android/gms/internal/ads/cx;-><init>(Lcom/google/android/gms/internal/ads/iw;Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/internal/ads/hw;)V

    return-object v0
.end method

.method public final synthetic a(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/zc1;
    .locals 0

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/y42;->a(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p1, Landroid/content/Context;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/dx;->a:Landroid/content/Context;

    return-object p0
.end method

.method public final synthetic a(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zc1;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/dx;->b:Ljava/lang/String;

    return-object p0
.end method
