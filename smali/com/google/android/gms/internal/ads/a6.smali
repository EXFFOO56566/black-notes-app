.class final Lcom/google/android/gms/internal/ads/a6;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/ln1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/ads/ln1<",
        "Lcom/google/android/gms/internal/ads/v5;",
        "Landroid/os/ParcelFileDescriptor;",
        ">;"
    }
.end annotation


# instance fields
.field private final synthetic a:Lcom/google/android/gms/internal/ads/p5;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/x5;Lcom/google/android/gms/internal/ads/p5;)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/a6;->a:Lcom/google/android/gms/internal/ads/p5;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/lo1;
    .locals 3

    check-cast p1, Lcom/google/android/gms/internal/ads/v5;

    new-instance v0, Lcom/google/android/gms/internal/ads/ro;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/ro;-><init>()V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/a6;->a:Lcom/google/android/gms/internal/ads/p5;

    new-instance v2, Lcom/google/android/gms/internal/ads/z5;

    invoke-direct {v2, p0, v0}, Lcom/google/android/gms/internal/ads/z5;-><init>(Lcom/google/android/gms/internal/ads/a6;Lcom/google/android/gms/internal/ads/ro;)V

    invoke-interface {p1, v1, v2}, Lcom/google/android/gms/internal/ads/v5;->a(Lcom/google/android/gms/internal/ads/p5;Lcom/google/android/gms/internal/ads/t5;)V

    return-object v0
.end method
