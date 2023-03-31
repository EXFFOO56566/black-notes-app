.class public final Lcom/google/android/gms/internal/ads/tc0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/r42;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/ads/r42<",
        "Landroid/view/View;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/fc0;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/ads/fc0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/tc0;->a:Lcom/google/android/gms/internal/ads/fc0;

    return-void
.end method

.method public static a(Lcom/google/android/gms/internal/ads/fc0;)Lcom/google/android/gms/internal/ads/tc0;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/tc0;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/tc0;-><init>(Lcom/google/android/gms/internal/ads/fc0;)V

    return-object v0
.end method


# virtual methods
.method public final synthetic get()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/tc0;->a:Lcom/google/android/gms/internal/ads/fc0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/fc0;->c()Landroid/view/View;

    move-result-object v0

    return-object v0
.end method
