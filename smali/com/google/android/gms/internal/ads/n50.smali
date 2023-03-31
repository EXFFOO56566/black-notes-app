.class public final Lcom/google/android/gms/internal/ads/n50;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/r42;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/ads/r42<",
        "Lcom/google/android/gms/internal/ads/zd1;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/g50;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/ads/g50;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/n50;->a:Lcom/google/android/gms/internal/ads/g50;

    return-void
.end method

.method public static a(Lcom/google/android/gms/internal/ads/g50;)Lcom/google/android/gms/internal/ads/n50;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/n50;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/n50;-><init>(Lcom/google/android/gms/internal/ads/g50;)V

    return-object v0
.end method

.method public static b(Lcom/google/android/gms/internal/ads/g50;)Lcom/google/android/gms/internal/ads/zd1;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/g50;->b()Lcom/google/android/gms/internal/ads/zd1;

    move-result-object p0

    const-string v0, "Cannot return null from a non-@Nullable @Provides method"

    invoke-static {p0, v0}, Lcom/google/android/gms/internal/ads/y42;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    check-cast p0, Lcom/google/android/gms/internal/ads/zd1;

    return-object p0
.end method


# virtual methods
.method public final synthetic get()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/n50;->a:Lcom/google/android/gms/internal/ads/g50;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/n50;->b(Lcom/google/android/gms/internal/ads/g50;)Lcom/google/android/gms/internal/ads/zd1;

    move-result-object v0

    return-object v0
.end method
