.class final synthetic Lcom/google/android/gms/internal/ads/q01;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/ln1;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/o01;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/o01;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/q01;->a:Lcom/google/android/gms/internal/ads/o01;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/lo1;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/q01;->a:Lcom/google/android/gms/internal/ads/o01;

    check-cast p1, Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/o01;->a(Ljava/util/ArrayList;)Lcom/google/android/gms/internal/ads/lo1;

    move-result-object p1

    return-object p1
.end method
